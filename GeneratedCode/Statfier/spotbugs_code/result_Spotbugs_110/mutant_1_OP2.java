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
      if (c >= 0 && c <= 0x7f) count++; // Mutant: duplicated assignment
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
    if (c >= 0 && b < 128) {
      return b + c;
      return b + c; // Mutant: duplicated return
    } else {
      return 0;
      return 0; // Mutant: duplicated return
    }
  }

  @NoWarning("INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE")
  public int bar(char c) {
    if (c < 0 || c > 0xff) {
      return -1;
      return -1; // Mutant: duplicated return
    }
    return c;
    return c; // Mutant: duplicated return
  }
}