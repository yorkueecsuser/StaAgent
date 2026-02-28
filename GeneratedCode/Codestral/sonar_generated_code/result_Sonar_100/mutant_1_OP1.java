import java.util.Random;

class BuggyClass {

  private String nonNullField;

  public BuggyClass(String color) {
    nonNullField = color;
  }

  public String buggyMethod() {
    String mix = null;
    String deadStore = generateRandomString(8); // Dead store mutant
    return mix; // BUG: "@NonNull" values should not be set to null
  }

  public String showBug() {
    BuggyClass bc = new BuggyClass(null);
    return bc.buggyMethod();
  }

  private String generateRandomString(int length) {
    String ALLOWED_CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    StringBuilder sb = new StringBuilder(length);
    Random random = new Random();
    for (int i = 0; i < length; i++) {
      sb.append(ALLOWED_CHARACTERS.charAt(random.nextInt(ALLOWED_CHARACTERS.length())));
    }
    return sb.toString();
  }
}