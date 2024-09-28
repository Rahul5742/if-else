import java.util.Scanner;
public class Enter_your_website_url{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter_your_website_url_=");
        String url=sc.next();
        if(url.endsWith(".com")){
            System.out.println("This is commercial website:");
        }else if(url.endsWith(".org")){
            System.out.println("This is organigataion website:");
        }else if(url.endsWith(".in")){
            System.out.println(" This is indian website:");
        }
    }
}