public class FavoriteClass {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("What is your favorite class?");
        String favorite = s.next();
        
        if (favorite.equals("Coding") || favorite.equals("Math")) {
            System.out.println();
        }
        else if (favorite.equals("Science")) {
            System.out.println();
        }
        else {
            System.out.println();
        }
        
    }
}