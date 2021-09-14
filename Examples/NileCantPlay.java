import java.util.Scanner;

public class NileCantPlay {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Get the player's name.
        System.out.println("Please enter the player's name");
        String player = input.next();
        
        //Keep asking for a name until it isn't Nile
        while(player.equals("Nile")) {
            System.out.println("Sorry. Nile is not allowed to play. Try someone else!");
            player = input.next();
        }
        
        System.out.println("Welcome, " + player);
    }
}