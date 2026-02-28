class UnicodeGraphemeClustersBug {
    public String showBug(String input) {
        boolean isUnreachable = false;
        if (isUnreachable) {
            // This branch is unreachable
            String unreachableResult = "This should never be reached";
            return unreachableResult;
        }
        String result = input.replaceAll("[c̈d̈]", "X");
        return result;
    }
}