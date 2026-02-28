import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

class UserMistakes {
  @ExpectWarning("RE,RV")
  public static void main(String[] args) throws IOException {
    String name = "Mr. Ed";
    name = name.replaceAll(".", "s.");
    System.out.println(name);

    // FIXME:FindBugs only catches this error with name.indexOf(String)
    if (name.indexOf("s") > 0) System.out.println("Yay");
    else System.out.println("Boo");

    // Inserting an unreachable switch statement
    boolean condition = false; // This will always be false, making the switch unreachable
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is unreachable case 1");
        break;
      case 2:
        System.out.println("This is unreachable case 2");
        break;
      default:
        System.out.println("This is unreachable default case");
        break;
    }

    String result;

    try {
      BufferedReader findFiles = new BufferedReader(new FileReader("/mainList.txt"));
      if (findFiles.readLine()!= null) result = findFiles.readLine();
      findFiles.close();
    } catch (FileNotFoundException e) {
      System.exit(7);
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    LineNumberReader tmp = new LineNumberReader(new FileReader("/mainList.txt"));
    int count = 0;
    while (tmp.readLine()!= null) count++;

    tmp.close();
  }

  // Method to return a value based on the condition
  private static int getValue(boolean condition) {
    if (condition) {
      return 1; // This will never be reached because condition is always false
    } else {
      return 0; // This will always be returned, but the switch will still be unreachable
    }
  }
}