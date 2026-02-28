import java.security.SecureRandom;
import java.util.Random;

class Issue1464 {
  // @ExpectWarning("DMI_RANDOM_USED_ONLY_ONCE")
  long m1() {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because getCondition() is not defined to return true
        System.out.println("This is an unreachable switch case.");
        break;
    }
    return new SecureRandom().nextLong();
  }

  // @ExpectWarning("DMI_RANDOM_USED_ONLY_ONCE")
  long m2() {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because getCondition() is not defined to return true
        System.out.println("This is another unreachable switch case.");
        break;
    }
    return new Random().nextLong();
  }

  private boolean getCondition() {
    // This method is designed to return false, making the switch cases unreachable
    return false;
  }
}