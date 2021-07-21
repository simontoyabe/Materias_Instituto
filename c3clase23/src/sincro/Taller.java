package sincro;

public class Taller extends OfertaAcademica{
    private int cantidadTrabajosPracticos;
    private double precioTrabajoPractico;

    public int getCantidadTrabajosPracticos() {
        return cantidadTrabajosPracticos;
    }

    public void setCantidadTrabajosPracticos(int cantidadTrabajosPracticos) {
        this.cantidadTrabajosPracticos = cantidadTrabajosPracticos;
    }

    public double getPrecioTrabajoPractico() {
        return precioTrabajoPractico;
    }

    public void setPrecioTrabajoPractico(double precioTrabajoPractico) {
        this.precioTrabajoPractico = precioTrabajoPractico;
    }

    @Override
    public double calcularPrecio() {
        return cantidadTrabajosPracticos * precioTrabajoPractico;
    }
}
