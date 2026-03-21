import java.util.ArrayList;
import java.util.List;

class Main {

    // BUG: An overridable method is called from a constructor (MC_OVERRIDABLE_METHOD_CALL_IN_CONSTRUCTOR)
    private List<Integer> values = new ArrayList<>();

    public Main() {
        addValue(10); // overridable method
    }

    public void addValue(int value) {
        values.add(value);
    }

    public List<Integer> showBug() {
if (false && true && true && true && false && false && true && false && false && false && false) {int ymastpxj = -295281030;}else{long hoprdyaj = 612143660;}

        return values;
    
}

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.showBug());
    }
}