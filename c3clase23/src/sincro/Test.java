package sincro;

public class Test {
    public static void main(String[] args) {

        //Creo curso FrontEnd
        OfertaAcademica frontEnd = OfertaAcademicaFactory.getInstance().crearOfertaAcademica("Curso");
        //cargar datos del curso fronEnd
        frontEnd.setNombre("FrontEnd");
        frontEnd.setDescripcion("FrontEnd");
        ((Curso) frontEnd).setCantidadMeses(2);
        ((Curso) frontEnd).setValorHora(1000);
        ((Curso) frontEnd).setCargaHorariaMensual(16);

        //Creo curso BackEnd
        OfertaAcademica backEnd = OfertaAcademicaFactory.getInstance().crearOfertaAcademica("Curso");
        //cargar datos del curso backEnd
        backEnd.setNombre("BackEnd");
        backEnd.setDescripcion("BackEnd");
        ((Curso) backEnd).setCantidadMeses(2);
        ((Curso) backEnd).setValorHora(2000);
        ((Curso) backEnd).setCargaHorariaMensual(8);

        //Creo ProgramaIntensivo techDeveloper

        OfertaAcademica techDeveloper = OfertaAcademicaFactory.getInstance().crearOfertaAcademica("ProgramaIntensivo");
        techDeveloper.setNombre("Certified Tech");
        techDeveloper.setDescripcion("Certified Tech");
        ((ProgramaIntensivo) techDeveloper).setPorcentajeBonificacion(0.1);

        //Agrego cursos frontEnd y backEnd a techDeveloper
        ((ProgramaIntensivo) techDeveloper).agregar(frontEnd);
        ((ProgramaIntensivo) techDeveloper).agregar(backEnd);
        //System.out.println(techDeveloper.getNombre() + " ---> con precio: " + techDeveloper.calcularPrecio());

        //Creacion de un taller
        OfertaAcademica taller1 = OfertaAcademicaFactory.getInstance().crearOfertaAcademica("Taller");
        taller1.setNombre("Soft Skills");
        taller1.setDescripcion("Soft Skills");
        ((Taller) taller1).setCantidadTrabajosPracticos(10);
        ((Taller) taller1).setPrecioTrabajoPractico(223);

        //Creacion de una carrera
        OfertaAcademica carreraSistemas = OfertaAcademicaFactory.getInstance().crearOfertaAcademica("Carrera");
        carreraSistemas.setNombre("Ingeniería de Sistemas");
        carreraSistemas.setDescripcion("Ingeniería de Sistemas");
        ((Carrera) carreraSistemas).setPrecioBasico(1000);
        try {
            ((Carrera) carreraSistemas).agregar(taller1);
        } catch (Exception error) {
            System.err.println(error);
        }
        try {
            ((Carrera) carreraSistemas).agregar(frontEnd);
        } catch (Exception error) {
            System.err.println(error);
        }
        try {
            ((Carrera)carreraSistemas).agregar(backEnd); //Con esta línea salta excepción puesto que no se puede agregar un curso con menos de 10 horas a una carrera
        } catch (Exception error) {
            System.err.println(error);
        }
        //System.out.println(carreraSistemas.getNombre() + " ---> con precio: " + carreraSistemas.calcularPrecio());


        //Creacion del instituto y adición del programa intensivo techDeveloper y la carrera carreraSistemas
        Instituto inst = new Instituto("Digital House");
        inst.agregar(techDeveloper);
        inst.agregar(carreraSistemas);
        inst.generarInforme();


    }
}
