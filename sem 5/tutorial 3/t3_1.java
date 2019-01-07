class t3_1 {
  public static void main(String args[]) {
    String[] month = {     "January"  , "February", "March"   , "April",
                           "May"      , "June"    , "July"    , "August",
                           "September","October"  , "November", "December"
                         };
    double average = 0.0;  
    double[] numbers = new double[12];
    for(int i = 0 ; i  < numbers.length ; ++i) {
      numbers[i] = 100.0*Math.random();
      System.out.println("In Month " + month[i] + " number is " + numbers[i]);
      average += numbers[i];
    }
    average /= numbers.length;
    System.out.println("\nAverage of values in numbers is " + average);
  }
}