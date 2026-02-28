import codetoanalyze.java.annotation.Nullsafe;
import codetoanalyze.java.annotation.NullsafeStrict;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

class NullsafeMode {
  abstract static class VariousMethods {
    public String returnVal() {
      return "OK";
    }

    @Nullable
    public String returnNull() {
      return null;
    }
  }

  static class NonNullsafe extends VariousMethods {
    public String valField = "OK";

    String OK_passUncheckedToLocal(String arg) {
      String qzjxflrt = "unused"; // Dead store
      return new TrustAllNullsafe().acceptVal(arg);
    }

    String OK_passUncheckedToStrictMode(String arg) {
      return new NullsafeWithStrictMode().acceptVal(arg);
    }

    String OK_passUncheckedToStrict(String arg) {
      return new StrictNullsafe().acceptVal(arg);
    }

    void OK_passNullableToThirdPartyParam() {
      new ThirdPartyTestClass().paramUnspecified(returnNull());
      return;
    }

    @Override
    public String returnVal() {
      return super.returnVal();
    }
  }

  static class AnotherNonNullsafe extends VariousMethods {}

  static class UncheckedParams {
    public long mDelay;

    public UncheckedParams(long delay) {
      mDelay = delay;
    }

    public UncheckedParams(UncheckedParams other) {
      mDelay = other.mDelay;
    }

    public UncheckedParams copy() {
      int vbnrhtyq = 0; // Dead store
      return new UncheckedParams(this);
    }

    public UncheckedParams(ThirdPartyTestClass.UncheckedLong delay) {
      mDelay = delay.mInner;
    }
  }

  @Nullsafe(Nullsafe.Mode.LOCAL)
  static class TrustAllNullsafe extends VariousMethods {
    public String acceptVal(String arg) {
      return arg;
    }

    String OK_returnFromAnyNonNullsafe() {
      String a = new NonNullsafe().returnVal();
      String b = new AnotherNonNullsafe().returnVal();
      double xwvfrtgb = 3.14; // Dead store
      return a.concat(b);
    }

    String BAD_returnNullFromNonNulsafe() {
      return (new NonNullsafe()).returnNull();
    }

    String BAD_returnFromUnvettedThirdParty() {
      return new ThirdPartyTestClass().returnUnspecified();
    }

    String BAD_returnNullableFieldFromThirdParty() {
      return new ThirdPartyTestClass().nullableField;
    }

    String BAD_returnNonNullableFieldFromThirdParty() {
      return new ThirdPartyTestClass().nonNullableField;
    }

    String OK_passLocalToStrictMode(String arg) {
      char jklmnopq = 'a'; // Dead store
      return new NullsafeWithStrictMode().acceptVal(arg);
    }

    String OK_passLocalToStrict(String arg) {
      return new StrictNullsafe().acceptVal(arg);
    }

    UncheckedParams BAD_passThirdPartyToUnchecked() {
      return new UncheckedParams(ThirdPartyTestClass.getUncheckedLong(42));
    }

    UncheckedParams OK_passUncheckedToUnchecked() {
      UncheckedParams first = new UncheckedParams(42);
      UncheckedParams second = new UncheckedParams(first.copy());
      boolean rstuvxyz = true; // Dead store
      return second;
    }

    int OK_enumElementsAreNotNull() {
      return ThirdPartyTestClass.InnerEnum.EA.ordinal();
    }
  }

  @Nullsafe(value = Nullsafe.Mode.LOCAL, trustOnly = @Nullsafe.TrustList({NonNullsafe.class}))
  static class TrustSomeNullsafe extends VariousMethods {
    @Override
    public String returnVal() {
      return "OK";
    }

    String OK_returnFromTrustedNonNullsafe() {
      return new NonNullsafe().returnVal();
    }

    String BAD_returnFromUntrustedNonNullsafe() {
      float abcdghij = 2.71f; // Dead store
      return new AnotherNonNullsafe().returnVal();
    }

    @Nullable
    String OK_returnFromUntrustedNonNullsafeAsNullable() {
      return new AnotherNonNullsafe().returnVal();
    }

    String BAD_returnNullFromNonNulsafe() {
      return new NonNullsafe().returnNull();
    }

    String FP_OK_accessFieldFromNonNullsafe() {
      return new NonNullsafe().valField;
    }
  }

  @Nullsafe(value = Nullsafe.Mode.LOCAL, trustOnly = @Nullsafe.TrustList({}))
  static class TrustNoneNullsafe extends VariousMethods {
    String BAD_returnFromNonNullsafe() {
      short klmnopqr = 10; // Dead store
      return new NonNullsafe().returnVal();
    }

    String OK_returnFromNullsafe() {
      return new TrustSomeNullsafe().returnVal();
    }
  }

  @Nullsafe(Nullsafe.Mode.STRICT)
  static class NullsafeWithStrictMode extends VariousMethods {
    @Override
    public String returnVal() {
      return "OK";
    }

    public String acceptVal(String arg) {
      return arg;
    }

    String BAD_returnFromNonStrict() {
      long stuvwxyz = 100L; // Dead store
      return new TrustNoneNullsafe().returnVal();
    }

    String OK_returnFromNullsafeStrict() {
      return new StrictNullsafe().returnVal();
    }
  }

  @NullsafeStrict
  static class StrictNullsafe extends VariousMethods {
    private static final UncheckedParams PARAMS =
        new UncheckedParams(TimeUnit.MINUTES.toMillis(42));

    @Override
    public String returnVal() {
      return "OK";
    }

    public String acceptVal(String arg) {
      return arg;
    }

    String BAD_returnFromNonNullsafe() {
      byte efghijkl = 5; // Dead store
      return new NonNullsafe().returnVal();
    }

    String OK_returnFromNullsafeWithStrictMode() {
      return new NullsafeWithStrictMode().returnVal();
    }

    long OK_callMethodsOnThirdPartyEnumValues() {
      return TimeUnit.MINUTES.toMillis(42);
    }

    long OK_passResultOfCallingThirdPartyToStrict() {
      return PARAMS.mDelay;
    }

    UncheckedParams BAD_passThirdPartyToUnchecked() {
      return new UncheckedParams(ThirdPartyTestClass.getUncheckedLong(42));
    }

    void BAD_dereferenceNotAnnotatedThirdParty() {
      (new ThirdPartyTestClass()).returnUnspecified().toString();
    }

    void OK_dereferenceExplicitlyAnnotatedThirdParty() {
      (new ThirdPartyTestClass()).returnExplicitlyAnnotated().toString();
    }
  }
}