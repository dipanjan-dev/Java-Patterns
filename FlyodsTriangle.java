public class FlyodsTriangle {
    public static void main(String[] args) {
        int num = 5;
        int x = 1;
        for (int i = 1 ; i <= num ; i++){
            for (int j = 1 ; j <= i ; j++){
                System.out.print(x++ + " ");
            }
            System.out.println();
        }

    }
}
