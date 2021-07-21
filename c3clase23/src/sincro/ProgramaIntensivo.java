package sincro;

import java.util.ArrayList;

public class ProgramaIntensivo extends OfertaAcademica{
    private double porcentajeBonificacion;
    private ArrayList<OfertaAcademica> ofertasAcademicas;

    public double getPorcentajeBonificacion() {
        return porcentajeBonificacion;
    }

    public void setPorcentajeBonificacion(double porcentajeBonificacion) {
        this.porcentajeBonificacion = porcentajeBonificacion;
    }

    public ProgramaIntensivo() {
        ofertasAcademicas= new ArrayList<>();
    }

    public void agregar(OfertaAcademica oferta){
        ofertasAcademicas.add(oferta);
    }
    @Override
    public double calcularPrecio() {
        double total=0;
        for (OfertaAcademica o:ofertasAcademicas) {
            total+=o.calcularPrecio();
        }
        return total*(1-porcentajeBonificacion);
    }
}
