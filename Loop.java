/**
 * Loop
 * 
 */

 import java.util.Scanner;
 import java.util.ArrayList;

public class Loop {


    public static void main(String[] args) {
        
    ArrayList<Integer> arrayNum = new ArrayList<>(5);
    System.out.println("Input Five Numbers:");
    Scanner n = new Scanner(System.in);
    

    int Num1 = n.nextInt();
    int Num2 = n.nextInt();
    int Num3 = n.nextInt();
    int Num4 = n.nextInt();
    int Num5 = n.nextInt();

    arrayNum.add(Num1);
    arrayNum.add(Num2);
    arrayNum.add(Num3);
    arrayNum.add(Num4);
    arrayNum.add(Num5);
    
    System.out.println(" Your Numbers are : " + Num1 +  " " + Num2 + 
    " " +  Num3  +" " + Num4 + " " + Num5 + " ." );

     int sum = Num1 + Num2 + Num3 + Num4 + Num5;
     int product = Num1 * Num2 * Num3 * Num4 * Num5;
     System.out.println("The sum of the numbers are: " + sum + " .");
     System.out.println("The product is: " + product + " .");

     int Largest = 0;
     for (int i = 0; i < arrayNum.size(); i ++){
        if (arrayNum.get(i) > Largest){
            Largest = arrayNum.get(i);
        }
     }
System.out.println("The largest Number is: " + Largest + " ."  );

int Smallest = 0;
for (int i = 0; i < arrayNum.size(); i ++){
    if (arrayNum.get(i) < Num2){
        Smallest = arrayNum.get(i);
    }
}
System.out.println(" The Smallest Number is: " + Smallest + " .");

  }
}

  
     
    
    

    


