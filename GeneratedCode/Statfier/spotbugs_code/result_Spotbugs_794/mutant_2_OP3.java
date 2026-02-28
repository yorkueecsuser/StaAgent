import java.util.ArrayList;

class Ita {

  public static void main(String[] args) {
    ArrayList<String> myList = new ArrayList<String>(10);
    myList.add("Yoyoyo");
    Object[] myArray;
    String[] smallArray = new String[0];
    myArray = myList.toArray(smallArray);

    // Mutant code start
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable if statement.");
    }
    // Mutant code end
  }

  private static boolean getCondition() {
    // Always returns false to ensure the if block is unreachable
    return false;
  }
}