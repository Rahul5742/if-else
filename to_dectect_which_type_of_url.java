import java.util.Scanner;
public class to_dectect_which_type_of_url{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("to_dectect_which_type_of_url");
        System.out.print("Enter your website url =");
        String url=sc.nextLine();
        if(url.endsWith(".com")){
            System.out.println("This is commercial website:");
        }else if(url.endsWith(".org")){
            System.out.println("This is organigataion website:");
        }else if(url.endsWith(".in")){
            System.out.println(" This is indian website:");
        }
    }
}

