import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.security.SecureRandom;
import java.util.Random;

class BadIntegerOperations {

  @ExpectWarning("INT")
  boolean lessThanOrEqualToMaxInt(int i) {
    return i <= Integer.MAX_VALUE;
    return i <= Integer.MAX_VALUE; // Mutant
  }

  @ExpectWarning("INT")
  boolean maxIntGreaterThanOrEqualTo(int i) {
    return Integer.MAX_VALUE >= i;
    return Integer.MAX_VALUE >= i; // Mutant
  }

  @NoWarning("INT")
  boolean lessThanMaxInt(int i) {
    return i < Integer.MAX_VALUE;
    return i < Integer.MAX_VALUE; // Mutant
  }

  @NoWarning("INT")
  boolean greaterThanMinInt(int i) {
    return i > Integer.MIN_VALUE;
    return i > Integer.MIN_VALUE; // Mutant
  }

  @ExpectWarning("INT")
  boolean greaterThanOrEqualToMinInt(int i) {
    return i >= Integer.MIN_VALUE;
    return i >= Integer.MIN_VALUE; // Mutant
  }

  @ExpectWarning("INT")
  boolean minIntLessThanOrEqualTo(int i) {
    return Integer.MIN_VALUE <= i;
    return Integer.MIN_VALUE <= i; // Mutant
  }

  @ExpectWarning("BIT")
  int getBytesAsIntUsingOr(byte b[]) {
    int stamp = b[0];
    stamp |= b[1] << 8;
    stamp |= b[2] << 16;
    stamp |= b[3] << 24;
    return stamp;
    // No mutant as the assignment involves method invocation
  }

  @ExpectWarning("BIT")
  int getBytesAsIntUsingPlus(byte b[]) {
    int stamp = b[0];
    stamp += b[1] << 8;
    stamp += b[2] << 16;
    stamp += b[3] << 24;
    return stamp;
    // No mutant as the assignment involves method invocation
  }

  @ExpectWarning("BIT")
  int getBytesAsInt(byte b[]) {
    int l = 0;
    for (int i = 0; i < b.length; i++) l = (l << 8) | b[i];
    return l;
    // No mutant as the assignment involves method invocation
  }

  @ExpectWarning("BIT")
  long getBytesAsLong(byte b[]) {
    long l = 0;
    for (int i = 0; i < b.length; i++) l = (l << 8) | b[i];
    return l;
    // No mutant as the assignment involves method invocation
  }

  @ExpectWarning("BIT")
  long getBytesAsLong2(byte b[]) {
    long l = 0;
    for (int i = 0; i < b.length; i++) l = b[i] | (l << 8);
    return l;
    // No mutant as the assignment involves method invocation
  }

  @ExpectWarning("BIT")
  int getBytesAsInt2(byte b[]) {
    int l = 0;
    for (int i = 0; i < b.length; i++) l = b[i] | (l << 8);
    return l;
    // No mutant as the assignment involves method invocation
  }

  @ExpectWarning("BIT")
  int shiftInByte(int partialResult, byte b[], int i) {
    return partialResult << 8 | b[i];
    // No mutant as the assignment involves method invocation
  }

  @ExpectWarning("BIT")
  int shiftInByte2(int partialResult, byte b[], int i) {
    return b[i] | partialResult << 8;
    // No mutant as the assignment involves method invocation
  }

  @ExpectWarning("BIT")
  int orInByte(int partialResult, byte b[], int i) {
    return (partialResult & 0xffffff00) | b[i];
    // No mutant as the assignment involves method invocation
  }

  @ExpectWarning("BIT")
  int orInByte2(int partialResult, byte b[], int i) {
    return b[i] | (partialResult & 0xffffff00);
    // No mutant as the assignment involves method invocation
  }

  @ExpectWarning("BIT")
  long shiftInByte(long partialResult, byte b[], int i) {
    return partialResult << 8 | b[i];
    // No mutant as the assignment involves method invocation
  }

  @ExpectWarning("BIT")
  long shiftInByte2(long partialResult, byte b[], int i) {
    return b[i] | partialResult << 8;
    // No mutant as the assignment involves method invocation
  }

  @ExpectWarning("BIT")
  long orInByte(long partialResult, byte b[], int i) {
    return (partialResult & 0xffffffffffffff00L) | b[i];
    // No mutant as the assignment involves method invocation
  }

