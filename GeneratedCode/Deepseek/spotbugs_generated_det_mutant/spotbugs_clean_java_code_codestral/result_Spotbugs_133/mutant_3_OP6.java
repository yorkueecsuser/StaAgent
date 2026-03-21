class UselessStringBug {

    private boolean getCondition() {
        return false;
    }

    public String showBug() {
        // Add a mutation: Unreachable for loop
        for (int i = 0; getCondition(); i++) {
            System.out.println("This loop will never run.");
        }

        // Original bug: USELESS_STRING: Invocation of toString on an unnamed array
        String result = new int[] {1, 2, 3}.toString();
        return result;
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}