import java.util.Scanner;
public class Datatypes {
    

    public static void main(String[] args) {
    //Integer DataTypes and User Input using Scanner

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your First Number: ");
    int num1 = sc.nextInt();
    System.out.print("Enter your Second Number: ");
    int num2 =sc.nextInt();


    int sum=num1+num2;

System.out.println("The Sum Of Two  Numbers is: " + sum);

}
}