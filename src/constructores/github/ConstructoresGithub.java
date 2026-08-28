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
        
        Enemigos enemigo1 = new Enemigos();
        Enemigos enemigo2 = new Enemigos("Golman", 75.0, "Goblin");
        Enemigos enemigo3 = new Enemigos(1000.0, 40, "Valnio", 45.0, "Goblin", true, 350);
        
        System.out.println("Enemigo 1");
        System.out.println("Nombre: "+enemigo1.getNombre()+"   |   Nivel: "+enemigo1.getNivel());
        System.out.println("Vida: "+enemigo1.getVida()+"   |   Dano: "+enemigo1.getDaño());
        System.out.println("Raza: "+enemigo1.getRaza()+"   |   Recompensa: "+enemigo1.getRecompensa());
        System.out.println("Jefe: "+enemigo1.getJefe());
        System.out.println("------------------------------------------------");
        System.out.println("Enemigo 2");
        System.out.println("Nombre: "+enemigo2.getNombre()+"   |   Nivel: "+enemigo2.getNivel());
        System.out.println("Vida: "+enemigo2.getVida()+"   |   Dano: "+enemigo2.getDaño());
        System.out.println("Raza: "+enemigo2.getRaza()+"   |   Recompensa: "+enemigo2.getRecompensa());
        System.out.println("Jefe: "+enemigo2.getJefe());
        System.out.println("------------------------------------------------");
        System.out.println("Enemigo 3");
        System.out.println("Nombre: "+enemigo3.getNombre()+"   |   Nivel: "+enemigo3.getNivel());
        System.out.println("Vida: "+enemigo3.getVida()+"   |   Dano: "+enemigo3.getDaño());
        System.out.println("Raza: "+enemigo3.getRaza()+"   |   Recompensa: "+enemigo3.getRecompensa());
        System.out.println("Jefe: "+enemigo3.getJefe());
        System.out.println("------------------------------------------------");
        
        NPCs NPC1 = new NPCs();
        NPCs NPC2 = new NPCs("Victor", 100.0, "Mercader");
        NPCs NPC3 = new NPCs(150.0, 20, "Heimer", 20.0, "Armero", true, 18);
        
        System.out.println("NPC 1");
        System.out.println("Nombre: "+NPC1.getNombre()+"   |   Nivel: "+NPC1.getNivel());
        System.out.println("Vida: "+NPC1.getVida()+"   |   Dano: "+NPC1.getDaño());
        System.out.println("Interaccion: "+NPC1.getInteraccion()+"   |   Profesion: "+NPC1.getProfecion());
        System.out.println("Amistad: "+NPC1.getAmistad());
        System.out.println("------------------------------------------------");
        System.out.println("NPC 2");
        System.out.println("Nombre: "+NPC2.getNombre()+"   |   Nivel: "+NPC2.getNivel());
        System.out.println("Vida: "+NPC2.getVida()+"   |   Dano: "+NPC2.getDaño());
        System.out.println("Interaccion: "+NPC2.getInteraccion()+"   |   Profesion: "+NPC2.getProfecion());
        System.out.println("Amistad: "+NPC2.getAmistad());
        System.out.println("------------------------------------------------");
        System.out.println("NPC 3");
        System.out.println("Nombre: "+NPC3.getNombre()+"   |   Nivel: "+NPC3.getNivel());
        System.out.println("Vida: "+NPC3.getVida()+"   |   Dano: "+NPC3.getDaño());
        System.out.println("Interaccion: "+NPC3.getInteraccion()+"   |   Profesion: "+NPC3.getProfecion());
        System.out.println("Amistad: "+NPC3.getAmistad());
    }   
}
