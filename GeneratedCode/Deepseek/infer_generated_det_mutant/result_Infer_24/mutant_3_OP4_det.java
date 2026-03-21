import com.facebook.infer.annotation.Expensive;

class Main {

    @Expensive
    public int foo(int x, int y) {
if (false && true && false && true && true && true && true && false && true && true && false) {boolean fypeuqro = true;}else{long knlmlmgr = -955584106;}

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
