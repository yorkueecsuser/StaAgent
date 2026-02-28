import com.facebook.infer.annotation.*;

class Main {

    @SuppressLint("INVARIANT_CALL")
    public int foo(int x, int y) {
        return x + y;
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

    public void unreachableSwitchMutant(int size) {
        int x = getValue();
        switch (x) {
            case 0:
                System.out.println("This code will never be reached");
                break;
            default:
                break;
        }
    }

    public int getValue() {
        return 0;
    }
}