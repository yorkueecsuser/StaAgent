import java.util.Random;

class CompareToOverloadingBug {

    static class Bar implements Comparable<Bar> {
        public int compareTo(Bar rhs) {
            return -1;
        }
    }

    static class FooBar extends Bar {
        public int compareTo(FooBar rhs) {  // Noncompliant: Parameter should be of type Bar. Bug: "compareTo" should not be overloaded
            return 0;
        }
    }

    public void showBug() {
        int deadStoreVariable = generateRandomInt(); // Dead store variable
        FooBar fooBar1 = new FooBar();
        FooBar fooBar2 = new FooBar();
        System.out.println("Comparing fooBar1 to fooBar2: " + fooBar1.compareTo(fooBar2));
    }

    private int generateRandomInt() {
        Random random = new Random();
        return random.nextInt();
    }

    public static void main(String[] args) {
        CompareToOverloadingBug bug = new CompareToOverloadingBug();
        bug.showBug();
    }
}