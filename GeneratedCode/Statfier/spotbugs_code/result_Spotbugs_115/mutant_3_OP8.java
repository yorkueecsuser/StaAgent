import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.security.SecureRandom;
import java.util.Random;

class BadIntegerOperations {

  @ExpectWarning("INT")
  boolean lessThanOrEqualToMaxInt(int i) {
    int z = i; // Mutant: Renamed 'i' to 'z'
    return z <= Integer.MAX_VALUE;
  }

  @ExpectWarning("INT")
  boolean maxIntGreaterThanOrEqualTo(int i) {
    int y = i; // Mutant: Renamed 'i' to 'y'
    return Integer.MAX_VALUE >= y;
  }

  @NoWarning("INT")
  boolean lessThanMaxInt(int i) {
    int x = i; // Mutant: Renamed 'i' to 'x'
    return x < Integer.MAX_VALUE;
  }

  @NoWarning("INT")
  boolean greaterThanMinInt(int i) {
    int w = i; // Mutant: Renamed 'i' to 'w'
    return w > Integer.MIN_VALUE;
  }

  @ExpectWarning("INT")
  boolean greaterThanOrEqualToMinInt(int i) {
    int v = i; // Mutant: Renamed 'i' to 'v'
    return v >= Integer.MIN_VALUE;
  }

  @ExpectWarning("INT")
  boolean minIntLessThanOrEqualTo(int i) {
    int u = i; // Mutant: Renamed 'i' to 'u'
    return Integer.MIN_VALUE <= u;
  }

  @ExpectWarning("BIT")
  int getBytesAsIntUsingOr(byte b[]) {
    int t = b[0]; // Mutant: Renamed'stamp' to 't'
    t |= b[1] << 8;
    t |= b[2] << 16;
    t |= b[3] << 24;
    return t;
  }

  @ExpectWarning("BIT")
  int getBytesAsIntUsingPlus(byte b[]) {
    int s = b[0]; // Mutant: Renamed'stamp' to's'
    s += b[1] << 8;
    s += b[2] << 16;
    s += b[3] << 24;
    return s;
  }

  @ExpectWarning("BIT")
  int getBytesAsInt(byte b[]) {
    int r = 0; // Mutant: Renamed 'l' to 'r'
    for (int q = 0; q < b.length; q++) r = (r << 8) | b[q];
    return r;
  }

  @ExpectWarning("BIT")
  long getBytesAsLong(byte b[]) {
    long p = 0; // Mutant: Renamed 'l' to 'p'
    for (int o = 0; o < b.length; o++) p = (p << 8) | b[o];
    return p;
  }

  @ExpectWarning("BIT")
  long getBytesAsLong2(byte b[]) {
    long n = 0; // Mutant: Renamed 'l' to 'n'
    for (int m = 0; m < b.length; m++) n = b[m] | (n << 8);
    return n;
  }

  @ExpectWarning("BIT")
  int getBytesAsInt2(byte b[]) {
    int l = 0; // Mutant: Renamed 'l' to 'l' (already 'l', so using different context)
    for (int k = 0; k < b.length; k++) l = b[k] | (l << 8);
    return l;
  }

  @ExpectWarning("BIT")
  int shiftInByte(int partialResult, byte b[], int i) {
    int j = partialResult; // Mutant: Renamed 'partialResult' to 'j'
    return j << 8 | b[i];
  }

  @ExpectWarning("BIT")
  int shiftInByte2(int partialResult, byte b[], int i) {
    int h = partialResult; // Mutant: Renamed 'partialResult' to 'h'
    return b[i] | h << 8;
  }

  @ExpectWarning("BIT")
  int orInByte(int partialResult, byte b[], int i) {
    int g = partialResult; // Mutant: Renamed 'partialResult' to 'g'
    return (g & 0xffffff00) | b[i];
  }

  @ExpectWarning("BIT")
  int orInByte2(int partialResult, byte b[], int i) {
    int f = partialResult; // Mutant: Renamed 'partialResult' to 'f'
    return b[i] | (f & 0xffffff00);
  }

  @ExpectWarning("BIT")
  long shiftInByte(long partialResult, byte b[], int i) {
    long e = partialResult; // Mutant: Renamed 'partialResult' to 'e'
    return e << 8 | b[i];
  }

  @ExpectWarning("BIT")
  long shiftInByte2(long partialResult, byte b[], int i) {
    long d = partialResult; // Mutant: Renamed 'partialResult' to 'd'
    return b[i] | d << 8;
  }

  @ExpectWarning("BIT")
  long orInByte(long partialResult, byte b[], int i) {
    long c = partialResult; // Mutant: Renamed 'partialResult' to 'c'
    return (c & 0xffffffffffffff00L) | b[i];
  }

