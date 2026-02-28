import java.util.List;

class TypeQualifierBug {
    private boolean getCondition() {
        return false;
    }

    public boolean showBug(List<?> list) {
        if (list.isEmpty()) {
            Object obj = list.get(0); // BUG: TQ: Value that might carry a type qualifier is always used in a way prohibits it from having that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_NEVER_SINK)
            return obj.equals("bug"); // This line will always throw an IndexOutOfBoundsException because of the previous line
        }

        boolean condition = getCondition();
        if (condition) {
            switch (0) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
        }

        return false;
    }
}