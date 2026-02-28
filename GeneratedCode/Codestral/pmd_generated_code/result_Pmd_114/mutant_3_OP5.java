class StringToStringBug {
    private String baz(String input) {
        // BUG: StringToString
        int value = getValue();
        switch (value) {
            case 1:
                // This code is unreachable as the value will never be 1
                break;
        }

        return input.toString();
    }

    private int getValue() {
        // This function always returns 0
        return 0;
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