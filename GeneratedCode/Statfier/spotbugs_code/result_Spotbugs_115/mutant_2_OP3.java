import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.security.SecureRandom;
import java.util.Random;

class BadIntegerOperations {

  @ExpectWarning("INT")
  boolean lessThanOrEqualToMaxInt(int i) {
    return i <= Integer.MAX_VALUE;
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @ExpectWarning("INT")
  boolean maxIntGreaterThanOrEqualTo(int i) {
    return Integer.MAX_VALUE >= i;
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @NoWarning("INT")
  boolean lessThanMaxInt(int i) {
    return i < Integer.MAX_VALUE;
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @NoWarning("INT")
  boolean greaterThanMinInt(int i) {
    return i > Integer.MIN_VALUE;
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @ExpectWarning("INT")
  boolean greaterThanOrEqualToMinInt(int i) {
    return i >= Integer.MIN_VALUE;
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @ExpectWarning("INT")
  boolean minIntLessThanOrEqualTo(int i) {
    return Integer.MIN_VALUE <= i;
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @ExpectWarning("BIT")
  int getBytesAsIntUsingOr(byte b[]) {
    int stamp = b[0];
    stamp |= b[1] << 8;
    stamp |= b[2] << 16;
    stamp |= b[3] << 24;
    return stamp;
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @ExpectWarning("BIT")
  int getBytesAsIntUsingPlus(byte b[]) {
    int stamp = b[0];
    stamp += b[1] << 8;
    stamp += b[2] << 16;
    stamp += b[3] << 24;
    return stamp;
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @ExpectWarning("BIT")
  int getBytesAsInt(byte b[]) {
    int l = 0;
    for (int i = 0; i < b.length; i++) l = (l << 8) | b[i];
    return l;
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @ExpectWarning("BIT")
  long getBytesAsLong(byte b[]) {
    long l = 0;
    for (int i = 0; i < b.length; i++) l = (l << 8) | b[i];
    return l;
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @ExpectWarning("BIT")
  long getBytesAsLong2(byte b[]) {
    long l = 0;
    for (int i = 0; i < b.length; i++) l = b[i] | (l << 8);
    return l;
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @ExpectWarning("BIT")
  int getBytesAsInt2(byte b[]) {
    int l = 0;
    for (int i = 0; i < b.length; i++) l = b[i] | (l << 8);
    return l;
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @ExpectWarning("BIT")
  int shiftInByte(int partialResult, byte b[], int i) {
    return partialResult << 8 | b[i];
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @ExpectWarning("BIT")
  int shiftInByte2(int partialResult, byte b[], int i) {
    return b[i] | partialResult << 8;
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @ExpectWarning("BIT")
  int orInByte(int partialResult, byte b[], int i) {
    return (partialResult & 0xffffff00) | b[i];
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @ExpectWarning("BIT")
  int orInByte2(int partialResult, byte b[], int i) {
    return b[i] | (partialResult & 0xffffff00);
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @ExpectWarning("BIT")
  long shiftInByte(long partialResult, byte b[], int i) {
    return partialResult << 8 | b[i];
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @ExpectWarning("BIT")
  long shiftInByte2(long partialResult, byte b[], int i) {
    return b[i] | partialResult << 8;
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @ExpectWarning("BIT")
  long orInByte(long partialResult, byte b[], int i) {
    return (partialResult & 0xffffffffffffff00L) | b[i];
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @ExpectWarning("BIT")
  long orInByte2(long partialResult, byte b[], int i) {
    return b[i] | (partialResult & 0xffffffffffffff00L);
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  /** (bug 1291650) false positive: Bitwise OR of signed byte value computed */
  @NoWarning("BIT")
  void boolFalse(String[] args) {
    final boolean[] values = {false};
    values[0] |= (args.length > 0);
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @NoWarning("BIT")
  void boolTrue(String[] args) {
    final boolean[] values = {true};
    values[0] |= (args.length > 0);
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @NoWarning("BIT")
  void byteZero(final byte len) {
    final byte[] values = {0};
    values[0] |= len;
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  Random r = new Random();

  SecureRandom sr = new SecureRandom();

  @ExpectWarning("RV")
  public int getRandomElement(int a[]) {
    return a[r.nextInt() % a.length];
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @ExpectWarning("RV")
  public int getRandomElement2(int a[]) {
    int i = r.nextInt() % a.length;
    return a[i];
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @ExpectWarning("RV")
  public int getSecureRandomElement(int a[]) {
    return a[sr.nextInt() % a.length];
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @ExpectWarning("RV")
  public static Object getHashBucket(Object a[], Object x) {
    return a[x.hashCode() % a.length];
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @ExpectWarning("RV")
  public static Object getHashBucket2(Object a[], Object x) {
    int i = x.hashCode() % a.length;
    return a[i];
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  public void operationsOnBooleanArrays(String[] args) {
    final boolean[] values = {false};
    values[0] |= (args.length > 0);
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @ExpectWarning("RV")
  public int getNonNegativeRandomInt() {
    return Math.abs(r.nextInt());
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @ExpectWarning("RV")
  public int getNonNegativeSecureRandomInt() {
    return Math.abs(sr.nextInt());
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @ExpectWarning("RV")
  public int getNonNegativeHashCode() {
    return Math.abs(hashCode());
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @ExpectWarning("RV")
  public int getNonNegativeIdentityHashCode() {
    return Math.abs(System.identityHashCode(this));
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @ExpectWarning("RV")
  public int getNonNegativeHashCodeLowPriority256(Object x) {
    return Math.abs(x.hashCode()) % 256;
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  @ExpectWarning("RV")
  public int getNonNegativeHashCode257(Object x) {
    return Math.abs(x.hashCode()) % 257;
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  /** This method is OK */
  @NoWarning("RV")
  public int getRandomIntFalsePositive(int n) {
    return Math.abs(r.nextInt() % n);
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  /** This method is OK */
  @NoWarning("RV")
  public static int getHashBucketFalsePositive(Object x, int n) {
    return Math.abs(x.hashCode() % n);
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  /** This method is OK */
  @NoWarning("RV")
  public int getRandomIntFalsePositive2(int n) {
    int i = r.nextInt() % n;
    return Math.abs(i);
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  /** This method is OK */
  @NoWarning("RV")
  public static int getHashBucketFalsePositive2(Object x, int n) {
    int i = x.hashCode() % n;
    return Math.abs(i);
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  public BadIntegerOperations() {}

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always be false, but it's dynamically determined
  }
}