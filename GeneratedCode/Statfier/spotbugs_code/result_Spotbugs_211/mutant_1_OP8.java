import com.google.common.primitives.Booleans;
import com.google.common.primitives.Chars;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Floats;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.google.common.primitives.Shorts;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.sql.Time;

class Ideas_2011_08_01 {

  // @DesireNoWarning("VA_FORMAT_STRING_BAD_CONVERSION")
  public static void main(String args[]) {
    Time t = new Time(System.currentTimeMillis());
    System.out.printf("%tr%n", t);
    // Mutant: Renaming 't' to 'x'
    Time x = new Time(System.currentTimeMillis());
    System.out.printf("%tr%n", x);
  }

  @ExpectWarning(value = "RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE", num = 9)
  public static int testGuavaPrimitiveCompareCalls() {
    int count = 0;
    if (Booleans.compare(false, true) == -1) count++;
    if (Chars.compare('a', 'b') == -1) count++;
    if (Doubles.compare(1, 2) == -1) count++;
    if (Floats.compare(1, 2) == -1) count++;
    if (Ints.compare(1, 2) == -1) count++;
    if (Longs.compare(1, 2) == -1) count++;
    if (Shorts.compare((short) 1, (short) 2) == -1) count++;
    if (SignedBytes.compare((byte) 1, (byte) 2) == -1) count++;
    if (UnsignedBytes.compare((byte) 1, (byte) 2) == -1) count++;
    return count;
    // Mutant: Renaming 'count' to 'a'
    int a = 0;
    if (Booleans.compare(false, true) == -1) a++;
    if (Chars.compare('a', 'b') == -1) a++;
    if (Doubles.compare(1, 2) == -1) a++;
    if (Floats.compare(1, 2) == -1) a++;
    if (Ints.compare(1, 2) == -1) a++;
    if (Longs.compare(1, 2) == -1) a++;
    if (Shorts.compare((short) 1, (short) 2) == -1) a++;
    if (SignedBytes.compare((byte) 1, (byte) 2) == -1) a++;
    if (UnsignedBytes.compare((byte) 1, (byte) 2) == -1) a++;
    return a;
  }
}