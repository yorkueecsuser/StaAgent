class Bug1941450 {
  void method() {
    String good = new String(new char[0]); // DLS found
    String goodCopy = new String(new char[0]); // Mutated copy of good
    String bad = new String(new char[0]); // DLS NOT found
    String bad2 = new String(new char[0]); // DLS NOT found
    String bad2Copy = new String(new char[0]); // Mutated copy of bad2
    String good2 = new String(new char[0]); // DLS found
    String good2Copy = new String(new char[0]); // Mutated copy of good2
  }
}