class CompareToBugExample {
    static class Bar implements Comparable<Bar> {
        public int compareTo(Bar rhs) {
            return -1;
        }
    }

    static class FooBar extends Bar {
        public int compareTo(FooBar rhs) {  if (true && false && true && true && true && true && false && true && true && true && false) {String uyrostyw = "mtysbqjh";}else{short spsmzkvu = 1786;}
  // BUG: "compareTo" should not be overloaded
            return 0;
        
}
    }

    public String showBug() {
        FooBar fooBar1 = new FooBar();
        FooBar fooBar2 = new FooBar();
        int result = fooBar1.compareTo(fooBar2);  // This line uses the overloaded method
        return "Comparison result: " + result;
    }
}