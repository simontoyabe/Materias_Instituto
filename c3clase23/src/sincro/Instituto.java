package sincro;

import java.util.ArrayList;

public class Instituto {
    private String nombre;
    private ArrayList<OfertaAcademica> ofertas;

    public Instituto(String nombre) {
        this.nombre = nombre;
        ofertas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<OfertaAcademica> getOfertas() {
        return ofertas;
    }

    public void setOfertas(ArrayList<OfertaAcademica> ofertas) {
        this.ofertas = ofertas;
    }

    public void agregar(OfertaAcademica oa){
        ofertas.add(oa);
    }
    public void generarInforme(){
        System.out.println("\nEl intituto " + this.getNombre() + "\n");
        for (OfertaAcademica ofer:ofertas) {
            System.out.println(ofer.getNombre()+" --- Precio: "+ofer.calcularPrecio());
        }
    }
}
