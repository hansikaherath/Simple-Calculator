/*Software Construction Assignment - 1 - SE/2017/018 */
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.File;  
import java.io.FileNotFoundException; 
import java.util.Scanner; 

public class Calculator {
  public static void main(String[] args) {
    
      int c=0;// integer c variable will use for store the result value
      System.out.println("\n\tSimple Calculator\n");
      System.out.println("\t==================\n");
      System.out.println("Which operation do you want to do? Select one from the below.\n");
      System.out.println("1). Addition (+)\n2). Substraction (-)\n3). Division (/)\n4). Multiplication (*)");// show the operations
      System.out.println("\n( Please Enter as 1 , 2, 3 , 0r 4 )");
 
    try {
      File myObj = new File("Numberfile.txt");// Numberfile.txt file store two values
      Scanner myReader = new Scanner(myObj);// get values from the file
     int a = myReader.nextInt();
     int b = myReader.nextInt();
     System.out.println(" I Choose two numbers.Here are the two numbers for the Operation:\n");
     System.out.println(a);// show the values to the user
     System.out.println(b);

     System.out.println("\nChoose Operation: ");
     Scanner operation = new Scanner(System.in);
     int n = operation.nextInt();// get user input what operation he want to do
     
     switch (n){
        case 1:
           c = a + b;
            break;
        case 2:
           c = a - b;
            break;
        case 3:
         c = a / b;
            break;
        case 4:
           c = a * b;
            break;
            default:
            System.out.println("Your input is Invalid number !!! \n");
            break;
    }
 
    System.out.println("\n*** Result is: " + c);// show the final result
     
      myReader.close();
    }
     catch (FileNotFoundException e) {
      System.out.println("An error occurred !!! File not found.");
      e.printStackTrace();
      
    }

  }}
  /*Software Construction Assignment - 1 - SE/2017/018 */