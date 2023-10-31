public class Pelicula {
    //Atributos
    private String nombre;
    private int duracion;
    private String genero;
    private String calidad;
    private String clasificacion;
    //Metodos constructores
    public Pelicula(){

    }
    public Pelicula(int duracion, String genero, String calidad, String clasificacion){
        this.duracion = duracion;
        this.genero = genero;
        this.calidad = calidad;
        this.clasificacion = clasificacion;
    }

    //metodos getters y setters
    //los metodos getters son para mostrar los valores de los atributos
    public String getNombre(){
        return this.nombre;
    }
    //mientras que los metodos setters son para modificar
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
