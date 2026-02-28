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
  }

  private static HashMap<Integer, String> shm = new HashMap<Integer, String>();

  static {
    shm.put(1, "123-45-6789");
  }

  public FindReturnRefTest() {
    date = new Date();
    date = new Date(); // Mutation: Duplicate assignment
    dateArray = new Date[20];
    dateArray = new Date[20]; // Mutation: Duplicate assignment
    hm.put(1, "123-45-6789");
    hm.put(1, "123-45-6789"); // Mutation: Duplicate assignment
    for (int i = 0; i < dateArray.length; i++) {
      dateArray[i] = new Date();
      dateArray[i] = new Date(); // Mutation: Duplicate assignment
    }
  }

  // Returning a private mutable object reference attribute is dangerous.

  @ExpectWarning("EI")
  public Date getDate() {
    return date;
  }

  @ExpectWarning("MS")
  public static Date getStaticDate() {
    return sDate;
  }

  @ExpectWarning("EI") // Indirect way of returning reference
  public Date getDate2() {
    Date d = date;
    return d;
  }

  @ExpectWarning("MS") // Indirect way of returning reference
  public static Date getStaticDate2() {
    Date d = sDate;
    return d;
  }

  @ExpectWarning("EI")
  public Date[] getDateArray() {
    return dateArray;
  }

  @ExpectWarning("MS")
  public static Date[] getStaticDateArray() {
    return sDateArray;
  }

  @ExpectWarning("EI") // Cloning the array does not perform deep copy
  public Date[] getDateArray2() {
    return dateArray.clone();
  }

  @ExpectWarning("MS") // Cloning the array does not perform deep copy
  public static Date[] getStaticDateArray2() {
    return sDateArray.clone();
  }

  @ExpectWarning("EI")
  public HashMap<Integer, String> getValues() {
    return hm;
  }

  @ExpectWarning("MS")
  public static HashMap<Integer, String> getStaticValues() {
    return shm;
  }

  @ExpectWarning("EI2")
  public void setDate(Date d) {
    date = d;
    date = d; // Mutation: Duplicate assignment
  }

  @ExpectWarning("MS")
  public static void setStaticDate(Date d) {
    sDate = d;
    sDate = d; // Mutation: Duplicate assignment
  }

  // Storing a reference to a mutable object is dangerous.

  @ExpectWarning("EI2") // Indirect way of storing reference
  public void setDate2(Date d) {
    Date d2 = d;
    date = d2;
    date = d2; // Mutation: Duplicate assignment
  }

  @ExpectWarning("MS") // Indirect way of storing reference
  public static void setStaticDate2(Date d) {
    Date d2 = d;
    sDate = d;
    sDate = d; // Mutation: Duplicate assignment
  }

  @ExpectWarning("EI2")
  public void setDateArray(Date[] da) {
    dateArray = da;
    dateArray = da; // Mutation: Duplicate assignment
  }

  @ExpectWarning("MS")
  public static void setStaticDateArray(Date[] da) {
    sDateArray = da;
    sDateArray = da; // Mutation: Duplicate assignment
  }

  @ExpectWarning("EI2") // Cloning the array does not perform deep copy
  public void setDateArray2(Date[] da) {
    dateArray = da.clone();
    dateArray = da.clone(); // Mutation: Duplicate assignment
  }

  @ExpectWarning("MS") // Cloning the array does not perform deep copy
  public static void setStaticDateArray2(Date[] da) {
    sDateArray = da.clone();
    sDateArray = da.clone(); // Mutation: Duplicate assignment
  }

  @ExpectWarning("EI2")
  public void setValues(HashMap<Integer, String> values) {
    hm = values;
    hm = values; // Mutation: Duplicate assignment
  }

  @ExpectWarning("MS")
  public static void getStaticValues(HashMap<Integer, String> values) {
    shm = values;
    shm = values; // Mutation: Duplicate assignment
  }

  private CharBuffer charBuf;
  private char[] charArray;

  private static CharBuffer sCharBuf;
  private static char[] sCharArray;

  @ExpectWarning("EI")
  public CharBuffer getBuffer() {
    return charBuf;
  }

  @ExpectWarning("MS")
  public static CharBuffer getStaticBuffer() {
    return sCharBuf;
  }

  @ExpectWarning("EI")
  public CharBuffer getBufferDuplicate() {
    return charBuf.duplicate();
  }

  @ExpectWarning("MS")
  public static CharBuffer getStaticBufferDuplicate() {
    return sCharBuf.duplicate();
  }

  @ExpectWarning("EI")
  public CharBuffer getBuferWrap() {
    return CharBuffer.wrap(charArray);
  }

  @ExpectWarning("MS")
  public static CharBuffer getStaticBuferWrap() {
    return CharBuffer.wrap(sCharArray);
  }

  @ExpectWarning("EI2")
  public void setBuffer(CharBuffer cb) {
    charBuf = cb;
    charBuf = cb; // Mutation: Duplicate assignment
  }

  @ExpectWarning("MS")
  public static void setStaticBuffer(CharBuffer cb) {
    sCharBuf = cb;
    sCharBuf = cb; // Mutation: Duplicate assignment
  }

  @ExpectWarning("EI2")
  public void setBufferDuplicate(CharBuffer cb) {
    charBuf = cb.duplicate();
    charBuf = cb.duplicate(); // Mutation: Duplicate assignment
  }

  @ExpectWarning("MS")
  public static void setStaticBufferDuplicate(CharBuffer cb) {
    sCharBuf = cb.duplicate();
    sCharBuf = cb.duplicate(); // Mutation: Duplicate assignment
  }

  @ExpectWarning("EI2")
  public void setBufferWrap(char[] cArr) {
    charBuf = CharBuffer.wrap(cArr);
    charBuf = CharBuffer.wrap(cArr); // Mutation: Duplicate assignment
  }

  @ExpectWarning("MS")
  public static void setStaticBufferWrap(char[] cArr) {
    sCharBuf = CharBuffer.wrap(cArr);
    sCharBuf = CharBuffer.wrap(cArr); // Mutation: Duplicate assignment
  }
}