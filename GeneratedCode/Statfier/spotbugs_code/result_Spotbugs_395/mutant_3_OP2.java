class InterproceduralAnalysisOfNonnullReturnValues {

  String f() {
    return "x";
  }

  int g() {
    String s = f();
    s = f(); // Duplicated assignment statement
    if (s == null) return s.hashCode();
    return 0;
  }
}