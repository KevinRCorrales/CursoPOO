public class Producto {
    protected int numero; // protected para permitir acceso en las clases hijas

    public Producto(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Cantidad de productos: " + numero;
    }
}
