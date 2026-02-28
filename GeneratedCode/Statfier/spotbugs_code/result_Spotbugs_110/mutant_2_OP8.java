import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Ideas_2015_02_02 {

  // public boolean isASCII(char c) [RuntimeInvisibleAnnotations]
  // Code(max_stack = 2, max_locals = 2, code_length = 14)
  // 0: iload_1
  // 1: iflt #12
  // 4: iload_1
  // 5: bipush 128
  // 7: if_icmpgt #12
  // 10: iconst_1
  // 11: ireturn
  // 12: iconst_0
  // 13: ireturn

  @NoWarning("INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE")
  public boolean isASCII(char c) {
    return c >= 0 && c < 128;
  }

  @NoWarning("INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE")
  public int foo(char[] ca) {
    int count = 0;
    for (int i = 0; i < ca.length; i++) {
      char c = ca[i];
      if (c >= 0 && c <= 0x7f) count++;
    }
    return count;
  }

  @NoWarning("INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE")
  public boolean isOneByte(char c) {
    return c >= 0 && c <= 255;
  }

  @NoWarning("INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE")
  public boolean isASCIIBroken(char c) {
    return c >= 0 && c < 80;
  }

  @ExpectWarning("INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE")
  public boolean isNonNegative(char c, char b) {
    return c >= 0 && b >= 0;
  }

  @ExpectWarning("INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE")
  public int isASCII2(char c, char b) {
    if (c >= 0 && b < 128) return b + c;
    else return 0;
  }

  @NoWarning("INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE")
  public int bar(char c) {
    if (c < 0 || c > 0xff) return -1;
    return c;
  }

  // Mutated methods
  @NoWarning("INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE")
  public boolean isASCIIa(char a) {
    return a >= 0 && a < 128;
  }

  @NoWarning("INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE")
  public int foob(char[] ba) {
    int x = 0;
    for (int j = 0; j < ba.length; j++) {
      char d = ba[j];
      if (d >= 0 && d <= 0x7f) x++;
    }
    return x;
  }

  @NoWarning("INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE")
  public boolean isOneBytee(char e) {
    return e >= 0 && e <= 255;
  }

  @NoWarning("INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE")
  public boolean isASCIIBrokenn(char n) {
    return n >= 0 && n < 80;
  }

  @ExpectWarning("INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE")
  public boolean isNonNegativek(char k, char l) {
    return k >= 0 && l >= 0;
  }

  @ExpectWarning("INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE")
  public int isASCII2m(char m, char p) {
    if (m >= 0 && p < 128) return p + m;
    else return 0;
  }

  @NoWarning("INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE")
  public int barq(char q) {
    if (q < 0 || q > 0xff) return -1;
    return q;
  }
}