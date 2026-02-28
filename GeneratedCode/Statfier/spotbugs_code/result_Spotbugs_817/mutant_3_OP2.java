import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadShift {
  @ExpectWarning("BSHIFT")
  public static void main(String args[]) {
    short s = (short) 0xffff;
    s >>>= 1;
    System.out.println(s);
    s >>>= 1; // Mutant: duplicated assignment statement
    System.out.println(s);
    byte b = (byte) 0xffff;
    b >>>= 1;
    System.out.println(b);
    b >>>= 1; // Mutant: duplicated assignment statement
    System.out.println(b);
    short[] as = new short[] {(short) 0xffff};
    as[0] >>>= 1;
    System.out.println(as[0]);
    as[0] >>>= 1; // Mutant: duplicated assignment statement
    System.out.println(as[0]);
    byte[] ab = new byte[] {(byte) 0xffff};
    ab[0] >>>= 1;
    System.out.println(ab[0]);
    ab[0] >>>= 1; // Mutant: duplicated assignment statement
    System.out.println(ab[0]);
  }
}