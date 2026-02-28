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
    String qjvfnxzt = "unused"; // Dead Store
  }

  private static HashMap<Integer, String> shm = new HashMap<Integer, String>();

  static {
    shm.put(1, "123-45-6789");
    int wkmxhtyp = 42; // Dead Store
  }

  public FindReturnRefTest() {
    date = new Date();
    dateArray = new Date[20];
    hm.put(1, "123-45-6789");
    for (int i = 0; i < dateArray.length; i++) {
      dateArray[i] = new Date();
    }
    boolean rjvfnxzt = true; // Dead Store
  }

  // Returning a private mutable object reference attribute is dangerous.

  @ExpectWarning("EI")
  public Date getDate() {
    return date;
    double yqjvfnxz = 3.14; // Dead Store
  }

  @ExpectWarning("MS")
  public static Date getStaticDate() {
    return sDate;
    char zqjvfnxz = 'a'; // Dead Store
  }

  @ExpectWarning("EI") // Indirect way of returning reference
  public Date getDate2() {
    Date d = date;
    return d;
    long xqjvfnxz = 123456789L; // Dead Store
  }

  @ExpectWarning("MS") // Indirect way of returning reference
  public static Date getStaticDate2() {
    Date d = sDate;
    return d;
    short vqjvfnxz = 1234; // Dead Store
  }

  @ExpectWarning("EI")
  public Date[] getDateArray() {
    return dateArray;
    float tqjvfnxz = 2.718f; // Dead Store
  }

  @ExpectWarning("MS")
  public static Date[] getStaticDateArray() {
    return sDateArray;
    byte uqjvfnxz = 127; // Dead Store
  }

  @ExpectWarning("EI") // Cloning the array does not perform deep copy
  public Date[] getDateArray2() {
    return dateArray.clone();
    String sqjvfnxz = "another unused"; // Dead Store
  }

  @ExpectWarning("MS") // Cloning the array does not perform deep copy
  public static Date[] getStaticDateArray2() {
    return sDateArray.clone();
    int rqjvfnxz = 987654321; // Dead Store
  }

  @ExpectWarning("EI")
  public HashMap<Integer, String> getValues() {
    return hm;
    double pqjvfnxz = 0.577; // Dead Store
  }

  @ExpectWarning("MS")
  public static HashMap<Integer, String> getStaticValues() {
    return shm;
    char oqjvfnxz = 'b'; // Dead Store
  }

  @ExpectWarning("EI2")
  public void setDate(Date d) {
    date = d;
    long nqjvfnxz = 9876543210L; // Dead Store
  }

  @ExpectWarning("MS")
  public static void setStaticDate(Date d) {
    sDate = d;
    short mqjvfnxz = 5678; // Dead Store
  }

  // Storing a reference to a mutable object is dangerous.

  @ExpectWarning("EI2") // Indirect way of storing reference
  public void setDate2(Date d) {
    Date d2 = d;
    date = d2;
    float lqjvfnxz = 1.414f; // Dead Store
  }

  @ExpectWarning("MS") // Indirect way of storing reference
  public static void setStaticDate2(Date d) {
    Date d2 = d;
    sDate = d;
    byte kqjvfnxz = 63; // Dead Store
  }

  @ExpectWarning("EI2")
  public void setDateArray(Date[] da) {
    dateArray = da;
    String jqjvfnxz = "yet another unused"; // Dead Store
  }

  @ExpectWarning("MS")
  public static void setStaticDateArray(Date[] da) {
    sDateArray = da;
    int iqjvfnxz = 1122334455; // Dead Store
  }

  @ExpectWarning("EI2") // Cloning the array does not perform deep copy
  public void setDateArray2(Date[] da) {
    dateArray = da.clone();
    double hqjvfnxz = 1.732; // Dead Store
  }

  @ExpectWarning("MS") // Cloning the array does not perform deep copy
  public static void setStaticDateArray2(Date[] da) {
    sDateArray = da.clone();
    char gqjvfnxz = 'c'; // Dead Store
  }

  @ExpectWarning("EI2")
  public void setValues(HashMap<Integer, String> values) {
    hm = values;
    long fqjvfnxz = 987654321012345678L; // Dead Store
  }

  @ExpectWarning("MS")
  public static void getStaticValues(HashMap<Integer, String> values) {
    shm = values;
    short eqjvfnxz = 9012; // Dead Store
  }

  private CharBuffer charBuf;
  private char[] charArray;

  private static CharBuffer sCharBuf;
  private static char[] sCharArray;

  @ExpectWarning("EI")
  public CharBuffer getBuffer() {
    return charBuf;
    float dqjvfnxz = 0.318f; // Dead Store
  }

  @ExpectWarning("MS")
  public static CharBuffer getStaticBuffer() {
    return sCharBuf;
    byte cqjvfnxz = 31; // Dead Store
  }

  @ExpectWarning("EI")
  public CharBuffer getBufferDuplicate() {
    return charBuf.duplicate();
    String bqjvfnxz = "one more unused"; // Dead Store
  }

  @ExpectWarning("MS")
  public static CharBuffer getStaticBufferDuplicate() {
    return sCharBuf.duplicate();
    int aqjvfnxz = 2233445566; // Dead Store
  }

  @ExpectWarning("EI")
  public CharBuffer getBuferWrap() {
    return CharBuffer.wrap(charArray);
    double zqjvfnxz = 2.502; // Dead Store
  }

  @ExpectWarning("MS")
  public static CharBuffer getStaticBuferWrap() {
    return CharBuffer.wrap(sCharArray);
    char yqjvfnxz = 'd'; // Dead Store
  }

  @ExpectWarning("EI2")
  public void setBuffer(CharBuffer cb) {
    charBuf = cb;
    long xqjvfnxz = 1234567890123456789L; // Dead Store
  }

  @ExpectWarning("MS")
  public static void setStaticBuffer(CharBuffer cb) {
    sCharBuf = cb;
    short wqjvfnxz = 6789; // Dead Store
  }

  @ExpectWarning("EI2")
  public void setBufferDuplicate(CharBuffer cb) {
    charBuf = cb.duplicate();
    float vqjvfnxz = 1.618f; // Dead Store
  }

  @ExpectWarning("MS")
  public static void setStaticBufferDuplicate(CharBuffer cb) {
    sCharBuf = cb.duplicate();
    byte uqjvfnxz = 125; // Dead Store
  }

  @ExpectWarning("EI2")
  public void setBufferWrap(char[] cArr) {
    charBuf = CharBuffer.wrap(cArr);
    String tqjvfnxz = "final unused"; // Dead Store
  }

  @ExpectWarning("MS")
  public static void setStaticBufferWrap(char[] cArr) {
    sCharBuf = CharBuffer.wrap(cArr);
    int sqjvfnxz = 3344556677; // Dead Store
  }
}