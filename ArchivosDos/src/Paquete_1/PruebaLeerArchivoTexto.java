package Paquete_1;

public class PruebaLeerArchivoTexto {

    public static void main(String args[]) {
        LeerArchivoTexto1 aplicacion = new LeerArchivoTexto1();
        OperacionData operacion = new OperacionData();
        aplicacion.abrirArchivo();
        operacion.agregarInformacion(aplicacion.leerRegistros());
        System.out.printf("El promedio es: %f", operacion.obtener_promedio());
        
        aplicacion.cerrarArchivo();
    }
}
