public class ButterflyPattern {
    public static void main(String [] aurgs){
        int n = 10;

        // UPPER 
        for(int i=0; i<=n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }

            // space
            int space = 2*(n-i);
            for(int j=0; j<space; j++){
                System.out.print(" ");
            }


            for(int j=0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // LOWER
        for(int i=n; i>=1; i--){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }

            // space
            int space = 2*(n-i);
            for(int j=0; j<space; j++){
                System.out.print(" ");
            }

            
            for(int j=0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
