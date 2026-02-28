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
      // Inserting unreachable for loop
      boolean conditionFor = boolean_undefined();
      for (int i = 0;!conditionFor; i++) {
        // Unreachable code
      }
    } else throw new IOException();
  }

  public static boolean can_throw_ioexception_boolean() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
      // Inserting unreachable for loop
      boolean conditionFor = boolean_undefined();
      for (int i = 0;!conditionFor; i++) {
        // Unreachable code
      }
      return undef;
    } else throw new IOException();
  }

  public static int can_throw_ioexception_int() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
      // Inserting unreachable for loop
      boolean conditionFor = boolean_undefined();
      for (int i = 0;!conditionFor; i++) {
        // Unreachable code
      }
      return int_undefined();
    } else throw new IOException();
  }

  public static long can_throw_ioexception_long() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
      // Inserting unreachable for loop
      boolean conditionFor = boolean_undefined();
      for (int i = 0;!conditionFor; i++) {
        // Unreachable code
      }
      return long_undefined();
    } else throw new IOException();
  }

  public static byte can_throw_ioexception_byte() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
      // Inserting unreachable for loop
      boolean conditionFor = boolean_undefined();
      for (int i = 0;!conditionFor; i++) {
        // Unreachable code
      }
      return byte_undefined();
    } else throw new IOException();
  }

  public static short can_throw_ioexception_short() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
      // Inserting unreachable for loop
      boolean conditionFor = boolean_undefined();
      for (int i = 0;!conditionFor; i++) {
        // Unreachable code
      }
      return short_undefined();
    } else throw new IOException();
  }

  public static float can_throw_ioexception_float() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
      // Inserting unreachable for loop
      boolean conditionFor = boolean_undefined();
      for (int i = 0;!conditionFor; i++) {
        // Unreachable code
      }
      return float_undefined();
    } else throw new IOException();
  }

  public static double can_throw_ioexception_double() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
      // Inserting unreachable for loop
      boolean conditionFor = boolean_undefined();
      for (int i = 0;!conditionFor; i++) {
        // Unreachable code
      }
      return double_undefined();
    } else throw new IOException();
  }

  public static char can_throw_ioexception_char() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
      // Inserting unreachable for loop
      boolean conditionFor = boolean_undefined();
      for (int i = 0;!conditionFor; i++) {
        // Unreachable code
      }
      return char_undefined();
    } else throw new IOException();
  }

  public static String can_throw_ioexception_string() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
      // Inserting unreachable for loop
      boolean conditionFor = boolean_undefined();
      for (int i = 0;!conditionFor; i++) {
        // Unreachable code
      }
      return (String) object_undefined();
    } else throw new IOException();
  }

  public static Object can_throw_ioexception_object() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
      // Inserting unreachable for loop
      boolean conditionFor = boolean_undefined();
      for (int i = 0;!conditionFor; i++) {
        // Unreachable code
      }
      return object_undefined();
    } else throw new IOException();
  }

  public static void can_throw_sqlexception_void() throws SQLException {
    boolean undef = boolean_undefined();
    if (undef) {
      // Inserting unreachable for loop
      boolean conditionFor = boolean_undefined();
      for (int i = 0;!conditionFor; i++) {
        // Unreachable code
      }
    } else throw new SQLException();
  }

  public static int nonneg_int() {
    int res = int_undefined();
    InferBuiltins.assume(res >= 0);
    // Inserting unreachable for loop
    boolean conditionFor = boolean_undefined();
    for (int i = 0;!conditionFor; i++) {
      // Unreachable code
    }
    return res;
  }

  public static void can_throw_socketexception_void() throws SocketException {
    boolean undef = boolean_undefined();
    if (undef) {
      // Inserting unreachable for loop
      boolean conditionFor = boolean_undefined();
      for (int i = 0;!conditionFor; i++) {
        // Unreachable code
      }
    } else throw new SocketException();
  }

  public static int can_throw_socketexception_int() throws SocketException {
    boolean undef = boolean_undefined();
    if (undef) {
      // Inserting unreachable for loop
      boolean conditionFor = boolean_undefined();
      for (int i = 0;!conditionFor; i++) {
        // Unreachable code
      }
      return int_undefined();
    } else throw new SocketException();
  }

  public static Object can_throw_socketexception_object() throws SocketException {
    boolean undef = boolean_undefined();
    if (undef) {
      // Inserting unreachable for loop
      boolean conditionFor = boolean_undefined();
      for (int i = 0;!conditionFor; i++) {
        // Unreachable code
      }
      return object_undefined();
    } else throw new SocketException();
  }
}