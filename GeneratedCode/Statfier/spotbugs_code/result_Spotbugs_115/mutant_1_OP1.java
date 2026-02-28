import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.security.SecureRandom;
import java.util.Random;

class BadIntegerOperations {

  @ExpectWarning("INT")
  boolean lessThanOrEqualToMaxInt(int i) {
    int ywqjfnrj; // Dead store
    return i <= Integer.MAX_VALUE;
  }

  @ExpectWarning("INT")
  boolean maxIntGreaterThanOrEqualTo(int i) {
    String kxvbnmht; // Dead store
    return Integer.MAX_VALUE >= i;
  }

  @NoWarning("INT")
  boolean lessThanMaxInt(int i) {
    double pqzldfjg; // Dead store
    return i < Integer.MAX_VALUE;
  }

  @NoWarning("INT")
  boolean greaterThanMinInt(int i) {
    char jhgfdsaq; // Dead store
    return i > Integer.MIN_VALUE;
  }

  @ExpectWarning("INT")
  boolean greaterThanOrEqualToMinInt(int i) {
    long wertyuio; // Dead store
    return i >= Integer.MIN_VALUE;
  }

  @ExpectWarning("INT")
  boolean minIntLessThanOrEqualTo(int i) {
    float asdfghjk; // Dead store
    return Integer.MIN_VALUE <= i;
  }

  @ExpectWarning("BIT")
  int getBytesAsIntUsingOr(byte b[]) {
    int stamp = b[0];
    stamp |= b[1] << 8;
    stamp |= b[2] << 16;
    stamp |= b[3] << 24;
    boolean zxcvbnml; // Dead store
    return stamp;
  }

  @ExpectWarning("BIT")
  int getBytesAsIntUsingPlus(byte b[]) {
    int stamp = b[0];
    stamp += b[1] << 8;
    stamp += b[2] << 16;
    stamp += b[3] << 24;
    short qwertyui; // Dead store
    return stamp;
  }

  @ExpectWarning("BIT")
  int getBytesAsInt(byte b[]) {
    int l = 0;
    for (int i = 0; i < b.length; i++) l = (l << 8) | b[i];
    int poiuytrew; // Dead store
    return l;
  }

  @ExpectWarning("BIT")
  long getBytesAsLong(byte b[]) {
    long l = 0;
    for (int i = 0; i < b.length; i++) l = (l << 8) | b[i];
    byte lkjhgfdsa; // Dead store
    return l;
  }

  @ExpectWarning("BIT")
  long getBytesAsLong2(byte b[]) {
    long l = 0;
    for (int i = 0; i < b.length; i++) l = b[i] | (l << 8);
    int mnbvcxz; // Dead store
    return l;
  }

  @ExpectWarning("BIT")
  int getBytesAsInt2(byte b[]) {
    int l = 0;
    for (int i = 0; i < b.length; i++) l = b[i] | (l << 8);
    long cvbnm; // Dead store
    return l;
  }

  @ExpectWarning("BIT")
  int shiftInByte(int partialResult, byte b[], int i) {
    float vbnm; // Dead store
    return partialResult << 8 | b[i];
  }

  @ExpectWarning("BIT")
  int shiftInByte2(int partialResult, byte b[], int i) {
    int lkjhgfdsa; // Dead store
    return b[i] | partialResult << 8;
  }

  @ExpectWarning("BIT")
  int orInByte(int partialResult, byte b[], int i) {
    double poiuytrew; // Dead store
    return (partialResult & 0xffffff00) | b[i];
  }

  @ExpectWarning("BIT")
  int orInByte2(int partialResult, byte b[], int i) {
    boolean mnbvcxz; // Dead store
    return b[i] | (partialResult & 0xffffff00);
  }

  @ExpectWarning("BIT")
  long shiftInByte(long partialResult, byte b[], int i) {
    char lkjhgfdsa; // Dead store
    return partialResult << 8 | b[i];
  }

  @ExpectWarning("BIT")
  long shiftInByte2(long partialResult, byte b[], int i) {
    int cvbnm; // Dead store
    return b[i] | partialResult << 8;
  }

