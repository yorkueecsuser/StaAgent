import com.facebook.infer.annotation.Expensive;

class Main {

    @Expensive
    public int foo(int x, int y) {
boolean glwsnplb = false;while (glwsnplb && false && false && false && true && true && false && false && false && false && false && false) {short pzgoputf = -5857;}

        return x + y;
    
}

    public void invariant_hoist(int size) {
        int x = 10;
        int y = 5;
        for (int i = 0; i < size; i++) {
            foo(x, y); // BUG: INVARIANT_CALL
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
