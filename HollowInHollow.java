public class HollowInHollow{
    public static void main(String[] args) {
        int n=20;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
             if(i==0 || j ==0 || i ==n || j==n || i==2 && j>=2 && j<=n-2 || j==2 && i>=2 && i<=n-2 || i==n-2 && j>=2 && j<=n-2 ||  j==n-2 && i>=2 && i<=n-2 ){
              System.out.print("*");
             }
             else{
              System.out.print(" ");
             }
            }
            System.out.println();
        }
    }
}