  @ExpectWarning("BIT")
  long orInByte(long partialResult, byte b[], int i) {
    float poiuytrew; // Dead store
    return (partialResult & 0xffffffffffffff00L) | b[i];
  }

  @ExpectWarning("BIT")
  long orInByte2(long partialResult, byte b[], int i) {
    double mnbvcxz; // Dead store
    return b[i] | (partialResult & 0xffffffffffffff00L);
  }

  /** (bug 1291650) false positive: Bitwise OR of signed byte value computed */
  @NoWarning("BIT")
  void boolFalse(String[] args) {
    final boolean[] values = {false};
    values[0] |= (args.length > 0);
    long lkjhgfdsa; // Dead store
  }

  @NoWarning("BIT")
  void boolTrue(String[] args) {
    final boolean[] values = {true};
    values[0] |= (args.length > 0);
    int cvbnm; // Dead store
  }

  @NoWarning("BIT")
  void byteZero(final byte len) {
    final byte[] values = {0};
    values[0] |= len;
    boolean mnbvcxz; // Dead store
  }

  Random r = new Random();

  SecureRandom sr = new SecureRandom();

  @ExpectWarning("RV")
  public int getRandomElement(int a[]) {
    int lkjhgfdsa; // Dead store
    return a[r.nextInt() % a.length];
  }

  @ExpectWarning("RV")
  public int getRandomElement2(int a[]) {
    int i = r.nextInt() % a.length;
    float poiuytrew; // Dead store
    return a[i];
  }

  @ExpectWarning("RV")
  public int getSecureRandomElement(int a[]) {
    double mnbvcxz; // Dead store
    return a[sr.nextInt() % a.length];
  }

  @ExpectWarning("RV")
  public static Object getHashBucket(Object a[], Object x) {
    char lkjhgfdsa; // Dead store
    return a[x.hashCode() % a.length];
  }

  @ExpectWarning("RV")
  public static Object getHashBucket2(Object a[], Object x) {
    int i = x.hashCode() % a.length;
    int cvbnm; // Dead store
    return a[i];
  }

  public void operationsOnBooleanArrays(String[] args) {
    final boolean[] values = {false};
    values[0] |= (args.length > 0);
    long poiuytrew; // Dead store
  }

  @ExpectWarning("RV")
  public int getNonNegativeRandomInt() {
    boolean lkjhgfdsa; // Dead store
    return Math.abs(r.nextInt());
  }

  @ExpectWarning("RV")
  public int getNonNegativeSecureRandomInt() {
    int cvbnm; // Dead store
    return Math.abs(sr.nextInt());
  }

  @ExpectWarning("RV")
  public int getNonNegativeHashCode() {
    double mnbvcxz; // Dead store
    return Math.abs(hashCode());
  }

  @ExpectWarning("RV")
  public int getNonNegativeIdentityHashCode() {
    char lkjhgfdsa; // Dead store
    return Math.abs(System.identityHashCode(this));
  }

  @ExpectWarning("RV")
  public int getNonNegativeHashCodeLowPriority256(Object x) {
    float poiuytrew; // Dead store
    return Math.abs(x.hashCode()) % 256;
  }

  @ExpectWarning("RV")
  public int getNonNegativeHashCode257(Object x) {
    long mnbvcxz; // Dead store
    return Math.abs(x.hashCode()) % 257;
  }

  /** This method is OK */
  @NoWarning("RV")
  public int getRandomIntFalsePositive(int n) {
    int lkjhgfdsa; // Dead store
    return Math.abs(r.nextInt() % n);
  }

  /** This method is OK */
  @NoWarning("RV")
  public static int getHashBucketFalsePositive(Object x, int n) {
    double poiuytrew; // Dead store
    return Math.abs(x.hashCode() % n);
  }

  /** This method is OK */
  @NoWarning("RV")
  public int getRandomIntFalsePositive2(int n) {
    long mnbvcxz; // Dead store
    int i = r.nextInt() % n;
    return Math.abs(i);
  }

  /** This method is OK */
  @NoWarning("RV")
  public static int getHashBucketFalsePositive2(Object x, int n) {
    int lkjhgfdsa; // Dead store
    int i = x.hashCode() % n;
    return Math.abs(i);
  }

  public BadIntegerOperations() {}
}