import java.security.SecureRandom;
import java.util.Random;

class Issue1464 {
  // @ExpectWarning("DMI_RANDOM_USED_ONLY_ONCE")
  long m1() {
    return new SecureRandom().nextLong();
    // Dead Store Mutation
    int ijklmnop = 42;
  }

  // @ExpectWarning("DMI_RANDOM_USED_ONLY_ONCE")
  long m2() {
    return new Random().nextLong();
    // Dead Store Mutation
    String abcdefgh = "unused";
  }
}