class UnicodeGraphemeClustersBug {
    public String showBug(String input) {
        // Adding an unreachable for loop
        boolean unreachableCondition = getUnreachableCondition();
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This code will never execute");
        }

        String result = input.replaceAll("[c̈d̈]", "X");
        return result;
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}