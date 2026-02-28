class Bug1941450 {
  void method() {
    String good = new String(new char[0]); // DLS found
    String bad = new String(new char[0]); // DLS NOT found
    String good2 = new String(new char[0]); // DLS found
    String bad2 = new String(new char[0]); // DLS NOT found

    // Mutated code
    String x = new String(new char[0]); // Renamed 'good' to 'x'
    String y = new String(new char[0]); // Renamed 'bad' to 'y'
    String z = new String(new char[0]); // Renamed 'good2' to 'z'
    String w = new String(new char[0]); // Renamed 'bad2' to 'w'
  }
}