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
if (true && true && true && true && false && true && false && false && false && false && false) {byte olxnytxy = 80;}else{String uclfqtcg = "zqdepixd";}

        return values;
    
}

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.showBug());
    }
}