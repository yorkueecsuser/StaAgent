/**
 * A test ensuring that we correctly analyze mode promotions possibility. All classes in this file
 * should be free of nullability issues (w.r.t to their mode). The goal of the test is to ensure
 * that mode to promote to is correct for each class.
 */
import codetoanalyze.java.annotation.Nullsafe;

// Zero issues and no dependencies - can strictify
class Default_NoDeps_CanBePromotedToStrict {
  static String f() {
    String x = "";
    String y = x; // Mutant: Renamed 'f' to 'x' and introduced 'y'
    return y;
  }
}

@Nullsafe(Nullsafe.Mode.LOCAL)
class Local_NoDeps_CanBePromotedToStrict {
  static String f() {
    String a = "";
    String b = a; // Mutant: Renamed 'f' to 'a' and introduced 'b'
    return b;
  }
}

// Nothing to promote to
@Nullsafe(Nullsafe.Mode.STRICT)
class Strict_NoDeps_NoPromos {
  static String f() {
    String c = "";
    String d = c; // Mutant: Renamed 'f' to 'c' and introduced 'd'
    return d;
  }
}

class Default_UsesDefault_CanBePromotedToTrustAll {
  static String f() {
    // We use unknown default function. Since we don't support trust some in promotions,
    // the possible promotion is trust all.
    String e = Default_NoDeps_CanBePromotedToStrict.f();
    String g = e; // Mutant: Introduced 'g'
    return g;
  }
}

class Default_UsesItself_CanBePromotedToStrict {
  static String f() {
    // We use only the function from its own class. The class can be promoted to strict staight
    // ahead.
    String h = g();
    String i = h; // Mutant: Introduced 'i'
    return i;
  }

  static String g() {
    String j = "";
    String k = j; // Mutant: Introduced 'k'
    return k;
  }
}

class Default_UsesLocal_CanBePromotedToTrustNone {
  static String f() {
    // We depend only on a nullsafe method.
    // Hence the class can be promoted to "trust none" (but not to strict).
    String l = Local_NoDeps_CanBePromotedToStrict.f();
    String m = l; // Mutant: Introduced'm'
    return m;
  }
}

class Default_UsesStrict_CanBePromotedToStrict {
  static String f() {
    // We depend only on a strict class.
    // Hence the class can be promoted to "trust none" (but not to strict).
    String n = Strict_NoDeps_NoPromos.f();
    String o = n; // Mutant: Introduced 'o'
    return o;
  }
}

@Nullsafe(
    value = Nullsafe.Mode.LOCAL,
    trustOnly = @Nullsafe.TrustList({Default_NoDeps_CanBePromotedToStrict.class}))
class TrustSome_DoesNotUseTrusted_CanBePromotedToTrustNone {
  static String f() {
    String p = Local_NoDeps_CanBePromotedToStrict.f();
    String q = p; // Mutant: Introduced 'q'
    return q;
  }
}

@Nullsafe(
    value = Nullsafe.Mode.LOCAL,
    trustOnly = @Nullsafe.TrustList({Default_NoDeps_CanBePromotedToStrict.class}))
class TrustSome_UsesTrusted_NoPromo {
  static String f() {
    String r = Default_NoDeps_CanBePromotedToStrict.f();
    String s = r; // Mutant: Introduced's'
    return s;
  }
}

@Nullsafe(
    value = Nullsafe.Mode.LOCAL,
    trustOnly = @Nullsafe.TrustList({Local_NoDeps_CanBePromotedToStrict.class}))
class TrustSome_TrustToLocalIsNotNeeded_CanBePromotedToTrustNone {
  static String f() {
    String t = Local_NoDeps_CanBePromotedToStrict.f();
    String u = t; // Mutant: Introduced 'u'
    return u;
  }
}

@Nullsafe(
    value = Nullsafe.Mode.LOCAL,
    trustOnly = @Nullsafe.TrustList({Strict_NoDeps_NoPromos.class}))
class TrustSome_TrustStrictIsNotNeeded_CanBePromotedToStrict {
  static String f() {
    String v = Strict_NoDeps_NoPromos.f();
    String w = v; // Mutant: Introduced 'w'
    return w;
  }
}

@Nullsafe(value = Nullsafe.Mode.LOCAL, trustOnly = @Nullsafe.TrustList({}))
class TrustNone_CanBePromotedToStrict {
  static String f() {
    String z = Strict_NoDeps_NoPromos.f();
    String aa = z; // Mutant: Introduced 'aa'
    return aa;
  }
}