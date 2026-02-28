/**
 * A test ensuring that we correctly analyze mode promotions possibility. All classes in this file
 * should be free of nullability issues (w.r.t to their mode). The goal of the test is to ensure
 * that mode to promote to is correct for each class.
 */
import codetoanalyze.java.annotation.Nullsafe;

// Zero issues and no dependencies - can strictify
class Default_NoDeps_CanBePromotedToStrict {
  static String f() {
    String result = "";
    String result = ""; // Mutation: duplicated assignment
    return result;
  }
}

@Nullsafe(Nullsafe.Mode.LOCAL)
class Local_NoDeps_CanBePromotedToStrict {
  static String f() {
    String result = "";
    String result = ""; // Mutation: duplicated assignment
    return result;
  }
}

// Nothing to promote to
@Nullsafe(Nullsafe.Mode.STRICT)
class Strict_NoDeps_NoPromos {
  static String f() {
    String result = "";
    String result = ""; // Mutation: duplicated assignment
    return result;
  }
}

class Default_UsesDefault_CanBePromotedToTrustAll {
  static String f() {
    // We use unknown default function. Since we don't support trust some in promotions,
    // the possible promotion is trust all.
    String result = Default_NoDeps_CanBePromotedToStrict.f();
    return result;
  }
}

class Default_UsesItself_CanBePromotedToStrict {
  static String f() {
    // We use only the function from its own class. The class can be promoted to strict staight
    // ahead.
    String result = g();
    String result = g(); // Mutation: duplicated assignment
    return result;
  }

  static String g() {
    return "";
  }
}

class Default_UsesLocal_CanBePromotedToTrustNone {
  static String f() {
    // We depend only on a nullsafe method.
    // Hence the class can be promoted to "trust none" (but not to strict).
    String result = Local_NoDeps_CanBePromotedToStrict.f();
    return result;
  }
}

class Default_UsesStrict_CanBePromotedToStrict {
  static String f() {
    // We depend only on a strict class.
    // Hence the class can be promoted to "trust none" (but not to strict).
    String result = Strict_NoDeps_NoPromos.f();
    return result;
  }
}

@Nullsafe(
    value = Nullsafe.Mode.LOCAL,
    trustOnly = @Nullsafe.TrustList({Default_NoDeps_CanBePromotedToStrict.class}))
class TrustSome_DoesNotUseTrusted_CanBePromotedToTrustNone {
  static String f() {
    String result = Local_NoDeps_CanBePromotedToStrict.f();
    return result;
  }
}

@Nullsafe(
    value = Nullsafe.Mode.LOCAL,
    trustOnly = @Nullsafe.TrustList({Default_NoDeps_CanBePromotedToStrict.class}))
class TrustSome_UsesTrusted_NoPromo {
  static String f() {
    String result = Default_NoDeps_CanBePromotedToStrict.f();
    String result = Default_NoDeps_CanBePromotedToStrict.f(); // Mutation: duplicated assignment
    return result;
  }
}

@Nullsafe(
    value = Nullsafe.Mode.LOCAL,
    trustOnly = @Nullsafe.TrustList({Local_NoDeps_CanBePromotedToStrict.class}))
class TrustSome_TrustToLocalIsNotNeeded_CanBePromotedToTrustNone {
  static String f() {
    String result = Local_NoDeps_CanBePromotedToStrict.f();
    return result;
  }
}

@Nullsafe(
    value = Nullsafe.Mode.LOCAL,
    trustOnly = @Nullsafe.TrustList({Strict_NoDeps_NoPromos.class}))
class TrustSome_TrustStrictIsNotNeeded_CanBePromotedToStrict {
  static String f() {
    String result = Strict_NoDeps_NoPromos.f();
    String result = Strict_NoDeps_NoPromos.f(); // Mutation: duplicated assignment
    return result;
  }
}

@Nullsafe(value = Nullsafe.Mode.LOCAL, trustOnly = @Nullsafe.TrustList({}))
class TrustNone_CanBePromotedToStrict {
  static String f() {
    String result = Strict_NoDeps_NoPromos.f();
    String result = Strict_NoDeps_NoPromos.f(); // Mutation: duplicated assignment
    return result;
  }
}