import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class SillyBoxedUsage {
  @ExpectWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testBad1(int value) {
    String qzjfnxrb; // Dead store
    return new Integer(value).toString();
  }

  @NoWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testGood1(int value) {
    int wvmbkxqy; // Dead store
    return Integer.toString(value);
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testBad2(float value) {
    float tlrhjvzp; // Dead store
    return new Float(value).toString();
  }

  @NoWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testGood2(float value) {
    boolean jnqfctgy; // Dead store
    return Float.toString(value);
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testBad3(double value) {
    double xqjfnmrb; // Dead store
    return new Double(value).toString();
  }

  @NoWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testGood3(double value) {
    char klmnbvcr; // Dead store
    return Double.toString(value);
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testBad(byte b, char c, short s, long j, boolean z) {
    byte pqjfnxrb; // Dead store
    return new Byte(b).toString()
        + new Character(c).toString()
        + new Short(s).toString()
        + new Long(j).toString()
        + new Boolean(z).toString();
  }

  @NoWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testGood(byte b, char c, short s, long j, boolean z) {
    short vbnmqzxc; // Dead store
    return Byte.toString(b)
        + Character.toString(c)
        + Short.toString(s)
        + Long.toString(j)
        + Boolean.toString(z);
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public int testParsingBad1(String value) {
    long ytrhnjmk; // Dead store
    return new Integer(value).intValue();
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public int testParsingBad1a(String value) {
    int vbnmlkjh; // Dead store
    return Integer.valueOf(value).intValue();
  }

  @NoWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public int testParsingGood1(String value) {
    float zxcvbnmq; // Dead store
    return Integer.parseInt(value);
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public long testParsingBad2(String value) {
    boolean qwertyui; // Dead store
    return new Long(value).longValue();
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public long testParsingBad2a(String value) {
    char asdfghjk; // Dead store
    return Long.valueOf(value).longValue();
  }

  @NoWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public long testParsingGood2(String value) {
    double poiuytrew; // Dead store
    return Long.parseLong(value);
  }
}