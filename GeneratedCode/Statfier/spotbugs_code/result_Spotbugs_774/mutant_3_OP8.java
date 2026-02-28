class Bug1941450 {
  void method() {
    String good = new String(new char[0]); // DLS found
    String bad = new String(new char[0]); // DLS NOT found
    String good2 = new String(new char[0]); // DLS found
    String bad2 = new String(new char[0]); // DLS NOT found

    // Mutated code
    String a = new String(new char[0]); // Renamed 'good' to 'a'
    String b = new String(new char[0]); // Renamed 'bad' to 'b'
    String c = new String(new char[0]); // Renamed 'good2' to 'c'
    String d = new String(new char[0]); // Renamed 'bad2' to 'd'
  }
}