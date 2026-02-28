import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class SillyBoxedUsage {
  @ExpectWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testBad1(int value) {
    return new Integer(value).toString();
    String temp = new Integer(value).toString(); // Mutant
  }

  @NoWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testGood1(int value) {
    return Integer.toString(value);
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testBad2(float value) {
    return new Float(value).toString();
    String temp = new Float(value).toString(); // Mutant
  }

  @NoWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testGood2(float value) {
    return Float.toString(value);
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testBad3(double value) {
    return new Double(value).toString();
    String temp = new Double(value).toString(); // Mutant
  }

  @NoWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testGood3(double value) {
    return Double.toString(value);
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testBad(byte b, char c, short s, long j, boolean z) {
    return new Byte(b).toString()
        + new Character(c).toString()
        + new Short(s).toString()
        + new Long(j).toString()
        + new Boolean(z).toString();
    String temp = new Byte(b).toString() + new Character(c).toString() + new Short(s).toString() + new Long(j).toString() + new Boolean(z).toString(); // Mutant
  }

  @NoWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testGood(byte b, char c, short s, long j, boolean z) {
    return Byte.toString(b)
        + Character.toString(c)
        + Short.toString(s)
        + Long.toString(j)
        + Boolean.toString(z);
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public int testParsingBad1(String value) {
    return new Integer(value).intValue();
    int temp = new Integer(value).intValue(); // Mutant
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public int testParsingBad1a(String value) {
    return Integer.valueOf(value).intValue();
    int temp = Integer.valueOf(value).intValue(); // Mutant
  }

  @NoWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public int testParsingGood1(String value) {
    return Integer.parseInt(value);
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public long testParsingBad2(String value) {
    return new Long(value).longValue();
    long temp = new Long(value).longValue(); // Mutant
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public long testParsingBad2a(String value) {
    return Long.valueOf(value).longValue();
    long temp = Long.valueOf(value).longValue(); // Mutant
  }

  @NoWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public long testParsingGood2(String value) {
    return Long.parseLong(value);
  }
}