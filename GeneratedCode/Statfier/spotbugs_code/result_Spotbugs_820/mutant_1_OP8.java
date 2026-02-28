import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class SillyBoxedUsage {
  @ExpectWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testBad1(int value) {
    return new Integer(value).toString();
  }

  @NoWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testGood1(int value) {
    return Integer.toString(value);
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testBad2(float value) {
    return new Float(value).toString();
  }

  @NoWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testGood2(float value) {
    return Float.toString(value);
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testBad3(double value) {
    return new Double(value).toString();
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
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public int testParsingBad1a(String value) {
    return Integer.valueOf(value).intValue();
  }

  @NoWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public int testParsingGood1(String value) {
    return Integer.parseInt(value);
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public long testParsingBad2(String value) {
    return new Long(value).longValue();
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public long testParsingBad2a(String value) {
    return Long.valueOf(value).longValue();
  }

  @NoWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public long testParsingGood2(String value) {
    return Long.parseLong(value);
  }

  // Mutated code
  @ExpectWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testBad1a(int x) {
    return new Integer(x).toString();
  }

  @NoWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testGood1a(int y) {
    return Integer.toString(y);
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testBad2a(float f) {
    return new Float(f).toString();
  }

  @NoWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testGood2a(float g) {
    return Float.toString(g);
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testBad3a(double d) {
    return new Double(d).toString();
  }

  @NoWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testGood3a(double e) {
    return Double.toString(e);
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testBada(byte q, char r, short t, long u, boolean v) {
    return new Byte(q).toString()
        + new Character(r).toString()
        + new Short(t).toString()
        + new Long(u).toString()
        + new Boolean(v).toString();
  }

  @NoWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testGooda(byte w, char p, short o, long n, boolean m) {
    return Byte.toString(w)
        + Character.toString(p)
        + Short.toString(o)
        + Long.toString(n)
        + Boolean.toString(m);
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public int testParsingBad1b(String h) {
    return new Integer(h).intValue();
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public int testParsingBad1ab(String i) {
    return Integer.valueOf(i).intValue();
  }

  @NoWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public int testParsingGood1b(String j) {
    return Integer.parseInt(j);
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public long testParsingBad2b(String k) {
    return new Long(k).longValue();
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public long testParsingBad2ab(String l) {
    return Long.valueOf(l).longValue();
  }

  @NoWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public long testParsingGood2b(String m) {
    return Long.parseLong(m);
  }
}