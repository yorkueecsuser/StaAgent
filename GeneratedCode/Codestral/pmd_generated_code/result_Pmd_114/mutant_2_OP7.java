class StringToStringBug {
    private boolean getFalseCondition() {
        return false;
    }

    private String baz(String input) {
        boolean unreachableCondition = getFalseCondition();
        while (unreachableCondition) {
            System.out.println("This loop is unreachable.");
        }
        return input.toString();
    }

    public String showBug(String input) {
        return baz(input);
    }

    public static void main(String[] args) {
        StringToStringBug bug = new StringToStringBug();
        String result = bug.showBug("howdy");
        System.out.println(result);
    }
}