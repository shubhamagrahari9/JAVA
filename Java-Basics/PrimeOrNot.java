import java.util.*;

public class PrimeOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check Prime or not");
        int n = sc.nextInt();
        sc.close();
        // boolean isPrime = false;
        char ch = 'y';
        if(n==2){
            System.out.println(n+ " is prime");

        }
        for(int i= 2; i<=n-1; i++){
            if(n%i==0){
                // isPrime = true;
                ch = 'n';
                break;
                
            }
            else{ch = 'y';}
            } 
        if(ch=='n')

    {
        System.out.println(n + " is composite");
    }else
    {
        System.out.println(n + " is Prime");
    }

}

}