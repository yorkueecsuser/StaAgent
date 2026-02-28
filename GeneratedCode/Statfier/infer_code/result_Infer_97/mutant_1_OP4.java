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
    // Mutant: Inserting unreachable if-else branch
    boolean condition = boolean_undefined();
    if (condition &&!condition) {
      System.out.println("This is an unreachable if block");
    } else if (!condition && condition) {
      System.out.println("This is an unreachable else block");
    }
  }

  public static boolean can_throw_ioexception_boolean() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
      return undef;
    } else throw new IOException();
    // Mutant: Inserting unreachable if-else branch
    boolean condition = boolean_undefined();
    if (condition &&!condition) {
      return true;
    } else if (!condition && condition) {
      return false;
    }
    return undef;
  }

  public static int can_throw_ioexception_int() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
      return int_undefined();
    } else throw new IOException();
    // Mutant: Inserting unreachable if-else branch
    boolean condition = boolean_undefined();
    if (condition &&!condition) {
      return 0;
    } else if (!condition && condition) {
      return 1;
    }
    return int_undefined();
  }

  public static long can_throw_ioexception_long() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
      return long_undefined();
    } else throw new IOException();
    // Mutant: Inserting unreachable if-else branch
    boolean condition = boolean_undefined();
    if (condition &&!condition) {
      return 0L;
    } else if (!condition && condition) {
      return 1L;
    }
    return long_undefined();
  }

  public static byte can_throw_ioexception_byte() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
      return byte_undefined();
    } else throw new IOException();
    // Mutant: Inserting unreachable if-else branch
    boolean condition = boolean_undefined();
    if (condition &&!condition) {
      return 0;
    } else if (!condition && condition) {
      return 1;
    }
    return byte_undefined();
  }

  public static short can_throw_ioexception_short() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
      return short_undefined();
    } else throw new IOException();
    // Mutant: Inserting unreachable if-else branch
    boolean condition = boolean_undefined();
    if (condition &&!condition) {
      return 0;
    } else if (!condition && condition) {
      return 1;
    }
    return short_undefined();
  }

  public static float can_throw_ioexception_float() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
      return float_undefined();
    } else throw new IOException();
    // Mutant: Inserting unreachable if-else branch
    boolean condition = boolean_undefined();
    if (condition &&!condition) {
      return 0.0f;
    } else if (!condition && condition) {
      return 1.0f;
    }
    return float_undefined();
  }

  public static double can_throw_ioexception_double() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
      return double_undefined();
    } else throw new IOException();
    // Mutant: Inserting unreachable if-else branch
    boolean condition = boolean_undefined();
    if (condition &&!condition) {
      return 0.0;
    } else if (!condition && condition) {
      return 1.0;
    }
    return double_undefined();
  }

  public static char can_throw_ioexception_char() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
      return char_undefined();
    } else throw new IOException();
    // Mutant: Inserting unreachable if-else branch
    boolean condition = boolean_undefined();
    if (condition &&!condition) {
      return 'a';
    } else if (!condition && condition) {
      return 'b';
    }
    return char_undefined();
  }

  public static String can_throw_ioexception_string() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
      return (String) object_undefined();
    } else throw new IOException();
    // Mutant: Inserting unreachable if-else branch
    boolean condition = boolean_undefined();
    if (condition &&!condition) {
      return "unreachable";
    } else if (!condition && condition) {
      return "also unreachable";
    }
    return (String) object_undefined();
  }

  public static Object can_throw_ioexception_object() throws IOException {
    boolean undef = boolean_undefined();
    if (undef) {
      return object_undefined();
    } else throw new IOException();
    // Mutant: Inserting unreachable if-else branch
    boolean condition = boolean_undefined();
    if (condition &&!condition) {
      return new Object();
    } else if (!condition && condition) {
      return new Object();
    }
    return object_undefined();
  }

  public static void can_throw_sqlexception_void() throws SQLException {
    boolean undef = boolean_undefined();
    if (undef) {
    } else throw new SQLException();
    // Mutant: Inserting unreachable if-else branch
    boolean condition = boolean_undefined();
    if (condition &&!condition) {
      System.out.println("This is an unreachable if block");
    } else if (!condition && condition) {
      System.out.println("This is an unreachable else block");
    }
  }

  public static int nonneg_int() {
    int res = int_undefined();
    InferBuiltins.assume(res >= 0);
    return res;
    // Mutant: Inserting unreachable if-else branch
    boolean condition = boolean_undefined();
    if (condition &&!condition) {
      return 0;
    } else if (!condition && condition) {
      return 1;
    }
    return res;
  }

  public static void can_throw_socketexception_void() throws SocketException {
    boolean undef = boolean_undefined();
    if (undef) {
    } else throw new SocketException();
    // Mutant: Inserting unreachable if-else branch
    boolean condition = boolean_undefined();
    if (condition &&!condition) {
      System.out.println("This is an unreachable if block");
    } else if (!condition && condition) {
      System.out.println("This is an unreachable else block");
    }
  }

  public static int can_throw_socketexception_int() throws SocketException {
    boolean undef = boolean_undefined();
    if (undef) {
      return int_undefined();
    } else throw new SocketException();
    // Mutant: Inserting unreachable if-else branch
    boolean condition = boolean_undefined();
    if (condition &&!condition) {
      return 0;
    } else if (!condition && condition) {
      return 1;
    }
    return int_undefined();
  }

  public static Object can_throw_socketexception_object() throws SocketException {
    boolean undef = boolean_undefined();
    if (undef) {
      return object_undefined();
    } else throw new SocketException();
    // Mutant: Inserting unreachable if-else branch
    boolean condition = boolean_undefined();
    if (condition &&!condition) {
      return new Object();
    } else if (!condition && condition) {
      return new Object();
    }
    return object_undefined();
  }
}