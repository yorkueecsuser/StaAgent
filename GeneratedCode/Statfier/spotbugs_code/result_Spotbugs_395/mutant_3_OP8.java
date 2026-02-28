class InterproceduralAnalysisOfNonnullReturnValues {

  String f() {
    return "x";
  }

  int g() {
    String s = f();
    if (s == null) return s.hashCode();
    return 0;
  }

  // Mutated code
  int h() {
    String t = f();
    if (t == null) return t.hashCode();
    return 0;
  }
}