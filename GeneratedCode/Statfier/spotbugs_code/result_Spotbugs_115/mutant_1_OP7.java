import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.security.SecureRandom;
import java.util.Random;

class BadIntegerOperations {

  @ExpectWarning("INT")
  boolean lessThanOrEqualToMaxInt(int i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return i <= Integer.MAX_VALUE;
  }

  @ExpectWarning("INT")
  boolean maxIntGreaterThanOrEqualTo(int i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return Integer.MAX_VALUE >= i;
  }

  @NoWarning("INT")
  boolean lessThanMaxInt(int i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return i < Integer.MAX_VALUE;
  }

  @NoWarning("INT")
  boolean greaterThanMinInt(int i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return i > Integer.MIN_VALUE;
  }

  @ExpectWarning("INT")
  boolean greaterThanOrEqualToMinInt(int i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return i >= Integer.MIN_VALUE;
  }

  @ExpectWarning("INT")
  boolean minIntLessThanOrEqualTo(int i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return Integer.MIN_VALUE <= i;
  }

  @ExpectWarning("BIT")
  int getBytesAsIntUsingOr(byte b[]) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    int stamp = b[0];
    stamp |= b[1] << 8;
    stamp |= b[2] << 16;
    stamp |= b[3] << 24;
    return stamp;
  }

  @ExpectWarning("BIT")
  int getBytesAsIntUsingPlus(byte b[]) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    int stamp = b[0];
    stamp += b[1] << 8;
    stamp += b[2] << 16;
    stamp += b[3] << 24;
    return stamp;
  }

  @ExpectWarning("BIT")
  int getBytesAsInt(byte b[]) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    int l = 0;
    for (int i = 0; i < b.length; i++) l = (l << 8) | b[i];
    return l;
  }

  @ExpectWarning("BIT")
  long getBytesAsLong(byte b[]) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    long l = 0;
    for (int i = 0; i < b.length; i++) l = (l << 8) | b[i];
    return l;
  }

  @ExpectWarning("BIT")
  long getBytesAsLong2(byte b[]) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    long l = 0;
    for (int i = 0; i < b.length; i++) l = b[i] | (l << 8);
    return l;
  }

  @ExpectWarning("BIT")
  int getBytesAsInt2(byte b[]) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    int l = 0;
    for (int i = 0; i < b.length; i++) l = b[i] | (l << 8);
    return l;
  }

  @ExpectWarning("BIT")
  int shiftInByte(int partialResult, byte b[], int i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return partialResult << 8 | b[i];
  }

  @ExpectWarning("BIT")
  int shiftInByte2(int partialResult, byte b[], int i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return b[i] | partialResult << 8;
  }

  @ExpectWarning("BIT")
  int orInByte(int partialResult, byte b[], int i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return (partialResult & 0xffffff00) | b[i];
  }

  @ExpectWarning("BIT")
  int orInByte2(int partialResult, byte b[], int i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return b[i] | (partialResult & 0xffffff00);
  }

  @ExpectWarning("BIT")
  long shiftInByte(long partialResult, byte b[], int i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return partialResult << 8 | b[i];
  }

  @ExpectWarning("BIT")
  long shiftInByte2(long partialResult, byte b[], int i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return b[i] | partialResult << 8;
  }

  @ExpectWarning("BIT")
  long orInByte(long partialResult, byte b[], int i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return (partialResult & 0xffffffffffffff00L) | b[i];
  }

  @ExpectWarning("BIT")
  long orInByte2(long partialResult, byte b[], int i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return b[i] | (partialResult & 0xffffffffffffff00L);
  }

  /** (bug 1291650) false positive: Bitwise OR of signed byte value computed */
  @NoWarning("BIT")
  void boolFalse(String[] args) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    final boolean[] values = {false};
    values[0] |= (args.length > 0);
  }

  @NoWarning("BIT")
  void boolTrue(String[] args) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    final boolean[] values = {true};
    values[0] |= (args.length > 0);
  }

  @NoWarning("BIT")
  void byteZero(final byte len) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    final byte[] values = {0};
    values[0] |= len;
  }

  Random r = new Random();

  SecureRandom sr = new SecureRandom();

  @ExpectWarning("RV")
  public int getRandomElement(int a[]) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return a[r.nextInt() % a.length];
  }

  @ExpectWarning("RV")
  public int getRandomElement2(int a[]) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    int i = r.nextInt() % a.length;
    return a[i];
  }

  @ExpectWarning("RV")
  public int getSecureRandomElement(int a[]) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return a[sr.nextInt() % a.length];
  }

  @ExpectWarning("RV")
  public static Object getHashBucket(Object a[], Object x) {
    boolean conditionWhile = getConditionStatic();
    while (conditionWhile) { /* unreachable code */ }
    return a[x.hashCode() % a.length];
  }

  @ExpectWarning("RV")
  public static Object getHashBucket2(Object a[], Object x) {
    boolean conditionWhile = getConditionStatic();
    while (conditionWhile) { /* unreachable code */ }
    int i = x.hashCode() % a.length;
    return a[i];
  }

  public void operationsOnBooleanArrays(String[] args) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    final boolean[] values = {false};
    values[0] |= (args.length > 0);
  }

  @ExpectWarning("RV")
  public int getNonNegativeRandomInt() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return Math.abs(r.nextInt());
  }

  @ExpectWarning("RV")
  public int getNonNegativeSecureRandomInt() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return Math.abs(sr.nextInt());
  }

  @ExpectWarning("RV")
  public int getNonNegativeHashCode() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return Math.abs(hashCode());
  }

  @ExpectWarning("RV")
  public int getNonNegativeIdentityHashCode() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return Math.abs(System.identityHashCode(this));
  }

  @ExpectWarning("RV")
  public int getNonNegativeHashCodeLowPriority256(Object x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return Math.abs(x.hashCode()) % 256;
  }

  @ExpectWarning("RV")
  public int getNonNegativeHashCode257(Object x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return Math.abs(x.hashCode()) % 257;
  }

  /** This method is OK */
  @NoWarning("RV")
  public int getRandomIntFalsePositive(int n) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return Math.abs(r.nextInt() % n);
  }

  /** This method is OK */
  @NoWarning("RV")
  public static int getHashBucketFalsePositive(Object x, int n) {
    boolean conditionWhile = getConditionStatic();
    while (conditionWhile) { /* unreachable code */ }
    return Math.abs(x.hashCode() % n);
  }

  /** This method is OK */
  @NoWarning("RV")
  public int getRandomIntFalsePositive2(int n) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    int i = r.nextInt() % n;
    return Math.abs(i);
  }

  /** This method is OK */
  @NoWarning("RV")
  public static int getHashBucketFalsePositive2(Object x, int n) {
    boolean conditionWhile = getConditionStatic();
    while (conditionWhile) { /* unreachable code */ }
    int i = x.hashCode() % n;
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