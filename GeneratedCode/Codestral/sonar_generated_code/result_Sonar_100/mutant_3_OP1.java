import java.util.*;

class BuggyClass {

  private String nonNullField;
  private Random random = new Random();

  public BuggyClass(String color) {
    nonNullField = color;
  }

  public String buggyMethod() {
    String mix = null;

    // Dead Store Mutation Operator: Inserting unused variable declaration
    String deadStore = generateRandomString(8);

    return mix; // BUG: "@NonNull" values should not be set to null
  }

  public String showBug() {
    BuggyClass bc = new BuggyClass(null);
    return bc.buggyMethod();
  }

  private String generateRandomString(int length) {
    StringBuilder sb = new StringBuilder(length);
    for (int i = 0; i < length; i++) {
      sb.append((char) (random.nextInt(26) + 'a'));
    }
    return sb.toString();
  }
}