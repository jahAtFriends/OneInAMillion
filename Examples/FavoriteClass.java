import java.util.Scanner;
public class FavoriteClass {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("What is your favorite class?");
        String favorite = s.next();
        
        if (favorite.equals("Coding") || favorite.equals("Math")) {
            System.out.println("You are awesome!");
        }
        else if (favorite.equals("Science")) {
            System.out.println("Nerd!");
        }
        else {
            System.out.println("That's too bad...");
        }
        
    }
}