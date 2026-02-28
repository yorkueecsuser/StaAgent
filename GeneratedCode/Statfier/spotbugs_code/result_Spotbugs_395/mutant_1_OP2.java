class InterproceduralAnalysisOfNonnullReturnValues {

  String f() {
    return "x";
  }

  int g() {
    String s = f();
    s = f(); // Duplicate assignment statement
    if (s == null) return s.hashCode();
    return 0;
  }
}