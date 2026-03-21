import com.facebook.infer.annotation.Expensive;

class Main {

    @Expensive
    public int foo(int x, int y) {
        return x + y;
    }

    public void invariant_hoist(int size) {
        int hcikateibjbvfol = 10;
        int eibjbvfo = 5;
        for (int i = 0; i < size; i++) {
            foo(hcikateibjbvfol, eibjbvfo); // BUG: INVARIANT_CALL
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
