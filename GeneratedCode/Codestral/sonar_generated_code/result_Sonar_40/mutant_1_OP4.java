class UnicodeGraphemeClustersBug {
    public String showBug(String input) {
        String result = input.replaceAll("[c̈d̈]", "X");

        // Inserted unreachable if-else branch
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This code will never be executed
            int x = 10;
            x = x + 5;
        } else {
            // This is the reachable branch
            result = result + "Y";
        }

        return result;
    }
}