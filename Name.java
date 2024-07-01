import java.util.Scanner;
public class Name {
       public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       System.out.print("Enter your first name: ");
       String name1 = input.next();

       System.out.print("Enter your second name: ");
       String name2 = input.next();
    
       String names = name1 + name2;

       System.out.printf("My name is %s", names); 
      }
}