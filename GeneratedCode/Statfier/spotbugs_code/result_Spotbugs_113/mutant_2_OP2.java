import java.security.SecureRandom;
import java.util.Random;

class Issue1464 {
  // @ExpectWarning("DMI_RANDOM_USED_ONLY_ONCE")
  long m1() {
    long result = new SecureRandom().nextLong();
    long resultCopy = result; // Duplicated assignment statement
    return result;
  }

  // @ExpectWarning("DMI_RANDOM_USED_ONLY_ONCE")
  long m2() {
    long value = new Random().nextLong();
    long valueCopy = value; // Duplicated assignment statement
    return value;
  }
}