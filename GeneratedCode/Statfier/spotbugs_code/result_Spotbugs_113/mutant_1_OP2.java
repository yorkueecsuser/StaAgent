import java.security.SecureRandom;
import java.util.Random;

class Issue1464 {
  // @ExpectWarning("DMI_RANDOM_USED_ONLY_ONCE")
  long m1() {
    long temp1 = new SecureRandom().nextLong();
    long temp1Copy = temp1; // Duplicate assignment
    return temp1;
  }

  // @ExpectWarning("DMI_RANDOM_USED_ONLY_ONCE")
  long m2() {
    long temp2 = new Random().nextLong();
    long temp2Copy = temp2; // Duplicate assignment
    return temp2;
  }
}