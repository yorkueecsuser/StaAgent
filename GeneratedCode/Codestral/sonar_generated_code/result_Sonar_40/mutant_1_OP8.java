class UnicodeGraphemeClustersBug {
    public String showBug(String input) {
        String t = input.replaceAll("[c̈d̈]", "X");
        String result = t;
        return result;
    }
}