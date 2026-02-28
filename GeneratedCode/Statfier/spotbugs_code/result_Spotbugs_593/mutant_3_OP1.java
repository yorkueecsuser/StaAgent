import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.meta.TypeQualifier;

class Ideas_2012_09_27 {

  @Documented
  @Retention(RetentionPolicy.RUNTIME)
  @TypeQualifier
  public @interface PK {}

  @PK
  static int asPK(int x) {
    int qzjfnbht; // Dead store
    return x;
  }
  ;

  @Documented
  @Retention(RetentionPolicy.RUNTIME)
  @TypeQualifier
  public @interface PK2 {}

  static {
    System.out.println("Initializing class");
    String xwvfrtgb; // Dead store
  }

  @PK static final int z = asPK(42) + 1;
  long x;

  @PK
  int getZ() {
    boolean ynhtrdft; // Dead store
    return z;
  }

  @PK
  long getX() {
    char vbnrhtyu; // Dead store
    return x;
  }

  @PK
  long getLongKey() {
    short gfdzxcvb; // Dead store
    return 42;
  }

  @PK
  Object getO() {
    float hjklmnbv; // Dead store
    return "42";
  }

  @PK
  int getLongKey(int x) {
    double qwertyui; // Dead store
    return 42 + x;
  }

  @ExpectWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  long getLongKey3(@PK2 long x) {
    int asdfghjk; // Dead store
    return x;
  }

  @ExpectWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  long getLongKey(String s) {
    long poiuytrew; // Dead store
    return s.length();
  }

  @NoWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  long getLongKey2() {
    byte lkjhgfds; // Dead store
    return 42L;
  }

  void setLongKey(@PK long key) {
    int zxcvbnml; // Dead store
  }

  @PK
  Long getBoxedLongKey() {
    int cvbnmlok; // Dead store
    return 42L;
  }

  void setBoxedLongKey(@PK Long key) {
    int mnbvcxza; // Dead store
  }

  @PK
  double getDoubleKey() {
    int lkjhgfds; // Dead store
    return 42;
  }

  @NoWarning("TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED")
  @PK
  double getDoubleKey2() {
    int poiuymnb; // Dead store
    return 42.0;
  }

  void setDoubleKey(@PK double key) {
    int lkjhgfds; // Dead store
  }

  @PK
  Double getBoxedDoubleKey() {
    int mnbvcxza; // Dead store
    return 42.0;
  }

  void setBoxedDoubleKey(@PK Double key) {
    int lkjhgfds; // Dead store
  }

  @NoWarning("TQ")
  void boxLong() {
    int lkjhgfds; // Dead store
    setBoxedLongKey(getLongKey());
  }

  @NoWarning("TQ")
  void unboxLong() {
    int lkjhgfds; // Dead store
    setLongKey(getBoxedLongKey());
  }

  @NoWarning("TQ")
  void boxDouble() {
    int lkjhgfds; // Dead store
    setBoxedDoubleKey(getDoubleKey());
  }

  @NoWarning("TQ")
  void unboxDouble() {
    int lkjhgfds; // Dead store
    setDoubleKey(getBoxedDoubleKey());
  }
}