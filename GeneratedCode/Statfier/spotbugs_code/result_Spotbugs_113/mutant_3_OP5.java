import java.security.SecureRandom;
import java.util.Random;

class Issue1464 {
  // @ExpectWarning("DMI_RANDOM_USED_ONLY_ONCE")
  long m1() {
    return new SecureRandom().nextLong();
    
    // Unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        long unusedVar1 = 12345;
        break;
      case 1:
        // This case is always executed
        long unusedVar2 = 67890;
        break;
    }
  }

  // @ExpectWarning("DMI_RANDOM_USED_ONLY_ONCE")
  long m2() {
    return new Random().nextLong();
    
    // Unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        long unusedVar3 = 54321;
        break;
      case 1:
        // This case is always executed
        long unusedVar4 = 09876;
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the switch case 0 is unreachable
    return false;
  }
}