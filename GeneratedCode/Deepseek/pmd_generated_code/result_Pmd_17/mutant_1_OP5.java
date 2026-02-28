import java.util.Arrays;

class AvoidMultipleUnaryOperators {
    public int showBug() {
        // BUG: AvoidMultipleUnaryOperators
        int i = - -1;
        return i;
    }

    public void unreachableSwitchStatement() {
        int x = 1;
        switch(x) {
            case 1:
                System.out.println("1");
                break;
            default:
                System.out.println("default");
        }
    }
}