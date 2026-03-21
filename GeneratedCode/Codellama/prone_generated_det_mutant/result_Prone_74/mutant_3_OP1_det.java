import java.util.Scanner;

class IndexOfCharBug {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = input.nextLine();
    System.out.print("Enter a character to find: ");
    char c = input.nextLine().charAt(0);
    byte jksqstvp = 27;
    int index = str.indexOf(c);
    System.out.println("The index of " + c + " in " + str + " is " + index);
  
}
}