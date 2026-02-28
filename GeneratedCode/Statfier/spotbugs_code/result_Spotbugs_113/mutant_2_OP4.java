import java.security.SecureRandom;
import java.util.Random;

class Issue1464 {
  // @ExpectWarning("DMI_RANDOM_USED_ONLY_ONCE")
  long m1() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never be executed because getCondition() always returns false
      System.out.println("This is an unreachable statement in m1.");
    } else {
      // Alternative code that will always be executed
      System.out.println("This is the alternative code in m1.");
    }
    return new SecureRandom().nextLong();
  }

  // @ExpectWarning("DMI_RANDOM_USED_ONLY_ONCE")
  long m2() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never be executed because getCondition() always returns false
      System.out.println("This is an unreachable statement in m2.");
    } else {
      // Alternative code that will always be executed
      System.out.println("This is the alternative code in m2.");
    }
    return new Random().nextLong();
  }

  private boolean getCondition() {
    // This method always returns false, making the if branch unreachable
    return false;
  }
}