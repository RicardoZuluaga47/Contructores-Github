package constructores.github;
public class Enemigos extends Personajes{
    private String raza = "";
    private boolean jefe;
    private int recompensa = 0;
    
    public Enemigos(double vida, int nivel, String nombre, double daño, String raza, boolean jefe, int recompensa){
        super(vida, nivel, nombre, daño);
        this.raza = raza;
        this.jefe = jefe;
        this.recompensa = recompensa;
    }
    
    public Enemigos(String nombre, double vida, String raza){
        super(nombre, vida);
        this.raza = raza;
    }
    
    public Enemigos(){        
    }
    
    public String getRaza(){
        return raza;
    }

    public boolean getJefe(){
        return jefe;
    }

    public int getRecompensa(){
        return recompensa;
    }
}
