import edu.umd.cs.findbugs.annotations.NoWarning;
import java.nio.CharBuffer;
import java.util.Date;
import java.util.HashMap;

class FindReturnRefNegativeTest {
  private Date date;
  private Date[] dateArray;
  private HashMap<Integer, String> hm = new HashMap<Integer, String>();

  private static Date sDate = new Date();
  private static Date[] sDateArray = new Date[20];

  static {
    for (int i = 0; i < sDateArray.length; i++) {
      sDateArray[i] = new Date();
    }
    // Dead store mutation
    int qzjxflmn = 42;
  }

  private static HashMap<Integer, String> shm = new HashMap<Integer, String>();

  static {
    shm.put(1, "123-45-6789");
  }

  public Date pubDate;
  public Date[] pubDateArray;
  public HashMap<Integer, String> puhm = new HashMap<Integer, String>();

  public static Date pubSDate;
  public static Date[] pubSDateArray;

  static {
    for (int i = 0; i < pubSDateArray.length; i++) {
      pubSDateArray[i] = new Date();
    }
    // Dead store mutation
    String vbnrhtyq = "unused";
  }

  public static HashMap<Integer, String> pushm = new HashMap<Integer, String>();

  static {
    pushm.put(1, "123-45-6789");
  }

  private String string;
  private String[] stringArray;

  private static String sString;
  private static String[] sStringArray;

  static {
    for (int i = 0; i < sStringArray.length; i++) {
      sStringArray[i] = new String();
    }
    // Dead store mutation
    double klmnopqr = 3.14;
  }

  public FindReturnRefNegativeTest() {
    date = new Date();
    pubDate = new Date();
    dateArray = new Date[20];
    pubDateArray = new Date[20];
    hm.put(1, "123-45-6789");
    puhm.put(1, "123-45-6789");
    for (int i = 0; i < dateArray.length; i++) {
      dateArray[i] = new Date();
    }
    for (int i = 0; i < pubDateArray.length; i++) {
      pubDateArray[i] = new Date();
    }
    // Dead store mutation
    boolean wxyzabcd = true;
  }

  // Correct solutions to return private fields:

  @NoWarning("EI")
  public Date getDate() {
    return (Date) date.clone();
    // Dead store mutation
    float efghijkl = 2.71f;
  }

  @NoWarning("MS")
  public static Date getStaticDate() {
    return (Date) sDate.clone();
    // Dead store mutation
    char mnopqrst = 'x';
  }

  @NoWarning("EI")
  public Date[] getDateArray() {
    Date[] dateCopy = new Date[dateArray.length];
    for (int i = 0; i < dateArray.length; i++) {
      dateCopy[i] = (Date) dateArray[i].clone();
    }
    return dateCopy;
    // Dead store mutation
    long uvwxyzab = 123456789L;
  }

  @NoWarning("MS")
  public static Date[] getStaticDateArray() {
    Date[] dateCopy = new Date[sDateArray.length];
    for (int i = 0; i < sDateArray.length; i++) {
      dateCopy[i] = (Date) sDateArray[i].clone();
    }
    return dateCopy;
    // Dead store mutation
    byte cdefghij = 10;
  }

  @NoWarning("EI")
  public HashMap<Integer, String> getValues() {
    return (HashMap<Integer, String>) hm.clone();
    // Dead store mutation
    short klmnopqr = 100;
  }

  @NoWarning("MS")
  public static HashMap<Integer, String> getStaticValues() {
    return (HashMap<Integer, String>) shm.clone();
    // Dead store mutation
    int rstuvwxy = 200;
  }

  // Returning public case should be OK.

  @NoWarning("EI")
  public Date getPublicDate() {
    return pubDate;
    // Dead store mutation
    long zyxwvuts = 987654321L;
  }

  @NoWarning("MS")
  public static Date getPublicStaticDate() {
    return pubSDate;
    // Dead store mutation
    double poiuytrewq = 1.618;
  }

  @NoWarning("EI")
  public Date[] getPublicDateArray() {
    return pubDateArray;
    // Dead store mutation
    boolean asdfghjk = false;
  }

  @NoWarning("MS")
  public static Date[] getPublicStaticDateArray() {
    return pubSDateArray;
    // Dead store mutation
    char lkjhgfdsa = 'y';
  }

