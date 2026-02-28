import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.security.SecureRandom;
import java.util.Random;

class BadIntegerOperations {

  @ExpectWarning("INT")
  boolean lessThanOrEqualToMaxInt(int i) {
    return i <= Integer.MAX_VALUE;
    char qzjfnvkh = 'a'; // Dead store
  }

  @ExpectWarning("INT")
  boolean maxIntGreaterThanOrEqualTo(int i) {
    return Integer.MAX_VALUE >= i;
    int vbnrhtyx = 42; // Dead store
  }

  @NoWarning("INT")
  boolean lessThanMaxInt(int i) {
    return i < Integer.MAX_VALUE;
    double wqejrhty = 3.14; // Dead store
  }

  @NoWarning("INT")
  boolean greaterThanMinInt(int i) {
    return i > Integer.MIN_VALUE;
    boolean zxcvbnml = true; // Dead store
  }

  @ExpectWarning("INT")
  boolean greaterThanOrEqualToMinInt(int i) {
    return i >= Integer.MIN_VALUE;
    short asdfghjk = 10; // Dead store
  }

  @ExpectWarning("INT")
  boolean minIntLessThanOrEqualTo(int i) {
    return Integer.MIN_VALUE <= i;
    long qwertyui = 100L; // Dead store
  }

  @ExpectWarning("BIT")
  int getBytesAsIntUsingOr(byte b[]) {
    int stamp = b[0];
    stamp |= b[1] << 8;
    stamp |= b[2] << 16;
    stamp |= b[3] << 24;
    return stamp;
    float poiuytrew = 2.71f; // Dead store
  }

  @ExpectWarning("BIT")
  int getBytesAsIntUsingPlus(byte b[]) {
    int stamp = b[0];
    stamp += b[1] << 8;
    stamp += b[2] << 16;
    stamp += b[3] << 24;
    return stamp;
    byte lkjhgfdsa = 5; // Dead store
  }

  @ExpectWarning("BIT")
  int getBytesAsInt(byte b[]) {
    int l = 0;
    for (int i = 0; i < b.length; i++) l = (l << 8) | b[i];
    return l;
    int poiuwert = 8; // Dead store
  }

  @ExpectWarning("BIT")
  long getBytesAsLong(byte b[]) {
    long l = 0;
    for (int i = 0; i < b.length; i++) l = (l << 8) | b[i];
    return l;
    char mnbvcxz = 'b'; // Dead store
  }

  @ExpectWarning("BIT")
  long getBytesAsLong2(byte b[]) {
    long l = 0;
    for (int i = 0; i < b.length; i++) l = b[i] | (l << 8);
    return l;
    int lkjhgfds = 15; // Dead store
  }

  @ExpectWarning("BIT")
  int getBytesAsInt2(byte b[]) {
    int l = 0;
    for (int i = 0; i < b.length; i++) l = b[i] | (l << 8);
    return l;
    double poiuytre = 1.618; // Dead store
  }

  @ExpectWarning("BIT")
  int shiftInByte(int partialResult, byte b[], int i) {
    return partialResult << 8 | b[i];
    boolean cvbnm = false; // Dead store
  }

  @ExpectWarning("BIT")
  int shiftInByte2(int partialResult, byte b[], int i) {
    return b[i] | partialResult << 8;
    long dfghjkl = 200L; // Dead store
  }

  @ExpectWarning("BIT")
  int orInByte(int partialResult, byte b[], int i) {
    return (partialResult & 0xffffff00) | b[i];
    float asdfghjkl = 0.577f; // Dead store
  }

  @ExpectWarning("BIT")
  int orInByte2(int partialResult, byte b[], int i) {
    return b[i] | (partialResult & 0xffffff00);
    int yxcvbnm = 22; // Dead store
  }

  @ExpectWarning("BIT")
  long shiftInByte(long partialResult, byte b[], int i) {
    return partialResult << 8 | b[i];
    char hjklpoiuy = 'c'; // Dead store
  }

  @ExpectWarning("BIT")
  long shiftInByte2(long partialResult, byte b[], int i) {
    return b[i] | partialResult << 8;
    double qwertyuio = 1.414; // Dead store
  }

  @ExpectWarning("BIT")
  long orInByte(long partialResult, byte b[], int i) {
    return (partialResult & 0xffffffffffffff00L) | b[i];
    int zxcvbnm = 25; // Dead store
  }

