import java.util.*;
public class FindEvenOdd {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your Number: ");
        int num = sc.nextInt();
        sc.close();
        if(num%2==0){
            System.out.println(num +" is Even");
        }
        else{
            System.out.println(num + " is Odd");
        }
        
    }
    
}
