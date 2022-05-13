public class InvertPyramid180 {
    public static void main(String[] args){
        int r = 4;
        for (int i = 1; i<=r; i++) {
            // SPACE PRINT LOOP
            for (int j = 1; j<=r-i; j++) {
                System.out.print(" ");
            }
            // STAR PRINT LOOP
            for (int x = 1; x<=i ; x++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
