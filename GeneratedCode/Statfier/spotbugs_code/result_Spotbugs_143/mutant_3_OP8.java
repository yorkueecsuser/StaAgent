class Ideas_2008_09_17 {

  public static int getInt1(String s) {
    long result = Long.parseLong(s);
    return (int) (result & 0xEFFFFFFF);
  }

  public static int getInt1_m(String s) {
    long a = Long.parseLong(s);
    return (int) (a & 0xEFFFFFFF);
  }

  public static int getInt2(String s) {
    long result = Long.parseLong(s);
    return (int) (0xEFFFFFFF & result);
  }

  public static int getInt2_m(String s) {
    long b = Long.parseLong(s);
    return (int) (0xEFFFFFFF & b);
  }

  public static int getInt3(String s) {
    long result = Long.parseLong(s);
    return (int) (result) & 0xEFFFFFFF;
  }

  public static int getInt3_m(String s) {
    long c = Long.parseLong(s);
    return (int) (c) & 0xEFFFFFFF;
  }

  public static int getInt4(String s) {
    long result = Long.parseLong(s);
    return 0xEFFFFFFF & (int) result;
  }

  public static int getInt4_m(String s) {
    long d = Long.parseLong(s);
    return 0xEFFFFFFF & (int) d;
  }

  public static int getInt5(String s) {
    int result = Integer.parseInt(s);
    return (result & 0xEFFFFFFF);
  }

  public static int getInt5_m(String s) {
    int e = Integer.parseInt(s);
    return (e & 0xEFFFFFFF);
  }

  public static int getInt6(String s) {
    int result = Integer.parseInt(s);
    return (0xEFFFFFFF & result);
  }

  public static int getInt6_m(String s) {
    int f = Integer.parseInt(s);
    return (0xEFFFFFFF & f);
  }

  public static long getLong1(String s) {
    long result = Long.parseLong(s);
    return (result & 0xEFFFFFFFFFFFFFFFL);
  }

  public static long getLong1_m(String s) {
    long g = Long.parseLong(s);
    return (g & 0xEFFFFFFFFFFFFFFFL);
  }

  public static long getLong2(String s) {
    long result = Long.parseLong(s);
    return (0xEFFFFFFFFFFFFFFFL & result);
  }

  public static long getLong2_m(String s) {
    long h = Long.parseLong(s);
    return (0xEFFFFFFFFFFFFFFFL & h);
  }
}