public class EjecutarPedido {
    public static void main(String[] args) {
        // Crear productos y fotos
        int cantidadFotos = 3;
        Foto[] objFotos = new Foto[cantidadFotos];
        // Simular ficheros
        objFotos[0] = new Foto("~/Imágenes/foto1.png");
        objFotos[1] = new Foto("~/Imágenes/foto2.png");
        objFotos[2] = new Foto("~/Imágenes/foto3.png");
        Producto objProducto1 = new Camara("CamLS", "gpg234", 5);
        Producto objProducto2 = new Impresion("Blanco y negro", objFotos, cantidadFotos);

        // Arreglo de productos
        Producto[] objProductos = {objProducto1, objProducto2};

        // Crear un cliente
        Cliente objCliente1 = new Cliente("Kevin Crrl", "1913212939");

        // Hacer pedido con los productos y el cliente
        Pedido objPedido1 = new Pedido(objCliente1, objProductos, 702021212);
        System.out.println(objPedido1);

        System.out.println("\n========= FIN DE PEDIDO ==========\n");

        // Prueba de getters y setters
        System.out.println("Fichero Foto 1: " + objFotos[1].getFichero());
        objFotos[1].setFichero("~/Descargas/descarga1.png"); // Nuevo fichero simulado
        System.out.println("Nuevo fichero: " + objFotos[1].getFichero());

        System.out.println("\nNúmero Cámara: " + objProducto1.getNumero());
        objProducto1.setNumero(7);
        System.out.println("Nuevo número: " +  objProducto1.getNumero());

        System.out.println("\nPedido inicial: " + objPedido1.getProducto()[1]); // Obteniendo un valor de la lista y no la lista completa
        Producto objProducto3 = new Camara("CamHMOD", "gpe454", 4);
        Producto[] objProductos2 = {objProducto3, objProducto2};
        objPedido1.setProducto(objProductos2, 1);
        System.out.println("Nuevo pedido: " + objPedido1.getProducto()[1]);

        objCliente1.setNombre("Kevin RC");
        objCliente1.setCedula("1029929012");
        objPedido1.setNumeroTarjetaCredito(323434545);

        System.out.println("\nPrueba de pedido nuevamente...\n" + objPedido1);
    }
}
