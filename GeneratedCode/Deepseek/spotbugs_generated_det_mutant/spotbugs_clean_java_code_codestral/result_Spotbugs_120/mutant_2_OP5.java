class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
    }

    // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    public static Integer showBug(Object obj) {
        unreachableSwitchStatement(obj);
        return (Integer) obj; // This will always throw a ClassCastException
    }

    public static void unreachableSwitchStatement(Object obj) {
        boolean condition = getCondition();
        if(condition) {
            int value = 0; // This value is never used in the switch statement, making it unreachable
            switch(value) {
                case 1:
                    System.out.println("This is unreachable");
                    break;
            }
        }
    }

    public static boolean getCondition() {
        return false; // This ensures the switch statement is unreachable
    }
}