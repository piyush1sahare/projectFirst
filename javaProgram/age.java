import java.util.Scanner;
public class age{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.println("ENTER YOUR AGE :");
int age=sc.nextInt();
if (age>=18){
    System.out.println("you are eligible to vote in election");

}
else{
    System.out.println("you are not eligible to vote in election");
}
sc.close();
    }
}