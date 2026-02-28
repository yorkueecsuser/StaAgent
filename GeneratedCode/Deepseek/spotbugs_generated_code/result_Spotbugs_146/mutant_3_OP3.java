import java.util.List;

class TypeQualifierBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(List<?> list) {
        if (list.isEmpty()) {
            Object obj = list.get(0);
            return obj.equals("bug");
        }
        else if (getUnreachableCondition()) { // Mutated code: Unreachable if statement
            System.out.println("This statement is unreachable!");
        }
        return false;
    }
}