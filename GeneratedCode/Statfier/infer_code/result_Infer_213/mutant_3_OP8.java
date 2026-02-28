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

    // Mutant: Renaming 'arg' to 'b'
    String mutant_OK_passUncheckedToLocal(String b) {
      return new TrustAllNullsafe().acceptVal(b);
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
      return new UncheckedParams(this);
    }

    public UncheckedParams(ThirdPartyTestClass.UncheckedLong delay) {
      mDelay = delay.mInner;
    }

    // Mutant: Renaming 'delay' to 'c'
    public UncheckedParams mutant_UncheckedParams(long c) {
      mDelay = c;
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
      return second;
    }

    int OK_enumElementsAreNotNull() {
      return ThirdPartyTestClass.InnerEnum.EA.ordinal();
    }

    // Mutant: Renaming 'a' to 'd'
    String mutant_OK_returnFromAnyNonNullsafe() {
      String d = new NonNullsafe().returnVal();
      String b = new AnotherNonNullsafe().returnVal();
      return d.concat(b);
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

    // Mutant: Renaming 'arg' to 'e'
    @Override
    public String mutant_returnVal(String e) {
      return "OK";
    }
  }

  @Nullsafe(value = Nullsafe.Mode.LOCAL, trustOnly = @Nullsafe.TrustList({}))
  static class TrustNoneNullsafe extends VariousMethods {
    String BAD_returnFromNonNullsafe() {
      return new NonNullsafe().returnVal();
    }

    String OK_returnFromNullsafe() {
      return new TrustSomeNullsafe().returnVal();
    }

    // Mutant: Renaming 'arg' to 'f'
    String mutant_BAD_returnFromNonNullsafe(String f) {
      return new NonNullsafe().returnVal();
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
      return new TrustNoneNullsafe().returnVal();
    }

    String OK_returnFromNullsafeStrict() {
      return new StrictNullsafe().returnVal();
    }

    // Mutant: Renaming 'arg' to 'g'
    public String mutant_acceptVal(String g) {
      return g;
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

    // Mutant: Renaming 'arg' to 'h'
    public String mutant_acceptVal(String h) {
      return h;
    }
  }
}