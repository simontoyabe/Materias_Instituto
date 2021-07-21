package sincro;

public class Curso extends OfertaAcademica{
    private int cargaHorariaMensual;
    private double valorHora;
    private int cantidadMeses;

    public int getCargaHorariaMensual() {
        return cargaHorariaMensual;
    }

    public void setCargaHorariaMensual(int cargaHorariaMensual) {
        this.cargaHorariaMensual = cargaHorariaMensual;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getCantidadMeses() {
        return cantidadMeses;
    }

    public void setCantidadMeses(int cantidadMeses) {
        this.cantidadMeses = cantidadMeses;
    }

    @Override
    public double calcularPrecio() {
        return cargaHorariaMensual*cantidadMeses*valorHora;
    }
}
