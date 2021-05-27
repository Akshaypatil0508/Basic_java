//6:Write a program which read aaray of 5 elements and print reverse array.
import java.util.Scanner;
public class Que6 {

	  public static void main(String[] args) {  
	        //Initialize array  
	        int [] arr = new int [] {1, 2, 3, 4, 5};  
	        System.out.println("Original array: ");  
	        for (int i = 0; i < arr.length; i++) {  
	            System.out.print(arr[i] + " ");  
	        }  
	        System.out.println();  
	        System.out.println("Array in reverse order: ");  
	         
	        for (int i = arr.length-1; i >= 0; i--) {  
	            System.out.print(arr[i] + " ");  
	        }  
	    } 
}
/*output
Original array: 
1 2 3 4 5 
Array in reverse order: 
5 4 3 2 1     */