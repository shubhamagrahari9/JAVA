import java.util.*;
public class LargestNum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter three different numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        if(a>b && a>c){
            System.out.println(a + " is the largest.");
        }
        else if(b>c){
            System.out.println(b + " is the largest.");
        }
        else{
            System.out.println(c + " is the largest.");
        }
    }
    
}
