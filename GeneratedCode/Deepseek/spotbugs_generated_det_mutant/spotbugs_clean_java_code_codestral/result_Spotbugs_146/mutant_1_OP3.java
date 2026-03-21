import java.util.List;

class TypeQualifierBug {
    public boolean showBug(List<?> list) {
        if (list.isEmpty()) {
            Object obj = list.get(0);
            return obj.equals("bug");
        }

        // Mutant code
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This block of code is unreachable and will never execute
            System.out.println("This code is unreachable.");
        }

        return false;
    }
}