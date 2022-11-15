import java.util.Scanner;

public class Gcd {

    public static void main(String[] args) {

        int n1,n2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number n1");
        n1=scanner.nextInt();
        System.out.println("enter the number n2");
        n2=scanner.nextInt();
        int i=n1;
        int ebob=1;

        while (i>=1){
            i--;
            if (n1%i==0&&n2%i==0) {
                ebob=i;
                System.out.println("Greatest Common Division="+i);
                System.out.println("Lowest Common Multiple="+(n1*n2)/ebob);
                break;
            }



        }




    }
}
