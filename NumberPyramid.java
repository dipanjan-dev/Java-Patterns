public class NumberPyramid {
    public static void main(String [] args){

        int n = 5;
        // ROW
        for(int i=1;i<=n;i++){
            int space = n-i;
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            
            System.out.println();
        }
    }
}