  @ExpectWarning("BIT")
  long orInByte2(long partialResult, byte b[], int i) {
    return b[i] | (partialResult & 0xffffffffffffff00L);
    // No mutant as the assignment involves method invocation
  }

  /** (bug 1291650) false positive: Bitwise OR of signed byte value computed */
  @NoWarning("BIT")
  void boolFalse(String[] args) {
    final boolean[] values = {false};
    values[0] |= (args.length > 0);
    values[0] |= (args.length > 0); // Mutant
  }

  @NoWarning("BIT")
  void boolTrue(String[] args) {
    final boolean[] values = {true};
    values[0] |= (args.length > 0);
    values[0] |= (args.length > 0); // Mutant
  }

  @NoWarning("BIT")
  void byteZero(final byte len) {
    final byte[] values = {0};
    values[0] |= len;
    values[0] |= len; // Mutant
  }

  Random r = new Random();
  Random r_mutant = new Random(); // Mutant

  SecureRandom sr = new SecureRandom();
  SecureRandom sr_mutant = new SecureRandom(); // Mutant

  @ExpectWarning("RV")
  public int getRandomElement(int a[]) {
    return a[r.nextInt() % a.length];
    return a[r.nextInt() % a.length]; // Mutant
  }

  @ExpectWarning("RV")
  public int getRandomElement2(int a[]) {
    int i = r.nextInt() % a.length;
    return a[i];
    int i_mutant = r.nextInt() % a.length; // Mutant
  }

  @ExpectWarning("RV")
  public int getSecureRandomElement(int a[]) {
    return a[sr.nextInt() % a.length];
    return a[sr.nextInt() % a.length]; // Mutant
  }

  @ExpectWarning("RV")
  public static Object getHashBucket(Object a[], Object x) {
    return a[x.hashCode() % a.length];
    return a[x.hashCode() % a.length]; // Mutant
  }

  @ExpectWarning("RV")
  public static Object getHashBucket2(Object a[], Object x) {
    int i = x.hashCode() % a.length;
    return a[i];
    int i_mutant = x.hashCode() % a.length; // Mutant
  }

  public void operationsOnBooleanArrays(String[] args) {
    final boolean[] values = {false};
    values[0] |= (args.length > 0);
    values[0] |= (args.length > 0); // Mutant
  }

  @ExpectWarning("RV")
  public int getNonNegativeRandomInt() {
    return Math.abs(r.nextInt());
    return Math.abs(r.nextInt()); // Mutant
  }

  @ExpectWarning("RV")
  public int getNonNegativeSecureRandomInt() {
    return Math.abs(sr.nextInt());
    return Math.abs(sr.nextInt()); // Mutant
  }

  @ExpectWarning("RV")
  public int getNonNegativeHashCode() {
    return Math.abs(hashCode());
    return Math.abs(hashCode()); // Mutant
  }

  @ExpectWarning("RV")
  public int getNonNegativeIdentityHashCode() {
    return Math.abs(System.identityHashCode(this));
    return Math.abs(System.identityHashCode(this)); // Mutant
  }

  @ExpectWarning("RV")
  public int getNonNegativeHashCodeLowPriority256(Object x) {
    return Math.abs(x.hashCode()) % 256;
    return Math.abs(x.hashCode()) % 256; // Mutant
  }

  @ExpectWarning("RV")
  public int getNonNegativeHashCode257(Object x) {
    return Math.abs(x.hashCode()) % 257;
    return Math.abs(x.hashCode()) % 257; // Mutant
  }

  /** This method is OK */
  @NoWarning("RV")
  public int getRandomIntFalsePositive(int n) {
    return Math.abs(r.nextInt() % n);
    return Math.abs(r.nextInt() % n); // Mutant
  }

  /** This method is OK */
  @NoWarning("RV")
  public static int getHashBucketFalsePositive(Object x, int n) {
    return Math.abs(x.hashCode() % n);
    return Math.abs(x.hashCode() % n); // Mutant
  }

  /** This method is OK */
  @NoWarning("RV")
  public int getRandomIntFalsePositive2(int n) {
    int i = r.nextInt() % n;
    return Math.abs(i);
    int i_mutant = r.nextInt() % n; // Mutant
  }

  /** This method is OK */
  @NoWarning("RV")
  public static int getHashBucketFalsePositive2(Object x, int n) {
    int i = x.hashCode() % n;
    return Math.abs(i);
    int i_mutant = x.hashCode() % n; // Mutant
  }

  public BadIntegerOperations() {}
}