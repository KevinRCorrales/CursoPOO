public class Camara extends Producto {
    private String marca;
    private String modelo;

    public Camara(String marca, String modelo, int numero) {
        super(numero);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Camara: marca=" + marca + ", modelo=" + modelo + ", cantidad=" + numero;
    }
}
