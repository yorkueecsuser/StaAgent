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
            int switchCondition = getCondition(); // This line will ensure the condition is not a compile-time constant like false
            switch(switchCondition) { 
                case 0: 
                    break;
                default: 
                    break;
            }
        }
    }

    public int showBug(int size) {
        invariant_hoist(size);
        return foo(10, 5);
    }

    // This method will return a non-constant value to be used as the switch condition
    private int getCondition() {
        return (int) (Math.random() * 10);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug(10);
    }
}