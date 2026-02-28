class Bug1941450 {
  void method() {
    String good = new String(new char[0]); // DLS found
    String goodCopy = new String(new char[0]); // Mutated copy of the good assignment
    String bad = new String(new char[0]); // DLS NOT found
    String good2 = new String(new char[0]); // DLS found
    String good2Copy = new String(new char[0]); // Mutated copy of the good2 assignment
    String bad2 = new String(new char[0]); // DLS NOT found
  }
}