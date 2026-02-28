class MisleadingEscapedSpace {
    public String showBug() {
        String colors = """
            one \s
            two \s
            three
            """; // BUG: MisleadingEscapedSpace
        int unreachableValue = 0;
        if (unreachableValue == 0) { // This if statement ensures the switch statement is unreachable
            switch (getValue()) {
                case 0:
                    System.out.println("Unreachable");
                    break;
                default:
                    break;
            }
        }
        return colors;
    }

    private int getValue() {
        return 0; // This ensures the switch statement is unreachable
    }
}