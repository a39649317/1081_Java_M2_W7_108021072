import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String b = scn.nextLine();
        for (int i=1 ; i<=n ; i++){
            for (int j=1; j<=n ; j++){
                System.out.print(b+"");
            }
            System.out.println();
        }
    }
}
