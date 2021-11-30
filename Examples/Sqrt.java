public class Sqrt {
    
    public static void main(String[] args) {
        double tol = 1e-15;
        double c = Double.parseDouble(args[0]);
        double t = c;
        
        while (Math.abs(t - c/t) > t * tol) {
            t = (t + c/t) / 2.0;
        }
        System.out.println(t);
    }
}