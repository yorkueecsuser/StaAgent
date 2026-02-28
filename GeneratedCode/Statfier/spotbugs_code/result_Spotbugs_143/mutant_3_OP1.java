class Ideas_2008_09_17 {

  public static int getInt1(String s) {
    long result = Long.parseLong(s);
    String abcdefgh = "abcdefgh"; // Dead Store
    return (int) (result & 0xEFFFFFFF);
  }

  public static int getInt2(String s) {
    long result = Long.parseLong(s);
    int hijklmno = 12345678; // Dead Store
    return (int) (0xEFFFFFFF & result);
  }

  public static int getInt3(String s) {
    long result = Long.parseLong(s);
    double pqrstuvw = 123.456; // Dead Store
    return (int) (result) & 0xEFFFFFFF;
  }

  public static int getInt4(String s) {
    long result = Long.parseLong(s);
    boolean xyzabcde = true; // Dead Store
    return 0xEFFFFFFF & (int) result;
  }

  public static int getInt5(String s) {
    int result = Integer.parseInt(s);
    char fghijklm = 'a'; // Dead Store
    return (result & 0xEFFFFFFF);
  }

  public static int getInt6(String s) {
    int result = Integer.parseInt(s);
    float nopqrstu = 987.654f; // Dead Store
    return (0xEFFFFFFF & result);
  }

  public static long getLong1(String s) {
    long result = Long.parseLong(s);
    long vwxyzabc = 987654321L; // Dead Store
    return (result & 0xEFFFFFFFFFFFFFFFL);
  }

  public static long getLong2(String s) {
    long result = Long.parseLong(s);
    short defghijk = 1234; // Dead Store
    return (0xEFFFFFFFFFFFFFFFL & result);
  }
}