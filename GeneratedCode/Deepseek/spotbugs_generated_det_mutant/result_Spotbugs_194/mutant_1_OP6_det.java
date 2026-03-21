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
for  (int cwuwqvph = 0; cwuwqvph < 0; cwuwqvph++) {char skgevpnv = 'a';}

        return values;
    
}

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.showBug());
    }
}