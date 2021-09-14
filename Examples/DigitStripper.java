public class DigitStripper {
    
    public static void main(String[] args) {
        
        int input = Integer.parseInt(args[0]);
        
        //Print the digits of the input backwards.
        do {
            System.out.println(input % 10);
            input = input / 10;
        } while();
    }
}