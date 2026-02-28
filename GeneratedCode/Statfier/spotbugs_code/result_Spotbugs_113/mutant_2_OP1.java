import java.security.SecureRandom;
import java.util.Random;

class Issue1464 {
  // @ExpectWarning("DMI_RANDOM_USED_ONLY_ONCE")
  long m1() {
    return new SecureRandom().nextLong();
    // Mutant code
    int qwertyui = 42; // Dead store
  }

  // @ExpectWarning("DMI_RANDOM_USED_ONLY_ONCE")
  long m2() {
    return new Random().nextLong();
    // Mutant code
    String asdfghjk = "unused"; // Dead store
  }
}