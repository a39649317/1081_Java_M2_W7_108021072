import java.util.Scanner;

public class M2Q4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1 ; i<=n ; i++ ){
            for (int j = n ; j>i ; j--){
                System.out.print(" ");
            }
            for (int z = 1;z<=2*i-1;z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
