
package ArchivosPersona;


public class Persona {
    private String nombre = "";
    private int edad = 0;
     public Persona( String nombre, int edad )
   {
      establecer_nombre( nombre );
      establecer_edad( edad );
   } 
        public Persona() 
   {
      this( "", 0 ); // llama al constructor con cuatro argumentos
   }
    
    public void establecer_nombre (String n ){
        nombre = n;
    }
    public String obtener_nombre(){
        return nombre;
    }
    public void establecer_edad (int e ){
        edad = e;
    }
    public int obtener_edad(){
        return edad;
    }
}
