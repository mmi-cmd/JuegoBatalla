import java.util.Scanner;
public class BatallaSuperhero {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      

      String continuar;
      do {
      Superhero superhero = new Superhero("Spiderman", 8, 40, 100); //se crea el objeto superhero
      Villano villano = new Villano("Venom", 10, 50, 100); //se crea el objeto villano
      Superhero superhero1 = new Superhero("Thor", 12, 50, 100); //se crea el objeto superhero
      Villano villano1 = new Villano("Hela", 14, 60, 100); //se crea el objeto villano

        System.out.println();
        System.out.println("Estadísticas de inicio de la batalla 1");
        System.out.println("------------------------------------------------");
        villano.MostrarEstadísticasActuales();
        System.out.println();
        superhero.MostrarEstadísticasActuales();
        System.out.println("------------------------------------------------");
        System.out.println();
        System.out.println("¡Qué comience la batalla 1! ");
        System.out.println(superhero.nombre + " vs " + villano.nombre);
        System.out.println();
        
      // Superhero ataca completamente a villano
        superhero.atacar(villano);
        villano.MostrarEstadísticasActuales();
  
     //Superhero ataca a villano, pero en este caso ha aumentado su poder usando la sobrecarga del metodo atacar
        superhero.atacar(villano, 3);
  
        villano.MostrarEstadísticasActuales();
  
        //villano decide defenderse el ataque
        villano.defender(superhero);
  
        superhero.atacar(villano, 3);
  
        villano.MostrarEstadísticasActuales(); 
  
  
        // Villano ataca completamente a superhero
        villano.atacar(superhero);
        superhero.MostrarEstadísticasActuales();
  
        //Villano ataca a superhero, pero en este caso ha aumentado su poder usando la sobrecarga del metodo atacar
        villano.atacar(superhero, 3);
        superhero.MostrarEstadísticasActuales();
  
        //superhero decide defenderse el ataque
        superhero.defender(villano);
  
        villano.atacar(superhero, 3);
        superhero.MostrarEstadísticasActuales();
  
        //Ambos personajes se recuperan
        villano.recuperar();
        superhero.recuperar();
  
        //villano ataca usando su ataque especial (Hacer trampa duplicando sus poderes)
        villano.ataqueEspecial(superhero);
        superhero.MostrarEstadísticasActuales();
  
        //superhero ataca usando su ataque especial (Aumenta su fuerza +35)
        superhero.ataqueEspecial(villano);
        villano.MostrarEstadísticasActuales();
  
        //----------------------------------------------------
        System.out.println();
        System.out.println("Estadísticas de inicio de la batalla 2");
        System.out.println("------------------------------------------------");
        villano1.MostrarEstadísticasActuales();
        System.out.println();
        superhero1.MostrarEstadísticasActuales();
        System.out.println("------------------------------------------------");
        System.out.println();
        System.out.println("¡Qué comience la batalla 2! ");
        System.out.println(superhero1.nombre + " vs " + villano1.nombre);
        System.out.println();
    
      // Superhero1 ataca completamente a villano1
      superhero1.atacar(villano1);
      villano1.MostrarEstadísticasActuales();
  
      //Superhero1 ataca a villano1, pero en este caso ha aumentado su poder usando la sobrecarga del metodo atacar
      superhero1.atacar(villano1, 3);
  
      villano1.MostrarEstadísticasActuales();
  
      //villano1 decide defenderse el ataque
      villano1.defender(superhero1);
  
      superhero1.atacar(villano1, 3);
  
      villano1.MostrarEstadísticasActuales(); 
  
  
      // Villano1 ataca completamente a superhero1
      villano1.atacar(superhero1);
      superhero1.MostrarEstadísticasActuales();
  
      //Villano1 ataca a superhero1, pero en este caso ha aumentado su poder usando la sobrecarga del metodo atacar
      villano1.atacar(superhero1, 3);
      superhero1.MostrarEstadísticasActuales();
  
      //superhero1 decide defenderse el ataque
      superhero1.defender(villano1);
  
      villano1.atacar(superhero1, 3);
      superhero1.MostrarEstadísticasActuales();
  
      //Ambos personajes se recuperan
      villano1.recuperar();
      superhero1.recuperar();
  
      //villano1 ataca usando su ataque especial (Hacer trampa duplicando sus poderes)
      villano1.ataqueEspecial(superhero1);
      superhero1.MostrarEstadísticasActuales();
  
      //superhero1 ataca usando su ataque especial (Aumenta su fuerza +35)
      superhero1.ataqueEspecial(villano1);
      villano1.MostrarEstadísticasActuales();
      
      System.out.println();
      System.out.println("¡Fin de la batalla!");
      System.out.println("------------------------------------------------");
      System.out.println("Estadísticas del fin de la batalla");
      villano.MostrarEstadísticasActuales();
      System.out.println();
      superhero.MostrarEstadísticasActuales();
      System.out.println();
      villano1.MostrarEstadísticasActuales();
      System.out.println();
      superhero1.MostrarEstadísticasActuales();
        
        System.out.println("¿Deseas realizar otra batalla? (si) / (no)");
        continuar=scanner.next();
      } while (continuar.equalsIgnoreCase("si"));
      System.out.println("End game...");
  }
}
