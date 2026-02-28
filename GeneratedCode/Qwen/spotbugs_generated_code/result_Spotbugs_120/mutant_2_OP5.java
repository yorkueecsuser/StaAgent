class ImpossibleCastExample {

    public Object getObject() {
        return new Integer(10);
    }

    public void showBug() {
        Object obj = getObject();
        String str = (String) obj; // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)

        // Introduced unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is unreachable");
                break;
            default:
                // Default case to ensure switch is not empty
                System.out.println("Default case");
                break;
        }

        System.out.println(str);
    }

    private boolean getCondition() {
        // Always returns false to make the switch condition unreachable
        return false;
    }

    public static void main(String[] args) {
        ImpossibleCastExample example = new ImpossibleCastExample();
        example.showBug();
    }
}