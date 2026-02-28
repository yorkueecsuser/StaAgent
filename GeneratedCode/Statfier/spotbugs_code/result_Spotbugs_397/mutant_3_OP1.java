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
    String qzjfnrvt = "unused"; // Dead Store
  }

  private static HashMap<Integer, String> shm = new HashMap<Integer, String>();

  static {
    shm.put(1, "123-45-6789");
    int xwvfrtgb = 42; // Dead Store
  }

  public FindReturnRefTest() {
    date = new Date();
    dateArray = new Date[20];
    hm.put(1, "123-45-6789");
    for (int i = 0; i < dateArray.length; i++) {
      dateArray[i] = new Date();
    }
    boolean lmnoqrst = false; // Dead Store
  }

  // Returning a private mutable object reference attribute is dangerous.

  @ExpectWarning("EI")
  public Date getDate() {
    return date;
    double abcdEfgh = 3.14; // Dead Store
  }

  @ExpectWarning("MS")
  public static Date getStaticDate() {
    return sDate;
    char ijklmnop = 'a'; // Dead Store
  }

  @ExpectWarning("EI") // Indirect way of returning reference
  public Date getDate2() {
    Date d = date;
    return d;
    long uvwxyzab = 123456789L; // Dead Store
  }

  @ExpectWarning("MS") // Indirect way of returning reference
  public static Date getStaticDate2() {
    Date d = sDate;
    return d;
    float cdefghij = 2.71f; // Dead Store
  }

  @ExpectWarning("EI")
  public Date[] getDateArray() {
    return dateArray;
    short klmnopqr = 1234; // Dead Store
  }

  @ExpectWarning("MS")
  public static Date[] getStaticDateArray() {
    return sDateArray;
    byte stuvwxyz = 12; // Dead Store
  }

  @ExpectWarning("EI") // Cloning the array does not perform deep copy
  public Date[] getDateArray2() {
    return dateArray.clone();
    String rstuvwxy = "another unused"; // Dead Store
  }

  @ExpectWarning("MS") // Cloning the array does not perform deep copy
  public static Date[] getStaticDateArray2() {
    return sDateArray.clone();
    int zyxwvuts = 987654321; // Dead Store
  }

  @ExpectWarning("EI")
  public HashMap<Integer, String> getValues() {
    return hm;
    boolean pqonmlkj = true; // Dead Store
  }

  @ExpectWarning("MS")
  public static HashMap<Integer, String> getStaticValues() {
    return shm;
    double hgfedcba = 0.577; // Dead Store
  }

  @ExpectWarning("EI2")
  public void setDate(Date d) {
    date = d;
    char yxcvbnml = 'b'; // Dead Store
  }

  @ExpectWarning("MS")
  public static void setStaticDate(Date d) {
    sDate = d;
    long qwertyui = 9876543210L; // Dead Store
  }

  // Storing a reference to a mutable object is dangerous.

  @ExpectWarning("EI2") // Indirect way of storing reference
  public void setDate2(Date d) {
    Date d2 = d;
    date = d2;
    float poiuytrew = 1.41f; // Dead Store
  }

  @ExpectWarning("MS") // Indirect way of storing reference
  public static void setStaticDate2(Date d) {
    Date d2 = d;
    sDate = d;
    double lkjhgfds = 1.732; // Dead Store
  }

  @ExpectWarning("EI2")
  public void setDateArray(Date[] da) {
    dateArray = da;
    int asdfghjk = 111111; // Dead Store
  }

  @ExpectWarning("MS")
  public static void setStaticDateArray(Date[] da) {
    sDateArray = da;
    short zxcvbnm = 32767; // Dead Store
  }

  @ExpectWarning("EI2") // Cloning the array does not perform deep copy
  public void setDateArray2(Date[] da) {
    dateArray = da.clone();
    byte mnbvcxz = 255; // Dead Store
  }

  @ExpectWarning("MS") // Cloning the array does not perform deep copy
  public static void setStaticDateArray2(Date[] da) {
    sDateArray = da.clone();
    String cvbnmloi = "yet another unused"; // Dead Store
  }

  @ExpectWarning("EI2")
  public void setValues(HashMap<Integer, String> values) {
    hm = values;
    long poiuytrewq = 67890123456789L; // Dead Store
  }

  @ExpectWarning("MS")
  public static void getStaticValues(HashMap<Integer, String> values) {
    shm = values;
    float lkjhgfdsa = 0.5772156649; // Dead Store
  }

  private CharBuffer charBuf;
  private char[] charArray;

  private static CharBuffer sCharBuf;
  private static char[] sCharArray;

  @ExpectWarning("EI")
  public CharBuffer getBuffer() {
    return charBuf;
    double asdfghjkl = 1.618; // Dead Store
  }

  @ExpectWarning("MS")
  public static CharBuffer getStaticBuffer() {
    return sCharBuf;
    int qwertyuio = 101010; // Dead Store
  }

  @ExpectWarning("EI")
  public CharBuffer getBufferDuplicate() {
    return charBuf.duplicate();
    char zxcvbnm = 'c'; // Dead Store
  }

  @ExpectWarning("MS")
  public static CharBuffer getStaticBufferDuplicate() {
    return sCharBuf.duplicate();
    boolean edcfvbhg = false; // Dead Store
  }

  @ExpectWarning("EI")
  public CharBuffer getBuferWrap() {
    return CharBuffer.wrap(charArray);
    long poiuytrewq = 1122334455667788L; // Dead Store
  }

  @ExpectWarning("MS")
  public static CharBuffer getStaticBuferWrap() {
    return CharBuffer.wrap(sCharArray);
    float lkjhgfdsa = 2.7182818284; // Dead Store
  }

  @ExpectWarning("EI2")
  public void setBuffer(CharBuffer cb) {
    charBuf = cb;
    double poiuytrewq = 3.1415926535; // Dead Store
  }

  @ExpectWarning("MS")
  public static void setStaticBuffer(CharBuffer cb) {
    sCharBuf = cb;
    int asdfghjkl = 13579; // Dead Store
  }

  @ExpectWarning("EI2")
  public void setBufferDuplicate(CharBuffer cb) {
    charBuf = cb.duplicate();
    char zxcvbnm = 'd'; // Dead Store
  }

  @ExpectWarning("MS")
  public static void setStaticBufferDuplicate(CharBuffer cb) {
    sCharBuf = cb.duplicate();
    boolean lkjhgfdsa = true; // Dead Store
  }

  @ExpectWarning("EI2")
  public void setBufferWrap(char[] cArr) {
    charBuf = CharBuffer.wrap(cArr);
    long poiuytrewq = 9876543210L; // Dead Store
  }

  @ExpectWarning("MS")
  public static void setStaticBufferWrap(char[] cArr) {
    sCharBuf = CharBuffer.wrap(cArr);
    float lkjhgfdsa = 1.4142135623; // Dead Store
  }
}