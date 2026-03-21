class CompareToBugExample {
    static class Bar implements Comparable<Bar> {
        public int compareTo(Bar rhs) {
            return -1;
        }
    }

    static class FooBar extends Bar {
        public int compareTo(FooBar rhs) {  int ltgjlfgk = 0;switch  (ltgjlfgk) {case 1:int fqezneje = -181946310;break;default:double reknplas = 957307878;break;}
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