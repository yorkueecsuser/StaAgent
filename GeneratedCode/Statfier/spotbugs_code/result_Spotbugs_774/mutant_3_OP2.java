class Bug1941450 {
  void method() {
    String good = new String(new char[0]); // DLS found
    String good = new String(new char[0]); // Mutated line - DLS found
    String bad = new String(new char[0]); // DLS NOT found
    String bad2 = new String(new char[0]); // DLS NOT found
    String bad2 = new String(new char[0]); // Mutated line - DLS NOT found
    String good2 = new String(new char[0]); // DLS found
    String good2 = new String(new char[0]); // Mutated line - DLS found
  }
}