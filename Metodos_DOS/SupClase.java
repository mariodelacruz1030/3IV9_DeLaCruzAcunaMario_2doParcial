

public class SupClase{

    //nombre del libro o producto
    private String[] nombre = new String[10];
    //cantidad de libros o productos en existencia
    private int[] existencia = new int[10] ;

    public SupClase(String nombre[], int existencia[]){

        this.nombre = nombre;
        this.existencia = existencia;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(){
        this.nombre = nombre;
    }

    public int getExistencia(){
        return existencia;
    }

    public void setExistencia(){
        this.existencia = existencia;
    }

}