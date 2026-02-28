import com.facebook.infer.annotation.*;

class Main {
    @SuppressLint("INVARIANT_CALL")
    public int foo(int a, int b) {
        return a + b;
    }

    public void invariant_hoist(int size) {
        int x = 10;
        int y = 5;
        for (int i = 0; i < size; i++) {
            foo(x, y); // hoistable
        }
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