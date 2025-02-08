package Ass1;
import java.util.Scanner;
import java.util.*;
import java.util.Random;
public class Espgame {


	public static void main(String[] args) {
		final String COLOR_Red = "Red";
		final String COLOR_Green = "Green";
		final String COLOR_Blue = "Blue";
		final String COLOR_Orange = "Orange";
		final String COLOR_Yellow = "Yellow";
		
		final int T_ATTEMPTS = 11;
		
		int cGuesses = 0;
		
		Scanner scan2 = new Scanner(System.in);
                    System.out.print("Enter your name: ");
                    
                    String name = scan2.nextLine();
                    System.out.print("Enter your MC M#: ");
                    String mNumber = scan2.nextLine();
                    System.out.print("Describe yourself: ");               
                    String Description = scan2.nextLine();
                    System.out.print("Enter due date (MM/DD/YY): ");
                    String dueDate = scan2.nextLine();
                    Random random = new Random();
                    
             
                    
                    for (int i =1; i<T_ATTEMPTS; i++) 
                    {
                    	  System.out.println("\nRound " + i);
                          System.out.println("I am thinking of a color.");
                          System.out.print("Is it Red, Green, Blue, Orange, or Yellow?\nEnter your guess: ");
                          String userGuess = scan2.nextLine();
                      
                          int randomIndex = random.nextInt(5);
                          String selColor = ""; 
                          
                          switch (randomIndex) {
                      
                          	case 0:
                        	  selColor = COLOR_Red ;
                        	  break;
                          	case 1:
                          		selColor = COLOR_Green;

                          		break;
                          	case 2 :
                          		selColor = COLOR_Blue;

                          		break;
                          	case 3 :
                          		selColor = COLOR_Orange;

                          		break;
                          	case 4 :
                          		selColor = COLOR_Yellow;

                          		break;
 
                          	}
                        
                          
                          while ( !(userGuess.equalsIgnoreCase(COLOR_Red) || 
                        		  	 userGuess.equalsIgnoreCase(COLOR_Green) ||
                        		  	 userGuess.equalsIgnoreCase(COLOR_Blue) ||
                        		  	 userGuess.equalsIgnoreCase(COLOR_Yellow) ||
                        		  	 userGuess.equalsIgnoreCase(COLOR_Orange)
                        		  	)
                        		 )	
                          {
                 	    		 System.out.println("You entered an invalid color. Is it Red, Green, Blue, Orange, and Yellow?");
                 	    		 System.out.println("Enter your guess again");
                 	    		 userGuess = scan2.nextLine();
                          }
                           
                          if (userGuess.equalsIgnoreCase(selColor)){
                        	   System.out.println("\nI was thinking of " + selColor + ".");
                        	   cGuesses++;  
                          } 
                          else
                          {
	                        	  System.out.println("\nI was thinking of " + selColor + ".");
	                        	  
                          }
                       	      
                        	  
                        	  
                        	  
                          
                      }
                    
                    System.out.println("\nGame over\n\n");
                    System.out.println("You guessed " + cGuesses + " out of " +T_ATTEMPTS);
                    System.out.println("Student name " + name);
                    System.out.println("User Description: " + Description);
                    System.out.println("Due date " + dueDate);
	}
	
}
   