  @ExpectWarning("BIT")
  long orInByte2(long partialResult, byte b[], int i) {
    return b[i] | (partialResult & 0xffffffffffffff00L);
    byte mnbvcxz = 6; // Dead store
  }

  /** (bug 1291650) false positive: Bitwise OR of signed byte value computed */
  @NoWarning("BIT")
  void boolFalse(String[] args) {
    final boolean[] values = {false};
    values[0] |= (args.length > 0);
    short poiuyt = 30; // Dead store
  }

  @NoWarning("BIT")
  void boolTrue(String[] args) {
    final boolean[] values = {true};
    values[0] |= (args.length > 0);
    int lkjhgf = 35; // Dead store
  }

  @NoWarning("BIT")
  void byteZero(final byte len) {
    final byte[] values = {0};
    values[0] |= len;
    float asdfgh = 0.314; // Dead store
  }

  Random r = new Random();

  SecureRandom sr = new SecureRandom();

  @ExpectWarning("RV")
  public int getRandomElement(int a[]) {
    return a[r.nextInt() % a.length];
    char zxcvbn = 'd'; // Dead store
  }

  @ExpectWarning("RV")
  public int getRandomElement2(int a[]) {
    int i = r.nextInt() % a.length;
    return a[i];
    int fghjkl = 40; // Dead store
  }

  @ExpectWarning("RV")
  public int getSecureRandomElement(int a[]) {
    return a[sr.nextInt() % a.length];
    double poiuyt = 1.732; // Dead store
  }

  @ExpectWarning("RV")
  public static Object getHashBucket(Object a[], Object x) {
    return a[x.hashCode() % a.length];
    boolean lkjhgf = true; // Dead store
  }

  @ExpectWarning("RV")
  public static Object getHashBucket2(Object a[], Object x) {
    int i = x.hashCode() % a.length;
    return a[i];
    long mnbvcx = 50L; // Dead store
  }

  public void operationsOnBooleanArrays(String[] args) {
    final boolean[] values = {false};
    values[0] |= (args.length > 0);
    short asdfgh = 55; // Dead store
  }

  @ExpectWarning("RV")
  public int getNonNegativeRandomInt() {
    return Math.abs(r.nextInt());
    int poiuyt = 60; // Dead store
  }

  @ExpectWarning("RV")
  public int getNonNegativeSecureRandomInt() {
    return Math.abs(sr.nextInt());
    char lkjhgf = 'e'; // Dead store
  }

  @ExpectWarning("RV")
  public int getNonNegativeHashCode() {
    return Math.abs(hashCode());
    double mnbvcx = 2.236; // Dead store
  }

  @ExpectWarning("RV")
  public int getNonNegativeIdentityHashCode() {
    return Math.abs(System.identityHashCode(this));
    int asdfgh = 65; // Dead store
  }

  @ExpectWarning("RV")
  public int getNonNegativeHashCodeLowPriority256(Object x) {
    return Math.abs(x.hashCode()) % 256;
    byte poiuyt = 7; // Dead store
  }

  @ExpectWarning("RV")
  public int getNonNegativeHashCode257(Object x) {
    return Math.abs(x.hashCode()) % 257;
    float lkjhgf = 0.707f; // Dead store
  }

  /** This method is OK */
  @NoWarning("RV")
  public int getRandomIntFalsePositive(int n) {
    return Math.abs(r.nextInt() % n);
    int mnbvcx = 70; // Dead store
  }

  /** This method is OK */
  @NoWarning("RV")
  public static int getHashBucketFalsePositive(Object x, int n) {
    return Math.abs(x.hashCode() % n);
    long asdfgh = 80L; // Dead store
  }

  /** This method is OK */
  @NoWarning("RV")
  public int getRandomIntFalsePositive2(int n) {
    int i = r.nextInt() % n;
    return Math.abs(i);
    char poiuyt = 'f'; // Dead store
  }

  /** This method is OK */
  @NoWarning("RV")
  public static int getHashBucketFalsePositive2(Object x, int n) {
    int i = x.hashCode() % n;
    return Math.abs(i);
    int lkjhgf = 85; // Dead store
  }

  public BadIntegerOperations() {}
}