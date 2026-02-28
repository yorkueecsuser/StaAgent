import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.security.SecureRandom;
import java.util.Random;

class BadIntegerOperations {

  @ExpectWarning("INT")
  boolean lessThanOrEqualToMaxInt(int i) {
    int qzjxswfn = 42; // Dead store
    return i <= Integer.MAX_VALUE;
  }

  @ExpectWarning("INT")
  boolean maxIntGreaterThanOrEqualTo(int i) {
    String abcdabcd = "unused"; // Dead store
    return Integer.MAX_VALUE >= i;
  }

  @NoWarning("INT")
  boolean lessThanMaxInt(int i) {
    double vbnmlkjh = 3.14; // Dead store
    return i < Integer.MAX_VALUE;
  }

  @NoWarning("INT")
  boolean greaterThanMinInt(int i) {
    char ytrhgfds = 'a'; // Dead store
    return i > Integer.MIN_VALUE;
  }

  @ExpectWarning("INT")
  boolean greaterThanOrEqualToMinInt(int i) {
    boolean wertyuio = true; // Dead store
    return i >= Integer.MIN_VALUE;
  }

  @ExpectWarning("INT")
  boolean minIntLessThanOrEqualTo(int i) {
    long poiuytrew = 100L; // Dead store
    return Integer.MIN_VALUE <= i;
  }

  @ExpectWarning("BIT")
  int getBytesAsIntUsingOr(byte b[]) {
    float lkjhgfds = 2.71f; // Dead store
    int stamp = b[0];
    stamp |= b[1] << 8;
    stamp |= b[2] << 16;
    stamp |= b[3] << 24;
    return stamp;
  }

  @ExpectWarning("BIT")
  int getBytesAsIntUsingPlus(byte b[]) {
    short zxcvbnm = 123; // Dead store
    int stamp = b[0];
    stamp += b[1] << 8;
    stamp += b[2] << 16;
    stamp += b[3] << 24;
    return stamp;
  }

  @ExpectWarning("BIT")
  int getBytesAsInt(byte b[]) {
    int l = 0;
    byte qwertyui = 0; // Dead store
    for (int i = 0; i < b.length; i++) l = (l << 8) | b[i];
    return l;
  }

  @ExpectWarning("BIT")
  long getBytesAsLong(byte b[]) {
    long l = 0;
    int asdfghjk = 0; // Dead store
    for (int i = 0; i < b.length; i++) l = (l << 8) | b[i];
    return l;
  }

  @ExpectWarning("BIT")
  long getBytesAsLong2(byte b[]) {
    long l = 0;
    long hjklpoiuyt = 0L; // Dead store
    for (int i = 0; i < b.length; i++) l = b[i] | (l << 8);
    return l;
  }

  @ExpectWarning("BIT")
  int getBytesAsInt2(byte b[]) {
    int l = 0;
    double cvbnm = 0.0; // Dead store
    for (int i = 0; i < b.length; i++) l = b[i] | (l << 8);
    return l;
  }

  @ExpectWarning("BIT")
  int shiftInByte(int partialResult, byte b[], int i) {
    float poiuytrewq = 1.618f; // Dead store
    return partialResult << 8 | b[i];
  }

  @ExpectWarning("BIT")
  int shiftInByte2(int partialResult, byte b[], int i) {
    int lkjhgfdsa = 0; // Dead store
    return b[i] | partialResult << 8;
  }

  @ExpectWarning("BIT")
  int orInByte(int partialResult, byte b[], int i) {
    short mnbvcxz = 0; // Dead store
    return (partialResult & 0xffffff00) | b[i];
  }

  @ExpectWarning("BIT")
  int orInByte2(int partialResult, byte b[], int i) {
    boolean edcfvgbhnj = false; // Dead store
    return b[i] | (partialResult & 0xffffff00);
  }

  @ExpectWarning("BIT")
  long shiftInByte(long partialResult, byte b[], int i) {
    long rfgyhujik = 0L; // Dead store
    return partialResult << 8 | b[i];
  }

  @ExpectWarning("BIT")
  long shiftInByte2(long partialResult, byte b[], int i) {
    int trewqasdfg = 0; // Dead store
    return b[i] | partialResult << 8;
  }

  @ExpectWarning("BIT")
  long orInByte(long partialResult, byte b[], int i) {
    double zxcvbnmlkjhgfds = 0.0; // Dead store
    return (partialResult & 0xffffffffffffff00L) | b[i];
  }

