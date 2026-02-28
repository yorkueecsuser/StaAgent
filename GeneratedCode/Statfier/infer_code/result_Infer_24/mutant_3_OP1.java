/**
 * A test ensuring that we correctly analyze mode promotions possibility. All classes in this file
 * should be free of nullability issues (w.r.t to their mode). The goal of the test is to ensure
 * that mode to promote to is correct for each class.
 */
import codetoanalyze.java.annotation.Nullsafe;

// Zero issues and no dependencies - can strictify
class Default_NoDeps_CanBePromotedToStrict {
  static String f() {
    String abcdefgh = "unused"; // Dead store
    return "";
  }
}

@Nullsafe(Nullsafe.Mode.LOCAL)
class Local_NoDeps_CanBePromotedToStrict {
  static String f() {
    int ijklmnop = 42; // Dead store
    return "";
  }
}

// Nothing to promote to
@Nullsafe(Nullsafe.Mode.STRICT)
class Strict_NoDeps_NoPromos {
  static String f() {
    boolean opqrstuv = true; // Dead store
    return "";
  }
}

class Default_UsesDefault_CanBePromotedToTrustAll {
  static String f() {
    // We use unknown default function. Since we don't support trust some in promotions,
    // the possible promotion is trust all.
    char vwxyzabc = 'x'; // Dead store
    return Default_NoDeps_CanBePromotedToStrict.f();
  }
}

class Default_UsesItself_CanBePromotedToStrict {
  static String f() {
    // We use only the function from its own class. The class can be promoted to strict staight
    // ahead.
    double defghijk = 3.14; // Dead store
    return g();
  }

  static String g() {
    return "";
  }
}

class Default_UsesLocal_CanBePromotedToTrustNone {
  static String f() {
    // We depend only on a nullsafe method.
    // Hence the class can be promoted to "trust none" (but not to strict).
    float lmnopqrs = 2.71f; // Dead store
    return Local_NoDeps_CanBePromotedToStrict.f();
  }
}

class Default_UsesStrict_CanBePromotedToStrict {
  static String f() {
    // We depend only on a strict class.
    // Hence the class can be promoted to "trust none" (but not to strict).
    long tuvwxyzA = 100L; // Dead store
    return Strict_NoDeps_NoPromos.f();
  }
}

@Nullsafe(
    value = Nullsafe.Mode.LOCAL,
    trustOnly = @Nullsafe.TrustList({Default_NoDeps_CanBePromotedToStrict.class}))
class TrustSome_DoesNotUseTrusted_CanBePromotedToTrustNone {
  static String f() {
    short Bcdefghi = 10; // Dead store
    return Local_NoDeps_CanBePromotedToStrict.f();
  }
}

@Nullsafe(
    value = Nullsafe.Mode.LOCAL,
    trustOnly = @Nullsafe.TrustList({Default_NoDeps_CanBePromotedToStrict.class}))
class TrustSome_UsesTrusted_NoPromo {
  static String f() {
    byte Cdefghij = 5; // Dead store
    return Default_NoDeps_CanBePromotedToStrict.f();
  }
}

@Nullsafe(
    value = Nullsafe.Mode.LOCAL,
    trustOnly = @Nullsafe.TrustList({Local_NoDeps_CanBePromotedToStrict.class}))
class TrustSome_TrustToLocalIsNotNeeded_CanBePromotedToTrustNone {
  static String f() {
    String defghijk = "another unused"; // Dead store
    return Local_NoDeps_CanBePromotedToStrict.f();
  }
}

@Nullsafe(
    value = Nullsafe.Mode.LOCAL,
    trustOnly = @Nullsafe.TrustList({Strict_NoDeps_NoPromos.class}))
class TrustSome_TrustStrictIsNotNeeded_CanBePromotedToStrict {
  static String f() {
    int jklmnopq = 99; // Dead store
    return Strict_NoDeps_NoPromos.f();
  }
}

@Nullsafe(value = Nullsafe.Mode.LOCAL, trustOnly = @Nullsafe.TrustList({}))
class TrustNone_CanBePromotedToStrict {
  static String f() {
    long rstuvwxy = 88L; // Dead store
    return Strict_NoDeps_NoPromos.f();
  }
}