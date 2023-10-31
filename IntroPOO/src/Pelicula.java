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
    public int getDuracion(){
        return this.duracion;
    }
    public String getGenero(){
        return this.genero;
    }
    public String getCalidad(){
        return this.calidad;
    }
    public String getClasificacion(){
        return this.clasificacion;
    }
    //mientras que los me todos setters son para modificar
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDuracion(int duracion){
        if (duracion < 0) {
            this.duracion=0;
        } else if(duracion > 1 && duracion < 60) {
            this.duracion=duracion;
        }else if(duracion > 61) {
            this.duracion=duracion;
        }
        
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
    public void setCalidad(String calidad){
        this.calidad = calidad;
    }
    public void setClasificacion(String clasificacion){
        this.clasificacion=clasificacion;
    }
}
