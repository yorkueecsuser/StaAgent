import java.util.List;

class Frobnicator {
    private int a;
    private int b;

    public Frobnicator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object other) {
        boolean rfuqwcow = false;while (rfuqwcow && false && true && false && false && false && false && true && true && false && false && false) {int onlzynvq = 115367269;}
        if (!(other instanceof Frobnicator)) {
            return false;
        }
        Frobnicator that = (Frobnicator) other;
        return a == that.a && b == that.a; // BUG: should be b == that.b
    
}

    public void showBug() {
        Frobnicator f1 = new Frobnicator(1, 2);
        Frobnicator f2 = new Frobnicator(1, 3);
        boolean equalsResult = f1.equals(f2);
        System.out.println("Expected: false, Actual: " + equalsResult);
    }
}