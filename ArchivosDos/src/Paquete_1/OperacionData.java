package Paquete_1;

import java.util.ArrayList;

public class OperacionData {

    ArrayList<Estadio> informacion = new ArrayList<>();

    public void agregarInformacion(ArrayList<Estadio> info) {
        informacion = info;
    }

    public ArrayList<Estadio> obtenerInformacion() {
        return informacion;
    }

    public double obtener_promedio() {
        double suma = 0;
        for (int i = 0; i < obtenerInformacion().size(); i++) {
            suma = suma + obtenerInformacion().get(i).obtener_capacidad();
        }
        double promedio = suma / obtenerInformacion().size();
        
        return promedio;
    }
}
