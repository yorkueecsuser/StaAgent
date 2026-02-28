class CompareToExample {

    static class Bar implements Comparable<Bar> {
        public int compareTo(Bar rhs) {
            return -1;
        }
    }

    static class FooBar extends Bar {
        public int compareTo(FooBar rhs) {  // BUG: "compareTo" should not be overloaded
            return 0;
        }
    }

    public void showBug() {
        Bar bar1 = new Bar();
        Bar bar2 = new Bar();
        FooBar fooBar1 = new FooBar();
        FooBar fooBar2 = new FooBar();

        // Correct usage
        int result1 = bar1.compareTo(bar2);

        // Incorrect usage due to overloading
        int result2 = fooBar1.compareTo(fooBar2);

        System.out.println("Result1: " + result1);
        System.out.println("Result2: " + result2);
    }

    public static void main(String[] args) {
        new CompareToExample().showBug();
    }
}