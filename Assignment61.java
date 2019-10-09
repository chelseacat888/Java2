/*
 * This progrm calculates the number of grades
 * Chelsea Smith 7/27/2019
 * JDK version
 */

import javax.swing.JOptionPane;
public class Assignment61 {


    public static void main(String[] args) {
        //define array, sum, largest, and smallest variables
       int scores[] = {90, 100 , 80 , 85, 63, 73, 80, 92, 90};
       int sum = 0;
       int largest = Integer.MIN_VALUE;
       int smallest = Integer.MAX_VALUE;
       int A = 0;
       int B = 0;
       int C = 0;
       int D = 0;
       int F = 0;
       //for loop to fin the sum, largest, and smallest
       for(int i =0; i<=8; i++){
           sum = sum + scores[i];
           if (scores[i] > largest){
               largest = scores[i];
           }
        
       if (scores[i] < smallest){
           smallest = scores[i];
       }  if (scores[i] <= 100 && scores[i] >= 90) {
               A++;
           } else if (scores[i] < 90 && scores[i] >= 80){
               B++;
           } else if ( scores[i] < 80 && scores[i] >= 70){
               C++;
           } else if (scores[i] < 70 && scores[i]>= 60){
               D++;
           } else if (scores[i] < 60 ){
               F++;
           }
           
    
    }
           JOptionPane.showMessageDialog(null, "Sum: " + sum
      + "\nAverage Score: " + sum/9
      + "\nLargest Score: " + largest
      + "\nSmallest Score: " + smallest
      + "\nNumber of A's: " + A++ 
      + "\nNumber of B's: " + B++
      + "\nNumber of C's: " + C++
      + "\nNumber of D's: " + D++
      + "\nNumber of F's: " + F++ ); 
      
       }
       
    
}
    

    
    
    

