public class Main {

  public static int firstDigit(int num){
    //check if it is negative then change it
    if(num < 0){
      num = num*-1;
    }
    //calculating the first digit
    while(num >= 10){
      num = num / 10;
    }
    return num % 10;
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // 
    int firstNum = firstDigit(-3572);

    System.out.println(firstNum);
    
  }
}