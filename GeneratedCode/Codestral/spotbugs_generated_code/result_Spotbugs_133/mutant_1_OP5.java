class UselessStringBug {

    private boolean getFalseCondition() {
        return false;
    }

    public String showBug() {
        // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
        String result = new int[] {1, 2, 3}.toString();

        // MUTANT: Unreachable switch statement
        boolean condition = getFalseCondition();
        if(condition) {
            int value = 1;
            switch(value) {
                case 2:
                    System.out.println("Unreachable code");
                    break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}