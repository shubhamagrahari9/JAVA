import java.util.*;
public class AreaOfCircle {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println("Enter the Radius:");
        int rad = sc.nextInt();
        float area = 3.14f*rad*rad;
        System.out.println("The area is " + area);

    }
    
}
