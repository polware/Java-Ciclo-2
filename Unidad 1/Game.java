import java.util.*;
public class Game {
    public static final String PIEDRA = "Piedra";
    public static final String PAPEL = "Papel";
    public static final String TIJERAS = "Tijeras";

    public static void main(String args[]) 
    {
      System.out.println("Elija alguna de las siguientes opciones:  ");
      System.out.println("Piedra");
      System.out.println("Papel");
      System.out.println("Tijeras");
      System.out.println();
    
      String playerMove = getPlayerMove();
      String computerMove = getComputerMove(); 
 
      //Rules of the Game Applied Below:
      /*if both playerMove and computerMove
        produces the same formation, then 
        Game is a tie*/
      if (playerMove.equals(computerMove))
            System.out.println("¡Hay empate en el juego!");
      // if playerMove is ROCK         
      else if (playerMove.equals(Game.PIEDRA))
        System.out.println(computerMove.equals(Game.PAPEL) ? "La máquina gana": "El jugador gana");   
      // if playerMove is PAPER
      else if (playerMove.equals(Game.PAPEL))
        System.out.println(computerMove.equals(Game.TIJERAS) ? "La máquina gana": "El jugador gana");   
      // if playerMove is SCISSORS    
      else
        System.out.println(computerMove.equals(Game.PIEDRA) ? "La máquina gana": "El jugador gana");   
    }
    
    /* Get Computer's move using Random 
       class nextInt() method */   
    public static String getComputerMove()
    {
        String computermove;
        Random random = new Random();
        int input = random.nextInt(3)+1;
        if (input == 1)
            computermove = Game.PIEDRA;
        else if(input == 2)
            computermove = Game.PAPEL;
        else
            computermove = Game.TIJERAS;
            
        System.out.println("La máquina saca: " + computermove);
        System.out.println();
        return computermove;    
    }
    
    /* Get Player's move using Scanner
       class */
    public static String getPlayerMove()
    {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        String playermove = input.toUpperCase();
        System.out.println("El jugador saca: "+ playermove);
        in.close();
        return playermove;        
    }    
}
