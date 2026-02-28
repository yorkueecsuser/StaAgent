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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is an unreachable statement");
    }
  }

  private static HashMap<Integer, String> shm = new HashMap<Integer, String>();

  static {
    shm.put(1, "123-45-6789");
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is another unreachable statement");
    }
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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is yet another unreachable statement");
    }
  }

  public static HashMap<Integer, String> pushm = new HashMap<Integer, String>();

  static {
    pushm.put(1, "123-45-6789");
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is one more unreachable statement");
    }
  }

  private String string;
  private String[] stringArray;

  private static String sString;
  private static String[] sStringArray;

  static {
    for (int i = 0; i < sStringArray.length; i++) {
      sStringArray[i] = new String();
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is an additional unreachable statement");
    }
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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is a constructor unreachable statement");
    }
  }

  // Correct solutions to return private fields:

  @NoWarning("EI")
  public Date getDate() {
    return (Date) date.clone();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is a getDate unreachable statement");
    }
  }

  @NoWarning("MS")
  public static Date getStaticDate() {
    return (Date) sDate.clone();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is a getStaticDate unreachable statement");
    }
  }

  @NoWarning("EI")
  public Date[] getDateArray() {
    Date[] dateCopy = new Date[dateArray.length];
    for (int i = 0; i < dateArray.length; i++) {
      dateCopy[i] = (Date) dateArray[i].clone();
    }
    return dateCopy;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is a getDateArray unreachable statement");
    }
  }

  @NoWarning("MS")
  public static Date[] getStaticDateArray() {
    Date[] dateCopy = new Date[sDateArray.length];
    for (int i = 0; i < sDateArray.length; i++) {
      dateCopy[i] = (Date) sDateArray[i].clone();
    }
    return dateCopy;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is a getStaticDateArray unreachable statement");
    }
  }

  @NoWarning("EI")
  public HashMap<Integer, String> getValues() {
    return (HashMap<Integer, String>) hm.clone();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is a getValues unreachable statement");
    }
  }

  @NoWarning("MS")
  public static HashMap<Integer, String> getStaticValues() {
    return (HashMap<Integer, String>) shm.clone();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is a getStaticValues unreachable statement");
    }
  }

  // Returning public case should be OK.

  @NoWarning("EI")
  public Date getPublicDate() {
    return pubDate;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is a getPublicDate unreachable statement");
    }
  }

  @NoWarning("MS")
  public static Date getPublicStaticDate() {
    return pubSDate;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is a getPublicStaticDate unreachable statement");
    }
  }

  @NoWarning("EI")
  public Date[] getPublicDateArray() {
    return pubDateArray;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is a getPublicDateArray unreachable statement");
    }
  }

  @NoWarning("MS")
  public static Date[] getPublicStaticDateArray() {
    return pubSDateArray;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is a getPublicStaticDateArray unreachable statement");
    }
  }

  @NoWarning("EI")
  public HashMap<Integer, String> getPublicValues() {
    return puhm;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is a getPublicValues unreachable statement");
    }
  }

  @NoWarning("MS")
  public static HashMap<Integer, String> getPublicStaticValues() {
    return pushm;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is a getPublicStaticValues unreachable statement");
    }
  }

  // Returning a private immutable should be OK.

  @NoWarning("EI")
  public String getString() {
    return string;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is a getString unreachable statement");
    }
  }

  @NoWarning("MS")
  public static String getStaticString() {
    return sString;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is a getStaticString unreachable statement");
    }
  }

  @NoWarning("EI")
  public String[] getStringArray() {
    return stringArray.clone();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is a getStringArray unreachable statement");
    }
  }

  @NoWarning("MS")
  public static String[] getStaticStringArray() {
    return sStringArray.clone();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is a getStaticStringArray unreachable statement");
    }
  }

  // Correct solutions to store mutable objects in fields:

  @NoWarning("EI2")
  public void setDate(Date d) {
    date = (Date) d.clone();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is a setDate unreachable statement");
    }
  }

  @NoWarning("MS")
  public static void setStaticDate(Date d) {
    sDate = (Date) d.clone();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is a setStaticDate unreachable statement");
    }
  }

  @NoWarning("EI2")
  public void setDateArray(Date[] da) {
    dateArray = new Date[da.length];
    for (int i = 0; i < da.length; i++) {
      dateArray[i] = (Date) da[i].clone();
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is a setDateArray unreachable statement");
    }
  }

  @NoWarning("MS")
  public static void setStaticDateArray(Date[] da) {
    sDateArray = new Date[da.length];
    for (int i = 0; i < da.length; i++) {
      sDateArray[i] = (Date) da[i].clone();
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is a setStaticDateArray unreachable statement");
    }
  }

  @NoWarning("EI2")
  public void setValues(HashMap<Integer, String> values) {
    hm = (HashMap<Integer, String>) values.clone();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is a setValues unreachable statement");
    }
  }

  @NoWarning("MS")
  public static void getStaticValues(HashMap<Integer, String> values) {
    shm = (HashMap<Integer, String>) values.clone();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is a getStaticValues unreachable statement");
    }
  }

  // Do not warn for synthetic methods.

  @NoWarning("EI")
  private class Inner {
    private void accessParent() {
      Date d1 = date;
      Date d2 = dateArray[0];
      String s = hm.get(1);
      boolean condition = getCondition();
      if (condition) {
        // Unreachable if statement
        System.out.println("This is an inner class unreachable statement");
      }
    }
  }

  private CharBuffer charBuf;
  private char[] charArray;

  private static CharBuffer sCharBuf;
  private static char[] sCharArray;

  @NoWarning("EI")
  public CharBuffer getBufferReadOnly() {
    return charBuf.asReadOnlyBuffer();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is a getBufferReadOnly unreachable statement");
    }
  }

  @NoWarning("MS")
  public static CharBuffer getStaticBufferReadOnly() {
    return sCharBuf.asReadOnlyBuffer();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is a getStaticBufferReadOnly unreachable statement");
    }
  }

  @NoWarning("EI")
  public CharBuffer getBufferCopy() {
    CharBuffer cb = CharBuffer.allocate(charArray.length);
    cb.put(charArray);
    return cb;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is a getBufferCopy unreachable statement");
    }
  }

  @NoWarning("MS")
  public static CharBuffer getStaticBufferCopy() {
    CharBuffer cb = CharBuffer.allocate(sCharArray.length);
    cb.put(sCharArray);
    return cb;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is a getStaticBufferCopy unreachable statement");
    }
  }

  @NoWarning("EI")
  public CharBuffer getBuferWrap() {
    return CharBuffer.wrap(charArray).asReadOnlyBuffer();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is a getBuferWrap unreachable statement");
    }
  }

  @NoWarning("MS")
  public static CharBuffer getStaticBuferWrap() {
    return CharBuffer.wrap(sCharArray).asReadOnlyBuffer();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is a getStaticBuferWrap unreachable statement");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}