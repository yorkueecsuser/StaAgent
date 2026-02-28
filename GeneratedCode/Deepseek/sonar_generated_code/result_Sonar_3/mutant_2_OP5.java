class StringIndexOutOfBoundsBug {
    public String showBug(String input, int beginIndex, int endIndex) {
        try {
            int unreachableCondition = getCondition();
            switch (unreachableCondition) {
                case 1:
                    // unreachable code
                    System.out.println("This code is unreachable");
                    break;
                default:
                    break;
            }
            return input.substring(beginIndex, endIndex); // BUG: "String.indexOf" should be used with correct ranges
        } catch (StringIndexOutOfBoundsException e) {
            return "Error: " + e.getMessage();
        }
    }

    private int getCondition() {
        return 0;
    }
}