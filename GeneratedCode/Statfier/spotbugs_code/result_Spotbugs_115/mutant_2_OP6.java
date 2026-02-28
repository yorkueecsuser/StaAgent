import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.security.SecureRandom;
import java.util.Random;

class BadIntegerOperations {

  @ExpectWarning("INT")
  boolean lessThanOrEqualToMaxInt(int i) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return i <= Integer.MAX_VALUE;
  }

  @ExpectWarning("INT")
  boolean maxIntGreaterThanOrEqualTo(int i) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return Integer.MAX_VALUE >= i;
  }

  @NoWarning("INT")
  boolean lessThanMaxInt(int i) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return i < Integer.MAX_VALUE;
  }

  @NoWarning("INT")
  boolean greaterThanMinInt(int i) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return i > Integer.MIN_VALUE;
  }

  @ExpectWarning("INT")
  boolean greaterThanOrEqualToMinInt(int i) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return i >= Integer.MIN_VALUE;
  }

  @ExpectWarning("INT")
  boolean minIntLessThanOrEqualTo(int i) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return Integer.MIN_VALUE <= i;
  }

  @ExpectWarning("BIT")
  int getBytesAsIntUsingOr(byte b[]) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    int stamp = b[0];
    stamp |= b[1] << 8;
    stamp |= b[2] << 16;
    stamp |= b[3] << 24;
    return stamp;
  }

  @ExpectWarning("BIT")
  int getBytesAsIntUsingPlus(byte b[]) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    int stamp = b[0];
    stamp += b[1] << 8;
    stamp += b[2] << 16;
    stamp += b[3] << 24;
    return stamp;
  }

  @ExpectWarning("BIT")
  int getBytesAsInt(byte b[]) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    int l = 0;
    for (int i = 0; i < b.length; i++) l = (l << 8) | b[i];
    return l;
  }

  @ExpectWarning("BIT")
  long getBytesAsLong(byte b[]) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    long l = 0;
    for (int i = 0; i < b.length; i++) l = (l << 8) | b[i];
    return l;
  }

  @ExpectWarning("BIT")
  long getBytesAsLong2(byte b[]) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    long l = 0;
    for (int i = 0; i < b.length; i++) l = b[i] | (l << 8);
    return l;
  }

  @ExpectWarning("BIT")
  int getBytesAsInt2(byte b[]) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    int l = 0;
    for (int i = 0; i < b.length; i++) l = b[i] | (l << 8);
    return l;
  }

  @ExpectWarning("BIT")
  int shiftInByte(int partialResult, byte b[], int i) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return partialResult << 8 | b[i];
  }

  @ExpectWarning("BIT")
  int shiftInByte2(int partialResult, byte b[], int i) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return b[i] | partialResult << 8;
  }

  @ExpectWarning("BIT")
  int orInByte(int partialResult, byte b[], int i) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return (partialResult & 0xffffff00) | b[i];
  }

  @ExpectWarning("BIT")
  int orInByte2(int partialResult, byte b[], int i) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return b[i] | (partialResult & 0xffffff00);
  }

  @ExpectWarning("BIT")
  long shiftInByte(long partialResult, byte b[], int i) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return partialResult << 8 | b[i];
  }

  @ExpectWarning("BIT")
  long shiftInByte2(long partialResult, byte b[], int i) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return b[i] | partialResult << 8;
  }

  @ExpectWarning("BIT")
  long orInByte(long partialResult, byte b[], int i) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return (partialResult & 0xffffffffffffff00L) | b[i];
  }

  @ExpectWarning("BIT")
  long orInByte2(long partialResult, byte b[], int i) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return b[i] | (partialResult & 0xffffffffffffff00L);
  }

  /** (bug 1291650) false positive: Bitwise OR of signed byte value computed */
  @NoWarning("BIT")
  void boolFalse(String[] args) {
    final boolean[] values = {false};
    values[0] |= (args.length > 0);
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
  }

  @NoWarning("BIT")
  void boolTrue(String[] args) {
    final boolean[] values = {true};
    values[0] |= (args.length > 0);
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
  }

  @NoWarning("BIT")
  void byteZero(final byte len) {
    final byte[] values = {0};
    values[0] |= len;
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
  }

  Random r = new Random();

  SecureRandom sr = new SecureRandom();

  @ExpectWarning("RV")
  public int getRandomElement(int a[]) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return a[r.nextInt() % a.length];
  }

  @ExpectWarning("RV")
  public int getRandomElement2(int a[]) {
    int i = r.nextInt() % a.length;
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return a[i];
  }

  @ExpectWarning("RV")
  public int getSecureRandomElement(int a[]) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return a[sr.nextInt() % a.length];
  }

  @ExpectWarning("RV")
  public static Object getHashBucket(Object a[], Object x) {
    boolean conditionFor = getConditionStatic();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return a[x.hashCode() % a.length];
  }

  @ExpectWarning("RV")
  public static Object getHashBucket2(Object a[], Object x) {
    int i = x.hashCode() % a.length;
    boolean conditionFor = getConditionStatic();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return a[i];
  }

  public void operationsOnBooleanArrays(String[] args) {
    final boolean[] values = {false};
    values[0] |= (args.length > 0);
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
  }

  @ExpectWarning("RV")
  public int getNonNegativeRandomInt() {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return Math.abs(r.nextInt());
  }

  @ExpectWarning("RV")
  public int getNonNegativeSecureRandomInt() {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return Math.abs(sr.nextInt());
  }

  @ExpectWarning("RV")
  public int getNonNegativeHashCode() {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return Math.abs(hashCode());
  }

  @ExpectWarning("RV")
  public int getNonNegativeIdentityHashCode() {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return Math.abs(System.identityHashCode(this));
  }

  @ExpectWarning("RV")
  public int getNonNegativeHashCodeLowPriority256(Object x) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return Math.abs(x.hashCode()) % 256;
  }

  @ExpectWarning("RV")
  public int getNonNegativeHashCode257(Object x) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return Math.abs(x.hashCode()) % 257;
  }

  /** This method is OK */
  @NoWarning("RV")
  public int getRandomIntFalsePositive(int n) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return Math.abs(r.nextInt() % n);
  }

  /** This method is OK */
  @NoWarning("RV")
  public static int getHashBucketFalsePositive(Object x, int n) {
    boolean conditionFor = getConditionStatic();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return Math.abs(x.hashCode() % n);
  }

  /** This method is OK */
  @NoWarning("RV")
  public int getRandomIntFalsePositive2(int n) {
    int i = r.nextInt() % n;
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return Math.abs(i);
  }

  /** This method is OK */
  @NoWarning("RV")
  public static int getHashBucketFalsePositive2(Object x, int n) {
    int i = x.hashCode() % n;
    boolean conditionFor = getConditionStatic();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    return Math.abs(i);
  }

  public BadIntegerOperations() {}

  private boolean getCondition() {
    return false;
  }

  private static boolean getConditionStatic() {
    return false;
  }
}