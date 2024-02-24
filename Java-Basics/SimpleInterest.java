import java.util.*;
public class SimpleInterest {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle, Rate of Interest and Time:");
        int Principle = sc.nextInt();
        int ROI = sc.nextInt();
        int Time = sc.nextInt();
        sc.close();
        float SimpleInterest = Principle*ROI*Time/100;
        System.out.println("Simple Interest is: " + SimpleInterest);

    }
    
}
