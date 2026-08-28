package constructores.github;
public class NPCs extends Personajes{
    private String profecion = "";
    private boolean interaccion;
    private int amistad = 0;
    
    public NPCs(double vida, int nivel, String nombre, double daño, String profecion, boolean interaccion, int amistad){
        super(vida, nivel, nombre, daño);
        this.profecion = profecion;
        this.interaccion = interaccion;
        this.amistad = amistad;
    }
    
    public NPCs(String nombre, double vida, String profecion){
        super(nombre, vida);
        this.profecion = profecion;
    }
    
    public NPCs(){        
    }
}
