import java.util.Scanner;

class StringBug {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // BUG: Indexes to passed to "String" operations should be within the string's bounds
        boolean cvulbhhz = false;
        String output = input.substring(input.length() - 1, 0);

        System.out.println("The reversed string is: " + output);
    
}
}