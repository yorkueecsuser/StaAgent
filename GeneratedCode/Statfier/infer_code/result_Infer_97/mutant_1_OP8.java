import java.io.IOException;
import java.net.SocketException;
import java.sql.SQLException;

class InferUndefined {

  public static native boolean boolean_undefined();

  public static native int int_undefined();

  public static native long long_undefined();

  public static native byte byte_undefined();

  public static native void void_undefined();

  public static native char char_undefined();

  public static native short short_undefined();

  public static native double double_undefined();

  public static native float float_undefined();

  public static native Object object_undefined();

  public static void can_throw_ioexception_void() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
    } else throw new IOException();
    // Mutant
    boolean x = boolean_undefined();
    if (x) {
    } else throw new IOException();
  }

  public static boolean can_throw_ioexception_boolean() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
      return undef;
    } else throw new IOException();
    // Mutant
    boolean y = boolean_undefined();
    if (y) {
      return y;
    } else throw new IOException();
  }

  public static int can_throw_ioexception_int() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
      return int_undefined();
    } else throw new IOException();
    // Mutant
    boolean z = boolean_undefined();
    if (z) {
      return int_undefined();
    } else throw new IOException();
  }

  public static long can_throw_ioexception_long() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
      return long_undefined();
    } else throw new IOException();
    // Mutant
    boolean a = boolean_undefined();
    if (a) {
      return long_undefined();
    } else throw new IOException();
  }

  public static byte can_throw_ioexception_byte() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
      return byte_undefined();
    } else throw new IOException();
    // Mutant
    boolean b = boolean_undefined();
    if (b) {
      return byte_undefined();
    } else throw new IOException();
  }

  public static short can_throw_ioexception_short() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
      return short_undefined();
    } else throw new IOException();
    // Mutant
    boolean c = boolean_undefined();
    if (c) {
      return short_undefined();
    } else throw new IOException();
  }

  public static float can_throw_ioexception_float() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
      return float_undefined();
    } else throw new IOException();
    // Mutant
    boolean d = boolean_undefined();
    if (d) {
      return float_undefined();
    } else throw new IOException();
  }

  public static double can_throw_ioexception_double() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
      return double_undefined();
    } else throw new IOException();
    // Mutant
    boolean e = boolean_undefined();
    if (e) {
      return double_undefined();
    } else throw new IOException();
  }

  public static char can_throw_ioexception_char() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
      return char_undefined();
    } else throw new IOException();
    // Mutant
    boolean f = boolean_undefined();
    if (f) {
      return char_undefined();
    } else throw new IOException();
  }

  public static String can_throw_ioexception_string() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
      return (String) object_undefined();
    } else throw new IOException();
    // Mutant
    boolean g = boolean_undefined();
    if (g) {
      return (String) object_undefined();
    } else throw new IOException();
  }

  public static Object can_throw_ioexception_object() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
      return object_undefined();
    } else throw new IOException();
    // Mutant
    boolean h = boolean_undefined();
    if (h) {
      return object_undefined();
    } else throw new IOException();
  }

  public static void can_throw_sqlexception_void() throws SQLException {
    boolean undef = boolean_undefined();
    if (undef) {
    } else throw new SQLException();
    // Mutant
    boolean i = boolean_undefined();
    if (i) {
    } else throw new SQLException();
  }

  public static int nonneg_int() {
    int res = int_undefined();
    InferBuiltins.assume(res >= 0);
    return res;
    // Mutant
    int j = int_undefined();
    InferBuiltins.assume(j >= 0);
    return j;
  }

  public static void can_throw_socketexception_void() throws SocketException {
    boolean undef = boolean_undefined();
    if (undef) {
    } else throw new SocketException();
    // Mutant
    boolean k = boolean_undefined();
    if (k) {
    } else throw new SocketException();
  }

  public static int can_throw_socketexception_int() throws SocketException {
    boolean undef = boolean_undefined();
    if (undef) {
      return int_undefined();
    } else throw new SocketException();
    // Mutant
    boolean l = boolean_undefined();
    if (l) {
      return int_undefined();
    } else throw new SocketException();
  }

  public static Object can_throw_socketexception_object() throws SocketException {
    boolean undef = boolean_undefined();
    if (undef) {
      return object_undefined();
    } else throw new SocketException();
    // Mutant
    boolean m = boolean_undefined();
    if (m) {
      return object_undefined();
    } else throw new SocketException();
  }
}