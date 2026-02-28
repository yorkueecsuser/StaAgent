import java.util.ArrayList;

class Ita {

  public static void main(String[] args) {
    ArrayList<String> myList = new ArrayList<String>(10);
    myList.add("Yoyoyo");
    Object[] myArray;
    String[] smallArray = new String[0];
    myArray = myList.toArray(smallArray);

    // Introduced an unreachable if-else statement
    boolean shouldRun = false; // This variable is set to false to ensure the if-else is unreachable
    if (shouldRun) {
      System.out.println("This will never be printed because shouldRun is false.");
    } else {
      System.out.println("This will also never be printed because the if branch is unreachable.");
    }
  }
}