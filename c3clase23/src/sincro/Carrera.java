package sincro;

import java.util.ArrayList;
import java.util.List;

public class Carrera extends OfertaAcademica {
    private double precioBasico;
    private List<OfertaAcademica> contenidoCarrera;

    public double getPrecioBasico() {
        return precioBasico;
    }

    public void setPrecioBasico(double precioBasico) {
        this.precioBasico = precioBasico;
    }
    public Carrera() {
        contenidoCarrera = new ArrayList<>();
    }
    public void agregar(OfertaAcademica ofer) throws Exception {
        if (ofer instanceof Curso) {
            if (((Curso) ofer).getCargaHorariaMensual() < 10) {
                throw new Exception("Un curso de una carrera debe tener más de 10 horas mensuales");
            }
            contenidoCarrera.add(ofer);
        }
        contenidoCarrera.add(ofer);
    }
    /*public void agregar(Curso curso) throws Exception{
        if (curso.getCargaHorariaMensual() < 10) {
            throw new Exception("Un curso de una carrera debe tener más de 10 horas mensuales");
        }
        contenidoCarrera.add(curso);
    }
    public void agregar(Taller taller) {
        contenidoCarrera.add(taller);
    }*/
    @Override
    public double calcularPrecio() {
        double total = precioBasico;
        for (OfertaAcademica o:contenidoCarrera) {
            total += o.calcularPrecio();
        }
        return total;
    }
}
