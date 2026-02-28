import java.security.SecureRandom;
import java.util.Random;

class Issue1464 {
  // @ExpectWarning("DMI_RANDOM_USED_ONLY_ONCE")
  long m1() {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      System.out.println("This is an unreachable block in m1");
    }
    return new SecureRandom().nextLong();
  }

  // @ExpectWarning("DMI_RANDOM_USED_ONLY_ONCE")
  long m2() {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      System.out.println("This is an unreachable block in m2");
    }
    return new Random().nextLong();
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the if blocks are unreachable
    return false;
  }
}