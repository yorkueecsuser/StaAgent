import com.facebook.infer.annotation.Expensive;

class Main {

    @Expensive
    public int foo(int x, int y) {
        return x + y;
    }

    public void invariant_hoist(int size) {
        int x = 10;
        int y = 5;
        if (size <= 0) {
            return;
        }
        do {
            foo(x, y); // Mutant: INVARIANT_CALL
            size--;
        } while (size > 0);
    }

    public int showBug(int size) {
        invariant_hoist(size);
        return foo(10, 5);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug(10);
    }
}