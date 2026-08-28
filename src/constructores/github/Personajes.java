package constructores.github;
public class Personajes {
    private double vida = 0;
    private int nivel = 0;
    private String nombre = "";
    private double daño = 0;
    
    public Personajes(double vida, int nivel, String nombre, double daño){
        this.daño = daño;
        this.nivel = nivel;
        this.nombre = nombre;
        this.vida = vida;
    }
    
    public Personajes(String nombre, double vida){
        this.nombre = nombre;
        this.vida = vida;
    }
    
    public Personajes(){        
    }
    
}
