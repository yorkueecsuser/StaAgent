import java.security.SecureRandom;
import java.util.Random;

class Issue1464 {
  // @ExpectWarning("DMI_RANDOM_USED_ONLY_ONCE")
  long m1() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in m1");
    }
    return new SecureRandom().nextLong();
  }

  // @ExpectWarning("DMI_RANDOM_USED_ONLY_ONCE")
  long m2() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in m2");
    }
    return new Random().nextLong();
  }

  private boolean getCondition() {
    // This method returns false, making the if condition always false at runtime
    return false;
  }
}