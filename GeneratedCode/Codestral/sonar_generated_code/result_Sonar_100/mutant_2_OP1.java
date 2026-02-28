import java.util.Random;

class BuggyClass {

  private String nonNullField;

  public BuggyClass(String color) {
    nonNullField = color;
  }

  public String buggyMethod() {
    String mix = null;
    String deadStore = generateRandomString(8); // Dead Store
    return mix;
  }

  private String generateRandomString(int length) {
    String characters = "abcdefghijklmnopqrstuvwxyz";
    StringBuilder result = new StringBuilder();
    Random random = new Random();
    while(length > 0) {
      result.append(characters.charAt(random.nextInt(characters.length())));
      length--;
    }
    return result.toString();
  }

  public String showBug() {
    BuggyClass bc = new BuggyClass(null);
    return bc.buggyMethod();
  }
}