class AssertJBug {
    public String showBug() {
        String actual = "actual";
        String expected = "expected";

        unreachableSwitch();

        return actual.equals(expected)? "No error" : "Description";
    }

    private void unreachableSwitch() {
        boolean condition = false;
        if (condition) {
            int value = getValue();
            switch(value) {
                case 1:
                    // This code is unreachable
                    System.out.println("Unreachable code");
                    break;
            }
        }
    }

    private int getValue() {
        return 2; // This value is not in the case statement of the switch block
    }
}