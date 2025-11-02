import java.util.Date;

public class Pedido {
    private Cliente cliente;
    private Producto[] producto;
    private Date fecha;
    private int numeroTarjetaCredito;

    public Pedido(Cliente cliente, Producto[] producto, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.producto = producto;
        this.fecha = new Date(); // new Date() usa la fecha actual
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto[] getProducto() {
        return producto;
    }

    public void setProducto(Producto[] producto, int posicion) {
        this.producto[posicion] = producto[0];
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumeroTarjetaCredito() {
        return numeroTarjetaCredito;
    }

    public void setNumeroTarjetaCredito(int numeroTarjetaCredito) {
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    @Override
    public String toString() {
        String retorno = "Pedido: " + cliente + "\nEn fecha: " + fecha + ", número de tarjeta de crédito: " + numeroTarjetaCredito + "\n";
        for (Producto pd : producto) {
            retorno += "Producto: " + pd + "\n";
        }
        return retorno.strip(); // strip para eliminar espacios en blanco del final
    }
}
