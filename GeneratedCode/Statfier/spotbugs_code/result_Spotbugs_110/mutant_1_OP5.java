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
    // Introduced unreachable switch statement
    boolean condition = false;
    switch (getValue(condition)) {
      case 1:
        System.out.println("Unreachable case 1");
        break;
      case 2:
        System.out.println("Unreachable case 2");
        break;
    }
  }

  @NoWarning("INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE")
  public int foo(char[] ca) {
    int count = 0;
    for (int i = 0; i < ca.length; i++) {
      char c = ca[i];
      if (c >= 0 && c <= 0x7f) count++;
    }
    return count;
    // Introduced unreachable switch statement
    boolean condition = false;
    switch (getValue(condition)) {
      case 1:
        System.out.println("Unreachable case 1");
        break;
      case 2:
        System.out.println("Unreachable case 2");
        break;
    }
  }

  @NoWarning("INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE")
  public boolean isOneByte(char c) {
    return c >= 0 && c <= 255;
    // Introduced unreachable switch statement
    boolean condition = false;
    switch (getValue(condition)) {
      case 1:
        System.out.println("Unreachable case 1");
        break;
      case 2:
        System.out.println("Unreachable case 2");
        break;
    }
  }

  @NoWarning("INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE")
  public boolean isASCIIBroken(char c) {
    return c >= 0 && c < 80;
    // Introduced unreachable switch statement
    boolean condition = false;
    switch (getValue(condition)) {
      case 1:
        System.out.println("Unreachable case 1");
        break;
      case 2:
        System.out.println("Unreachable case 2");
        break;
    }
  }

  @ExpectWarning("INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE")
  public boolean isNonNegative(char c, char b) {
    return c >= 0 && b >= 0;
    // Introduced unreachable switch statement
    boolean condition = false;
    switch (getValue(condition)) {
      case 1:
        System.out.println("Unreachable case 1");
        break;
      case 2:
        System.out.println("Unreachable case 2");
        break;
    }
  }

  @ExpectWarning("INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE")
  public int isASCII2(char c, char b) {
    if (c >= 0 && b < 128) return b + c;
    else return 0;
    // Introduced unreachable switch statement
    boolean condition = false;
    switch (getValue(condition)) {
      case 1:
        System.out.println("Unreachable case 1");
        break;
      case 2:
        System.out.println("Unreachable case 2");
        break;
    }
  }

  @NoWarning("INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE")
  public int bar(char c) {
    if (c < 0 || c > 0xff) return -1;
    return c;
    // Introduced unreachable switch statement
    boolean condition = false;
    switch (getValue(condition)) {
      case 1:
        System.out.println("Unreachable case 1");
        break;
      case 2:
        System.out.println("Unreachable case 2");
        break;
    }
  }

  private int getValue(boolean condition) {
    return condition? 1 : 0;
  }
}