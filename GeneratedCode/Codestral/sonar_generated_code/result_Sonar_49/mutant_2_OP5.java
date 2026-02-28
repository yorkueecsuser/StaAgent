class AssertJBug {
    public String showBug() {
        String actual = "actual";
        String expected = "expected";

        int unreachableValue = getUnreachableValue();  // Added dynamically determined value for switch statement
        switch (unreachableValue) {  // Inserted unreachable switch statement
            case 1:
                System.out.println("This code will never be executed.");
                break;
        }

        return actual.equals(expected)? "No error" : "Description";
    }

    private int getUnreachableValue() {
        // This method returns a value that will never be 1, thus making the switch statement unreachable
        return 0;
    }
}