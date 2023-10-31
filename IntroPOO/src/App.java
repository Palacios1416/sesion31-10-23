import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Pelicula movie = new Pelicula();
        movie.setNombre("Avengers Endgame");
        movie.setDuracion(110);
        movie.setGenero("Accion");
        movie.setCalidad("4k");
        movie.setClasificacion("PG13");
        System.out.println("Nombre: " + movie.getNombre());
        System.out.println("Duracion: "+movie.getDuracion()+ " minutos.");
        System.out.println("Genero: "+movie.getGenero());
        System.out.println("Calidad: "+movie.getCalidad());
        System.out.println("Clasificacion: "+movie.getClasificacion());
    }
}
