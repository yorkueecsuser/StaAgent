class StringToStringBug {
    private String baz(String input) {
        // Bug: StringToString
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }
        return input.toString();
    }

    private int getValue() {
        return 0; // Always returns 0 to make the switch case unreachable
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