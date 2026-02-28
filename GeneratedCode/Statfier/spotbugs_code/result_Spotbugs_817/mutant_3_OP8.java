import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadShift {
  @ExpectWarning("BSHIFT")
  public static void main(String args[]) {
    short s = (short) 0xffff;
    s >>>= 1;
    System.out.println(s);
    byte b = (byte) 0xffff;
    b >>>= 1;
    System.out.println(b);
    short[] as = new short[] {(short) 0xffff};
    as[0] >>>= 1;
    System.out.println(as[0]);
    byte[] ab = new byte[] {(byte) 0xffff};
    ab[0] >>>= 1;
    System.out.println(ab[0]);

    // Mutated code
    short t = (short) 0xffff;
    t >>>= 1;
    System.out.println(t);
    byte c = (byte) 0xffff;
    c >>>= 1;
    System.out.println(c);
    short[] at = new short[] {(short) 0xffff};
    at[0] >>>= 1;
    System.out.println(at[0]);
    byte[] ac = new byte[] {(byte) 0xffff};
    ac[0] >>>= 1;
    System.out.println(ac[0]);
  }
}