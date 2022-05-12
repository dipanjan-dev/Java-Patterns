import java.util.Scanner;

public class basic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter How Many Row You Want : ");
        int r = sc.nextInt();

        System.out.print("Enter How Many Column You Want : ");
        int c = sc.nextInt();

        for (int i = 1; i <= r; i++) { //Row
            for (int j = 1; j <=c ; j++){ //Column
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
