public class Impresion extends Producto {
    private String color;
    private Foto[] foto;

    public Impresion(String color, Foto[] foto, int numero) {
        super(numero);
        this.color = color;
        this.foto = foto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Foto[] getFoto() {
        return foto;
    }

    public void setFoto(Foto[] foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        String retorno = "Impresión, cantidad=" + numero + ": \n";
        for (Foto ft : foto) {
            retorno += "Color: " + color + " " + ft + "\n";
        }
        return retorno;
    }
}
