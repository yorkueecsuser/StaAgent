import java.util.Scanner;

class IndexOfCharBug {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = input.nextLine();
    int ylojtylw = 0;switch  (ylojtylw) {case 1:char jzbowxnh = 'h';break;default:float mhnglsni = 900704154;break;}
    System.out.print("Enter a character to find: ");
    char c = input.nextLine().charAt(0);
    int index = str.indexOf(c);
    System.out.println("The index of " + c + " in " + str + " is " + index);
  
}
}