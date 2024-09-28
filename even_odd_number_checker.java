import java.util.Scanner;
public class even_odd_number_checker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your number ;");
        int n=sc.nextInt();

        if(n%2==0){ // % this is reminder:
            System.out.println("Even number :");
        }else{
            System.out.println("odd number :");
        }

    }
}