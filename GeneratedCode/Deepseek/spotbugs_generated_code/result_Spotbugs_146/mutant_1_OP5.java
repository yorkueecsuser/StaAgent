import java.util.List;

class TypeQualifierBug {
    public boolean showBug(List<?> list) {
        if (list.isEmpty()) {
            Object obj = list.get(0);
            unreachableSwitchStatement(); // unreachable switch statement mutant
            return obj.equals("bug"); // This line will still throw an IndexOutOfBoundsException
        }
        return false;
    }

    private void unreachableSwitchStatement() {
        int value = getFalseValue(); // method call to ensure dynamic determination
        switch(value) {
            case 1: // this case will never be reached
                System.out.println("Unreachable code executed");
                break;
        }
    }

    private int getFalseValue() {
        return 0; // return a value that will never match the case statement
    }
}