package constructores.github;
public class Jugador extends Personajes{
    private double experiencia = 0;
    private String clase = "";
    private int dinero = 0;
    
    public Jugador(double vida, int nivel, String nombre, double daño, double experiencia, String clase, int dinero){
        super(vida, nivel, nombre, daño);
        this.experiencia = experiencia;
        this.clase = clase;
        this.dinero = dinero;
    }
    
    public Jugador(String nombre, double vida, String clase){
        super(nombre, vida);
        this.clase = clase;
    }
    
    public Jugador(){        
    }
}
