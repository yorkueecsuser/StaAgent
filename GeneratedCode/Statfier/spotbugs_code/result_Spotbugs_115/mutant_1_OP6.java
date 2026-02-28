import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.security.SecureRandom;
import java.util.Random;

class BadIntegerOperations {

  @ExpectWarning("INT")
  boolean lessThanOrEqualToMaxInt(int i) {
    return i <= Integer.MAX_VALUE;
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @ExpectWarning("INT")
  boolean maxIntGreaterThanOrEqualTo(int i) {
    return Integer.MAX_VALUE >= i;
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @NoWarning("INT")
  boolean lessThanMaxInt(int i) {
    return i < Integer.MAX_VALUE;
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @NoWarning("INT")
  boolean greaterThanMinInt(int i) {
    return i > Integer.MIN_VALUE;
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @ExpectWarning("INT")
  boolean greaterThanOrEqualToMinInt(int i) {
    return i >= Integer.MIN_VALUE;
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @ExpectWarning("INT")
  boolean minIntLessThanOrEqualTo(int i) {
    return Integer.MIN_VALUE <= i;
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @ExpectWarning("BIT")
  int getBytesAsIntUsingOr(byte b[]) {
    int stamp = b[0];
    stamp |= b[1] << 8;
    stamp |= b[2] << 16;
    stamp |= b[3] << 24;
    return stamp;
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @ExpectWarning("BIT")
  int getBytesAsIntUsingPlus(byte b[]) {
    int stamp = b[0];
    stamp += b[1] << 8;
    stamp += b[2] << 16;
    stamp += b[3] << 24;
    return stamp;
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @ExpectWarning("BIT")
  int getBytesAsInt(byte b[]) {
    int l = 0;
    for (int i = 0; i < b.length; i++) l = (l << 8) | b[i];
    return l;
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @ExpectWarning("BIT")
  long getBytesAsLong(byte b[]) {
    long l = 0;
    for (int i = 0; i < b.length; i++) l = (l << 8) | b[i];
    return l;
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @ExpectWarning("BIT")
  long getBytesAsLong2(byte b[]) {
    long l = 0;
    for (int i = 0; i < b.length; i++) l = b[i] | (l << 8);
    return l;
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @ExpectWarning("BIT")
  int getBytesAsInt2(byte b[]) {
    int l = 0;
    for (int i = 0; i < b.length; i++) l = b[i] | (l << 8);
    return l;
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @ExpectWarning("BIT")
  int shiftInByte(int partialResult, byte b[], int i) {
    return partialResult << 8 | b[i];
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @ExpectWarning("BIT")
  int shiftInByte2(int partialResult, byte b[], int i) {
    return b[i] | partialResult << 8;
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @ExpectWarning("BIT")
  int orInByte(int partialResult, byte b[], int i) {
    return (partialResult & 0xffffff00) | b[i];
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @ExpectWarning("BIT")
  int orInByte2(int partialResult, byte b[], int i) {
    return b[i] | (partialResult & 0xffffff00);
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @ExpectWarning("BIT")
  long shiftInByte(long partialResult, byte b[], int i) {
    return partialResult << 8 | b[i];
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @ExpectWarning("BIT")
  long shiftInByte2(long partialResult, byte b[], int i) {
    return b[i] | partialResult << 8;
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @ExpectWarning("BIT")
  long orInByte(long partialResult, byte b[], int i) {
    return (partialResult & 0xffffffffffffff00L) | b[i];
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @ExpectWarning("BIT")
  long orInByte2(long partialResult, byte b[], int i) {
    return b[i] | (partialResult & 0xffffffffffffff00L);
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  /** (bug 1291650) false positive: Bitwise OR of signed byte value computed */
  @NoWarning("BIT")
  void boolFalse(String[] args) {
    final boolean[] values = {false};
    values[0] |= (args.length > 0);
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @NoWarning("BIT")
  void boolTrue(String[] args) {
    final boolean[] values = {true};
    values[0] |= (args.length > 0);
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @NoWarning("BIT")
  void byteZero(final byte len) {
    final byte[] values = {0};
    values[0] |= len;
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  Random r = new Random();

  SecureRandom sr = new SecureRandom();

  @ExpectWarning("RV")
  public int getRandomElement(int a[]) {
    return a[r.nextInt() % a.length];
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @ExpectWarning("RV")
  public int getRandomElement2(int a[]) {
    int i = r.nextInt() % a.length;
    return a[i];
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @ExpectWarning("RV")
  public int getSecureRandomElement(int a[]) {
    return a[sr.nextInt() % a.length];
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @ExpectWarning("RV")
  public static Object getHashBucket(Object a[], Object x) {
    return a[x.hashCode() % a.length];
    // Inserting unreachable for loop
    boolean conditionFor = getConditionStatic();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @ExpectWarning("RV")
  public static Object getHashBucket2(Object a[], Object x) {
    int i = x.hashCode() % a.length;
    return a[i];
    // Inserting unreachable for loop
    boolean conditionFor = getConditionStatic();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  public void operationsOnBooleanArrays(String[] args) {
    final boolean[] values = {false};
    values[0] |= (args.length > 0);
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @ExpectWarning("RV")
  public int getNonNegativeRandomInt() {
    return Math.abs(r.nextInt());
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @ExpectWarning("RV")
  public int getNonNegativeSecureRandomInt() {
    return Math.abs(sr.nextInt());
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @ExpectWarning("RV")
  public int getNonNegativeHashCode() {
    return Math.abs(hashCode());
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @ExpectWarning("RV")
  public int getNonNegativeIdentityHashCode() {
    return Math.abs(System.identityHashCode(this));
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @ExpectWarning("RV")
  public int getNonNegativeHashCodeLowPriority256(Object x) {
    return Math.abs(x.hashCode()) % 256;
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @ExpectWarning("RV")
  public int getNonNegativeHashCode257(Object x) {
    return Math.abs(x.hashCode()) % 257;
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  /** This method is OK */
  @NoWarning("RV")
  public int getRandomIntFalsePositive(int n) {
    return Math.abs(r.nextInt() % n);
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  /** This method is OK */
  @NoWarning("RV")
  public static int getHashBucketFalsePositive(Object x, int n) {
    return Math.abs(x.hashCode() % n);
    // Inserting unreachable for loop
    boolean conditionFor = getConditionStatic();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  /** This method is OK */
  @NoWarning("RV")
  public int getRandomIntFalsePositive2(int n) {
    int i = r.nextInt() % n;
    return Math.abs(i);
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  /** This method is OK */
  @NoWarning("RV")
  public static int getHashBucketFalsePositive2(Object x, int n) {
    int i = x.hashCode() % n;
    return Math.abs(i);
    // Inserting unreachable for loop
    boolean conditionFor = getConditionStatic();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  public BadIntegerOperations() {}

  private boolean getCondition() {
    return false; // This will always return false, but it's dynamically determined
  }

  private static boolean getConditionStatic() {
    return false; // This will always return false, but it's dynamically determined
  }
}