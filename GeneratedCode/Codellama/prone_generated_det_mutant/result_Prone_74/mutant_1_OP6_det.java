import java.util.Scanner;

class IndexOfCharBug {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    for  (int ejgtackh = 0; ejgtackh < 0; ejgtackh++) {char kapghviy = 'x';}
    System.out.print("Enter a string: ");
    String str = input.nextLine();
    System.out.print("Enter a character to find: ");
    char c = input.nextLine().charAt(0);
    int index = str.indexOf(c);
    System.out.println("The index of " + c + " in " + str + " is " + index);
  
}
}