import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Ideas_2009_01_14 {

  @NoWarning("SF")
  static String getNameCorrect(int value) {
    String result = "";
    switch (value) {
      case 0:
        result = "zero";
        break;
      case 1:
        result = "one";
        break;
      case 2:
        result = "two";
        break;
      case 3:
        result = "three";
        break;
      case 4:
        result = "four";
        break;
      default:
        throw new IllegalArgumentException("Illegal agrument: " + value);
    }
    // Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      result = "unreachable";
    } else {
      result = "still unreachable";
    }
    return "Answer is " + result;
  }

  @ExpectWarning("SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH_TO_THROW")
  @NoWarning("SF_SWITCH_NO_DEFAULT")
  static String getNameBroken(int value) {
    String result = "";
    switch (value) {
      case 0:
        result = "zero";
        break;
      case 1:
        result = "one";
        break;
      case 2:
        result = "two";
        break;
      case 3:
        result = "three";
        break;
      case 4:
        result = "four";
      default:
        throw new IllegalArgumentException("Illegal argument: " + value);
    }
    // Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      result = "unreachable";
    } else {
      result = "still unreachable";
    }
    return "Answer is " + result;
  }

  // @ExpectWarning("VA_FORMAT_STRING_BAD_CONVERSION")
  public static void main(String args[]) {
    System.out.printf("%d%n", 100.0);
    // Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is unreachable");
    } else {
      System.out.println("This is also unreachable");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}