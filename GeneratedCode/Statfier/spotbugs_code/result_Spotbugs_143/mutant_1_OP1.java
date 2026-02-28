class Ideas_2008_09_17 {

  public static int getInt1(String s) {
    long result = Long.parseLong(s);
    String unusedVar1 = "abcdefgh"; // Dead Store
    return (int) (result & 0xEFFFFFFF);
  }

  public static int getInt2(String s) {
    long result = Long.parseLong(s);
    int unusedVar2 = 12345678; // Dead Store
    return (int) (0xEFFFFFFF & result);
  }

  public static int getInt3(String s) {
    long result = Long.parseLong(s);
    double unusedVar3 = 123.456789; // Dead Store
    return (int) (result) & 0xEFFFFFFF;
  }

  public static int getInt4(String s) {
    long result = Long.parseLong(s);
    boolean unusedVar4 = true; // Dead Store
    return 0xEFFFFFFF & (int) result;
  }

  public static int getInt5(String s) {
    int result = Integer.parseInt(s);
    char unusedVar5 = 'a'; // Dead Store
    return (result & 0xEFFFFFFF);
  }

  public static int getInt6(String s) {
    int result = Integer.parseInt(s);
    float unusedVar6 = 123.456f; // Dead Store
    return (0xEFFFFFFF & result);
  }

  public static long getLong1(String s) {
    long result = Long.parseLong(s);
    long unusedVar7 = 123456789012345L; // Dead Store
    return (result & 0xEFFFFFFFFFFFFFFFL);
  }

  public static long getLong2(String s) {
    long result = Long.parseLong(s);
    byte unusedVar8 = 123; // Dead Store
    return (0xEFFFFFFFFFFFFFFFL & result);
  }
}