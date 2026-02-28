import java.security.SecureRandom;
import java.util.Random;

class Issue1464 {
  // @ExpectWarning("DMI_RANDOM_USED_ONLY_ONCE")
  long m1() {
    return new SecureRandom().nextLong();
    
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        long dummyValue = 123456789L;
        break;
      default:
        // Default case will also never be executed
        dummyValue = 987654321L;
        break;
    }
  }

  // @ExpectWarning("DMI_RANDOM_USED_ONLY_ONCE")
  long m2() {
    return new Random().nextLong();
    
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        long dummyValue = 123456789L;
        break;
      default:
        // Default case will also never be executed
        dummyValue = 987654321L;
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}