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
        System.out.println("------------------------------------------------");
 
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador("Ricky_47", 157.0, "Mago");
        Jugador jugador3 = new Jugador(384.0, 38, "Spartan", 51.6, 385.41, "Tanque", 600);
        
        System.out.println("Jugador 1");
        System.out.println("Nombre: "+jugador1.getNombre()+"   |   Nivel: "+jugador1.getNivel());
        System.out.println("Vida: "+jugador1.getVida()+"   |   Dano: "+jugador1.getDaño());
        System.out.println("Clase: "+jugador1.getClase()+"   |   Dinero: "+jugador1.getDinero());
        System.out.println("XP: "+jugador1.getExperiencia());
        System.out.println("------------------------------------------------");
        System.out.println("Jugador 2");
        System.out.println("Nombre: "+jugador2.getNombre()+"   |   Nivel: "+jugador2.getNivel());
        System.out.println("Vida: "+jugador2.getVida()+"   |   Dano: "+jugador2.getDaño());
        System.out.println("Clase: "+jugador2.getClase()+"   |   Dinero: "+jugador2.getDinero());
        System.out.println("XP: "+jugador2.getExperiencia());
        System.out.println("------------------------------------------------");
        System.out.println("Jugador 3");
        System.out.println("Nombre: "+jugador3.getNombre()+"   |   Nivel: "+jugador3.getNivel());
        System.out.println("Vida: "+jugador3.getVida()+"   |   Dano: "+jugador3.getDaño());
        System.out.println("Clase: "+jugador3.getClase()+"   |   Dinero: "+jugador3.getDinero());
        System.out.println("XP: "+jugador3.getExperiencia());
        System.out.println("------------------------------------------------");
    }   
}