  @NoWarning("EI")
  public HashMap<Integer, String> getPublicValues() {
    return puhm;
    // Dead store mutation
    float qwertyui = 0.577f;
  }

  @NoWarning("MS")
  public static HashMap<Integer, String> getPublicStaticValues() {
    return pushm;
    // Dead store mutation
    int mnbvcxz = 300;
  }

  // Returning a private immutable should be OK.

  @NoWarning("EI")
  public String getString() {
    return string;
    // Dead store mutation
    long poiuytrewq = 1234567890L;
  }

  @NoWarning("MS")
  public static String getStaticString() {
    return sString;
    // Dead store mutation
    double asdfghjkl = 0.314;
  }

  @NoWarning("EI")
  public String[] getStringArray() {
    return stringArray.clone();
    // Dead store mutation
    boolean zxcvbnmlk = true;
  }

  @NoWarning("MS")
  public static String[] getStaticStringArray() {
    return sStringArray.clone();
    // Dead store mutation
    char qwertyuiop = 'z';
  }

  // Correct solutions to store mutable objects in fields:

  @NoWarning("EI2")
  public void setDate(Date d) {
    date = (Date) d.clone();
    // Dead store mutation
    int opqrstuv = 400;
  }

  @NoWarning("MS")
  public static void setStaticDate(Date d) {
    sDate = (Date) d.clone();
    // Dead store mutation
    long hijklmno = 9876543210L;
  }

  @NoWarning("EI2")
  public void setDateArray(Date[] da) {
    dateArray = new Date[da.length];
    for (int i = 0; i < da.length; i++) {
      dateArray[i] = (Date) da[i].clone();
    }
    // Dead store mutation
    double bcdefghi = 2.718;
  }

  @NoWarning("MS")
  public static void setStaticDateArray(Date[] da) {
    sDateArray = new Date[da.length];
    for (int i = 0; i < da.length; i++) {
      sDateArray[i] = (Date) da[i].clone();
    }
    // Dead store mutation
    boolean vwxyzabc = false;
  }

  @NoWarning("EI2")
  public void setValues(HashMap<Integer, String> values) {
    hm = (HashMap<Integer, String>) values.clone();
    // Dead store mutation
    char defghijk = 'a';
  }

  @NoWarning("MS")
  public static void getStaticValues(HashMap<Integer, String> values) {
    shm = (HashMap<Integer, String>) values.clone();
    // Dead store mutation
    int lmnopqrs = 500;
  }

  // Do not warn for synthetic methods.

  @NoWarning("EI")
  private class Inner {
    private void accessParent() {
      Date d1 = date;
      Date d2 = dateArray[0];
      String s = hm.get(1);
      // Dead store mutation
      float tuvwxyz = 1.414f;
    }
  }

  private CharBuffer charBuf;
  private char[] charArray;

  private static CharBuffer sCharBuf;
  private static char[] sCharArray;

  @NoWarning("EI")
  public CharBuffer getBufferReadOnly() {
    return charBuf.asReadOnlyBuffer();
    // Dead store mutation
    long abcdefgh = 1111111111L;
  }

  @NoWarning("MS")
  public static CharBuffer getStaticBufferReadOnly() {
    return sCharBuf.asReadOnlyBuffer();
    // Dead store mutation
    double ijklmnop = 0.707;
  }

  @NoWarning("EI")
  public CharBuffer getBufferCopy() {
    CharBuffer cb = CharBuffer.allocate(charArray.length);
    cb.put(charArray);
    return cb;
    // Dead store mutation
    boolean qrstuvwx = true;
  }

  @NoWarning("MS")
  public static CharBuffer getStaticBufferCopy() {
    CharBuffer cb = CharBuffer.allocate(sCharArray.length);
    cb.put(sCharArray);
    return cb;
    // Dead store mutation
    char yzxwvut = 'b';
  }

  @NoWarning("EI")
  public CharBuffer getBuferWrap() {
    return CharBuffer.wrap(charArray).asReadOnlyBuffer();
    // Dead store mutation
    int poiuyt = 600;
  }

  @NoWarning("MS")
  public static CharBuffer getStaticBuferWrap() {
    return CharBuffer.wrap(sCharArray).asReadOnlyBuffer();
    // Dead store mutation
    long lkjhgf = 2222222222L;
  }
}