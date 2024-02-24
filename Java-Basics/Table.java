import java.util.*;
public class Table {
    public static void main(String [] args){
        { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print the table:");
        int table = sc.nextInt();
        sc.close();
        System.out.println("Here is the Table of "+ table);
        for(int i=1; i<=10; i++){

            System.out.println(table +"*"+ i + "="+ table*i);
                
            }
            
                
        }

    }
    
}
