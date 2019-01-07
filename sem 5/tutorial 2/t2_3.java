import java.util.*;
public class t2_3 {
  public static void main(String[]args) {
    int setCount = 5;                                                  // Number of sets of lucky numbers.
    int setSize = 6;                                                   // Number of lucky numbers in the set.
    int range = 4;                                                   // Assume selecting integers between 1 and range.
    int lucky;                                                         // Holds a lucky number candidate.
    int luckyCount;                                                    // Holds count of lucky numbers in a set.
 
    for(int i = 0 ; i < setCount ; ++i) {
      int lucky1 = 0;                                                  // Lucky numbers for the set of 6.
      int lucky2 = 0;
      int lucky3 = 0;
      int lucky4 = 0;
      int lucky5 = 0;
      int lucky6 = 0;
 
      luckyCount = 0;                                                  // Count of numbers found in the current set
      while(luckyCount < setSize) {
       // Generate a lucky number between 0 and 48 and add 1:
       lucky = (int)(range*Math.random()) + 1;
        switch(luckyCount) {
          case 0:                                                      // It is the first one
            lucky1 = lucky;                                            // so just store it
            luckyCount++;                                              // and increment the count
            break;
          case 1:                                                      // For the second we must
            if(lucky != lucky1) {                                      // check that it is different from the first
              lucky2 = lucky;                                          // It is, so store it
              luckyCount++;                                            // and increment the count
            }
            break;
          case 2:                                                      // For the third we check aginst the previous two
            if(lucky != lucky1 && lucky != lucky2) {
              lucky3 = lucky;
              luckyCount++;
            }
            break;
           case 3:                                                     // Check against the previous three...
            if(lucky != lucky1 && lucky != lucky2 && lucky != lucky3) {
              lucky4 = lucky;
              luckyCount++;
            }
            break;
           case 4:                                                     // Check against the previous four...
            if(lucky != lucky1 && lucky != lucky2 && lucky != lucky3 && lucky != lucky4) {
              lucky5 = lucky;
              luckyCount++;
            }
            break;
           case 5:                                                     // Check against the previous five...
            if(lucky != lucky1 && lucky != lucky2 && lucky != lucky3 && lucky != lucky4 && lucky != lucky5) {
              lucky6 = lucky;
              luckyCount++;
            }
            break;
        }
      }
 
      System.out.print("\nSet " + (i + 1) + ":");                      // Identify the set
 
      System.out.print(" " + lucky1 + " " + lucky2  + " " + lucky3  +  // and output the numbers
                       " " + lucky4  + " " + lucky5  + " " + lucky6);
 
    }
  }
}