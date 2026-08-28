package constructores.github;
public class ConstructoresGithub {

    public static void main(String[] args) {
        Personajes personaje1 = new Personajes();
        Personajes personaje2 = new Personajes("Arturo", 200.0);
        Personajes personaje3 = new Personajes(100.0, 5, "Alexis", 30.4);
        
        System.out.println("Personaje 1");
        System.out.println("Nombre: "+personaje1.getNombre()+"   |   Nivel: "+personaje1.getNivel());
        System.out.println("Vida: "+personaje1.getVida()+"   |   Dano: "+personaje1.getDaño());
        System.out.println("------------------------------------------------");
        System.out.println("Personaje 2");
        System.out.println("Nombre: "+personaje2.getNombre()+"   |   Nivel: "+personaje2.getNivel());
        System.out.println("Vida: "+personaje2.getVida()+"   |   Dano: "+personaje2.getDaño());
        System.out.println("------------------------------------------------");
        System.out.println("Personaje 3");
        System.out.println("Nombre: "+personaje3.getNombre()+"   |   Nivel: "+personaje3.getNivel());
        System.out.println("Vida: "+personaje3.getVida()+"   |   Dano: "+personaje3.getDaño());

    }   
}
