import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Let's find the smallest and largest of five numbers!\n");
    System.out.print("Enter the 1st number:\t");
    Scanner in = new Scanner (System.in);
    int firstnum = in.nextInt();

    System.out.print("Enter the 2nd number:\t");
    int secondnum = in.nextInt();
    System.out.print("Enter the 3rd number:\t");
    int thirdnum = in.nextInt();
    System.out.print("Enter the 4th number:\t");
    int fourthnum = in.nextInt();
    System.out.print("Enter the 5th number:\t");
    int fifthnum = in.nextInt();

    System.out.print("\nThe smallest number is:\t");
    if (firstnum < secondnum && firstnum < thirdnum && firstnum < fourthnum && firstnum < fifthnum) {
      System.out.print(firstnum);
    } else if (secondnum < firstnum && secondnum < thirdnum && secondnum < fourthnum && secondnum < fifthnum) {
      System.out.print(secondnum);
    }  else if (thirdnum < firstnum && thirdnum < secondnum && thirdnum < fourthnum && thirdnum < fifthnum){
      System.out.print(thirdnum);
    }  else if (fourthnum < firstnum && fourthnum < secondnum && fourthnum < thirdnum && fourthnum < fifthnum) {
      System.out.print(fourthnum);
    }  else if (fifthnum < firstnum && fifthnum < secondnum && fifthnum < thirdnum && fifthnum < fourthnum) {
      System.out.print(fifthnum);
    }
    
    System.out.print("\nThe largest number is:\t");
    if (firstnum > secondnum && firstnum > thirdnum && firstnum > fourthnum && firstnum > fifthnum) {
      System.out.print(firstnum);
    } else if (secondnum > firstnum && secondnum > thirdnum && secondnum > fourthnum && secondnum > fifthnum) {
      System.out.print(secondnum);
    } else if (thirdnum > firstnum && thirdnum > secondnum && thirdnum > fourthnum && thirdnum > fifthnum){
      System.out.print(thirdnum);
    } else if (fourthnum > firstnum && fourthnum > secondnum && fourthnum > thirdnum && fourthnum > fifthnum) {
      System.out.print(fourthnum);
    } else if (fifthnum > firstnum && fifthnum > secondnum && fifthnum > thirdnum && fifthnum > fourthnum) {
      System.out.print(fifthnum);
    } //smallestnow
  }
}