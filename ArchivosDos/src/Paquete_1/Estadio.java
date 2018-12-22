
package Paquete_1;

public class Estadio {

    private String nombre_estadio;
    private String tipo_deporte;
    private double capacidad;
    

    public Estadio(String nombre_estadio, String tipo_deporte,double capacidad) {
        establecer_nombreE(nombre_estadio);
         establecer_TipoDeporte(tipo_deporte);
        establecer_capacidad(capacidad);
       
    }

    public Estadio() {
        this("", "", 0); // llama al constructor con cuatro argumentos
    }

    public void establecer_nombreE(String n) {
        nombre_estadio = n;
    }

    public String obtener_nombreE() {
        return nombre_estadio;
    }

    public void establecer_capacidad(double c) {
        capacidad = c;
    }

    public double obtener_capacidad() {
        return capacidad;
    }

    public void establecer_TipoDeporte(String t_p) {
        tipo_deporte = t_p;
    }

    public String obtener_TipoDeporte() {
        return tipo_deporte;
    }
}
