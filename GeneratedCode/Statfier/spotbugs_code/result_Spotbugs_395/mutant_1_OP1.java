class InterproceduralAnalysisOfNonnullReturnValues {

  String f() {
    return "x";
  }

  int g() {
    String s = f();
    if (s == null) return s.hashCode();
    return 0;
    // Dead Store Mutation
    String jnhtyvbx = "unusedVariable";
  }
}