  @ExpectWarning("BIT")
  long orInByte2(long partialResult, byte b[], int i) {
    long bVar = partialResult; // Mutant: Renamed 'partialResult' to 'bVar'
    return b[i] | (bVar & 0xffffffffffffff00L);
  }

  /** (bug 1291650) false positive: Bitwise OR of signed byte value computed */
  @NoWarning("BIT")
  void boolFalse(String[] args) {
    final boolean[] values = {false};
    values[0] |= (args.length > 0);
  }

  @NoWarning("BIT")
  void boolTrue(String[] args) {
    final boolean[] values = {true};
    values[0] |= (args.length > 0);
  }

  @NoWarning("BIT")
  void byteZero(final byte len) {
    final byte[] values = {0};
    values[0] |= len;
  }

  Random r = new Random();

  SecureRandom sr = new SecureRandom();

  @ExpectWarning("RV")
  public int getRandomElement(int a[]) {
    int aIndex = r.nextInt() % a.length; // Mutant: Renamed 'i' to 'aIndex'
    return a[aIndex];
  }

  @ExpectWarning("RV")
  public int getRandomElement2(int a[]) {
    int bIndex = r.nextInt() % a.length; // Mutant: Renamed 'i' to 'bIndex'
    return a[bIndex];
  }

  @ExpectWarning("RV")
  public int getSecureRandomElement(int a[]) {
    int cIndex = sr.nextInt() % a.length; // Mutant: Renamed 'i' to 'cIndex'
    return a[cIndex];
  }

  @ExpectWarning("RV")
  public static Object getHashBucket(Object a[], Object x) {
    int dIndex = x.hashCode() % a.length; // Mutant: Renamed 'i' to 'dIndex'
    return a[dIndex];
  }

  @ExpectWarning("RV")
  public static Object getHashBucket2(Object a[], Object x) {
    int eIndex = x.hashCode() % a.length; // Mutant: Renamed 'i' to 'eIndex'
    return a[eIndex];
  }

  public void operationsOnBooleanArrays(String[] args) {
    final boolean[] values = {false};
    values[0] |= (args.length > 0);
  }

  @ExpectWarning("RV")
  public int getNonNegativeRandomInt() {
    int fValue = r.nextInt(); // Mutant: Renamed 'i' to 'fValue'
    return Math.abs(fValue);
  }

  @ExpectWarning("RV")
  public int getNonNegativeSecureRandomInt() {
    int gValue = sr.nextInt(); // Mutant: Renamed 'i' to 'gValue'
    return Math.abs(gValue);
  }

  @ExpectWarning("RV")
  public int getNonNegativeHashCode() {
    int hValue = hashCode(); // Mutant: Renamed 'i' to 'hValue'
    return Math.abs(hValue);
  }

  @ExpectWarning("RV")
  public int getNonNegativeIdentityHashCode() {
    int iValue = System.identityHashCode(this); // Mutant: Renamed 'i' to 'iValue'
    return Math.abs(iValue);
  }

  @ExpectWarning("RV")
  public int getNonNegativeHashCodeLowPriority256(Object x) {
    int jValue = x.hashCode(); // Mutant: Renamed 'i' to 'jValue'
    return Math.abs(jValue) % 256;
  }

  @ExpectWarning("RV")
  public int getNonNegativeHashCode257(Object x) {
    int kValue = x.hashCode(); // Mutant: Renamed 'i' to 'kValue'
    return Math.abs(kValue) % 257;
  }

  /** This method is OK */
  @NoWarning("RV")
  public int getRandomIntFalsePositive(int n) {
    int lValue = r.nextInt() % n; // Mutant: Renamed 'i' to 'lValue'
    return Math.abs(lValue);
  }

  /** This method is OK */
  @NoWarning("RV")
  public static int getHashBucketFalsePositive(Object x, int n) {
    int mValue = x.hashCode() % n; // Mutant: Renamed 'i' to'mValue'
    return Math.abs(mValue);
  }

  /** This method is OK */
  @NoWarning("RV")
  public int getRandomIntFalsePositive2(int n) {
    int nIndex = r.nextInt() % n; // Mutant: Renamed 'i' to 'nIndex'
    return Math.abs(nIndex);
  }

  /** This method is OK */
  @NoWarning("RV")
  public static int getHashBucketFalsePositive2(Object x, int n) {
    int oIndex = x.hashCode() % n; // Mutant: Renamed 'i' to 'oIndex'
    return Math.abs(oIndex);
  }

  public BadIntegerOperations() {}
}