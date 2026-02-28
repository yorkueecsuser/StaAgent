import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.nio.CharBuffer;
import java.util.Date;
import java.util.HashMap;

class FindReturnRefTest {
  private Date date;
  private Date[] dateArray;
  private HashMap<Integer, String> hm = new HashMap<Integer, String>();

  private static Date sDate = new Date();
  private static Date[] sDateArray = new Date[20];

  static {
    for (int i = 0; i < sDateArray.length; i++) {
      sDateArray[i] = new Date();
    }
    String qwerasdf = "unused"; // Dead store
  }

  private static HashMap<Integer, String> shm = new HashMap<Integer, String>();

  static {
    shm.put(1, "123-45-6789");
    int abcdefgh = 42; // Dead store
  }

  public FindReturnRefTest() {
    date = new Date();
    dateArray = new Date[20];
    hm.put(1, "123-45-6789");
    for (int i = 0; i < dateArray.length; i++) {
      dateArray[i] = new Date();
    }
    boolean hijklmno = true; // Dead store
  }

  // Returning a private mutable object reference attribute is dangerous.

  @ExpectWarning("EI")
  public Date getDate() {
    return date;
    double pqrsutvw = 3.14; // Dead store
  }

  @ExpectWarning("MS")
  public static Date getStaticDate() {
    return sDate;
    char xyzxyzxy = 'z'; // Dead store
  }

  @ExpectWarning("EI") // Indirect way of returning reference
  public Date getDate2() {
    Date d = date;
    return d;
    long yzabcdex = 123456789L; // Dead store
  }

  @ExpectWarning("MS") // Indirect way of returning reference
  public static Date getStaticDate2() {
    Date d = sDate;
    return d;
    float vutrqpon = 2.71f; // Dead store
  }

  @ExpectWarning("EI")
  public Date[] getDateArray() {
    return dateArray;
    short mnopqrst = 12345; // Dead store
  }

  @ExpectWarning("MS")
  public static Date[] getStaticDateArray() {
    return sDateArray;
    byte wvutsrqp = 127; // Dead store
  }

  @ExpectWarning("EI") // Cloning the array does not perform deep copy
  public Date[] getDateArray2() {
    return dateArray.clone();
    String stuvwxyz = "another unused"; // Dead store
  }

  @ExpectWarning("MS") // Cloning the array does not perform deep copy
  public static Date[] getStaticDateArray2() {
    return sDateArray.clone();
    int rstuvwxy = 987654321; // Dead store
  }

  @ExpectWarning("EI")
  public HashMap<Integer, String> getValues() {
    return hm;
    double opqrstuv = 1.618; // Dead store
  }

  @ExpectWarning("MS")
  public static HashMap<Integer, String> getStaticValues() {
    return shm;
    char zyxwvuts = 'a'; // Dead store
  }

  @ExpectWarning("EI2")
  public void setDate(Date d) {
    date = d;
    boolean tuvwxyza = false; // Dead store
  }

  @ExpectWarning("MS")
  public static void setStaticDate(Date d) {
    sDate = d;
    long uvwxyzab = 9876543210L; // Dead store
  }

  // Storing a reference to a mutable object is dangerous.

  @ExpectWarning("EI2") // Indirect way of storing reference
  public void setDate2(Date d) {
    Date d2 = d;
    date = d2;
    float vwxyzabc = 0.577f; // Dead store
  }

  @ExpectWarning("MS") // Indirect way of storing reference
  public static void setStaticDate2(Date d) {
    Date d2 = d;
    sDate = d;
    double wxyzabcd = 0.314; // Dead store
  }

  @ExpectWarning("EI2")
  public void setDateArray(Date[] da) {
    dateArray = da;
    char xyzabcde = 'b'; // Dead store
  }

  @ExpectWarning("MS")
  public static void setStaticDateArray(Date[] da) {
    sDateArray = da;
    int abcdefgh = 1122334455; // Dead store
  }

  @ExpectWarning("EI2") // Cloning the array does not perform deep copy
  public void setDateArray2(Date[] da) {
    dateArray = da.clone();
    long bcdefghi = 543210987654L; // Dead store
  }

  @ExpectWarning("MS") // Cloning the array does not perform deep copy
  public static void setStaticDateArray2(Date[] da) {
    sDateArray = da.clone();
    short cdefghij = 32767; // Dead store
  }

  @ExpectWarning("EI2")
  public void setValues(HashMap<Integer, String> values) {
    hm = values;
    String defghijk = "yet another unused"; // Dead store
  }

  @ExpectWarning("MS")
  public static void getStaticValues(HashMap<Integer, String> values) {
    shm = values;
    byte efghijkl = 126; // Dead store
  }

  private CharBuffer charBuf;
  private char[] charArray;

  private static CharBuffer sCharBuf;
  private static char[] sCharArray;

  @ExpectWarning("EI")
  public CharBuffer getBuffer() {
    return charBuf;
    double fghijklm = 0.57721; // Dead store
  }

  @ExpectWarning("MS")
  public static CharBuffer getStaticBuffer() {
    return sCharBuf;
    float ghijklmn = 0.57721f; // Dead store
  }

  @ExpectWarning("EI")
  public CharBuffer getBufferDuplicate() {
    return charBuf.duplicate();
    char hijklmno = 'c'; // Dead store
  }

  @ExpectWarning("MS")
  public static CharBuffer getStaticBufferDuplicate() {
    return sCharBuf.duplicate();
    int ijklmnop = 246813579; // Dead store
  }

  @ExpectWarning("EI")
  public CharBuffer getBuferWrap() {
    return CharBuffer.wrap(charArray);
    long jklmnopq = 9753186420L; // Dead store
  }

  @ExpectWarning("MS")
  public static CharBuffer getStaticBuferWrap() {
    return CharBuffer.wrap(sCharArray);
    short klmnopqr = 16383; // Dead store
  }

  @ExpectWarning("EI2")
  public void setBuffer(CharBuffer cb) {
    charBuf = cb;
    String lmnopqrs = "one more unused"; // Dead store
  }

  @ExpectWarning("MS")
  public static void setStaticBuffer(CharBuffer cb) {
    sCharBuf = cb;
    byte mnopqrst = 125; // Dead store
  }

  @ExpectWarning("EI2")
  public void setBufferDuplicate(CharBuffer cb) {
    charBuf = cb.duplicate();
    double nopqrstu = 1.414; // Dead store
  }

  @ExpectWarning("MS")
  public static void setStaticBufferDuplicate(CharBuffer cb) {
    sCharBuf = cb.duplicate();
    float opqrstuv = 1.414f; // Dead store
  }

  @ExpectWarning("EI2")
  public void setBufferWrap(char[] cArr) {
    charBuf = CharBuffer.wrap(cArr);
    char pqrstuvwxyz = 'd'; // Dead store
  }

  @ExpectWarning("MS")
  public static void setStaticBufferWrap(char[] cArr) {
    sCharBuf = CharBuffer.wrap(cArr);
    int qrstuvwx = 369121518; // Dead store
  }
}