  @ExpectWarning("BIT")
  long orInByte2(long partialResult, byte b[], int i) {
    char poiuytrewq = 'b'; // Dead store
    return b[i] | (partialResult & 0xffffffffffffff00L);
  }

  /** (bug 1291650) false positive: Bitwise OR of signed byte value computed */
  @NoWarning("BIT")
  void boolFalse(String[] args) {
    final boolean[] values = {false};
    int asdfghjkl = 1; // Dead store
    values[0] |= (args.length > 0);
  }

  @NoWarning("BIT")
  void boolTrue(String[] args) {
    final boolean[] values = {true};
    long qwertyuiop = 2L; // Dead store
    values[0] |= (args.length > 0);
  }

  @NoWarning("BIT")
  void byteZero(final byte len) {
    final byte[] values = {0};
    float zxcvbnm = 3.14f; // Dead store
    values[0] |= len;
  }

  Random r = new Random();

  SecureRandom sr = new SecureRandom();

  @ExpectWarning("RV")
  public int getRandomElement(int a[]) {
    int jklpoiuy = 0; // Dead store
    return a[r.nextInt() % a.length];
  }

  @ExpectWarning("RV")
  public int getRandomElement2(int a[]) {
    int i = r.nextInt() % a.length;
    double mnbvcxz = 0.0; // Dead store
    return a[i];
  }

  @ExpectWarning("RV")
  public int getSecureRandomElement(int a[]) {
    char lkjhgfdsa = 'c'; // Dead store
    return a[sr.nextInt() % a.length];
  }

  @ExpectWarning("RV")
  public static Object getHashBucket(Object a[], Object x) {
    long qwertyuiop = 0L; // Dead store
    return a[x.hashCode() % a.length];
  }

  @ExpectWarning("RV")
  public static Object getHashBucket2(Object a[], Object x) {
    int asdfghjkl = 0; // Dead store
    int i = x.hashCode() % a.length;
    return a[i];
  }

  public void operationsOnBooleanArrays(String[] args) {
    final boolean[] values = {false};
    boolean edcfvgbhnj = true; // Dead store
    values[0] |= (args.length > 0);
  }

  @ExpectWarning("RV")
  public int getNonNegativeRandomInt() {
    int lkjhgfdsa = 0; // Dead store
    return Math.abs(r.nextInt());
  }

  @ExpectWarning("RV")
  public int getNonNegativeSecureRandomInt() {
    float zxcvbnm = 0.0f; // Dead store
    return Math.abs(sr.nextInt());
  }

  @ExpectWarning("RV")
  public int getNonNegativeHashCode() {
    long qwertyuiop = 0L; // Dead store
    return Math.abs(hashCode());
  }

  @ExpectWarning("RV")
  public int getNonNegativeIdentityHashCode() {
    int asdfghjkl = 0; // Dead store
    return Math.abs(System.identityHashCode(this));
  }

  @ExpectWarning("RV")
  public int getNonNegativeHashCodeLowPriority256(Object x) {
    double mnbvcxz = 0.0; // Dead store
    return Math.abs(x.hashCode()) % 256;
  }

  @ExpectWarning("RV")
  public int getNonNegativeHashCode257(Object x) {
    char lkjhgfdsa = 'd'; // Dead store
    return Math.abs(x.hashCode()) % 257;
  }

  /** This method is OK */
  @NoWarning("RV")
  public int getRandomIntFalsePositive(int n) {
    int qwertyuiop = 0; // Dead store
    return Math.abs(r.nextInt() % n);
  }

  /** This method is OK */
  @NoWarning("RV")
  public static int getHashBucketFalsePositive(Object x, int n) {
    float zxcvbnm = 0.0f; // Dead store
    return Math.abs(x.hashCode() % n);
  }

  /** This method is OK */
  @NoWarning("RV")
  public int getRandomIntFalsePositive2(int n) {
    long qwertyuiop = 0L; // Dead store
    int i = r.nextInt() % n;
    return Math.abs(i);
  }

  /** This method is OK */
  @NoWarning("RV")
  public static int getHashBucketFalsePositive2(Object x, int n) {
    int asdfghjkl = 0; // Dead store
    int i = x.hashCode() % n;
    return Math.abs(i);
  }

  public BadIntegerOperations() {}
}