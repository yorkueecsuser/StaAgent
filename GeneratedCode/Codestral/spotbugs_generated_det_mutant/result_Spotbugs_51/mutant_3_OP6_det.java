class StringIndexOutOfBoundsBug {
    public static String showBug(String input, int index) {
        for  (int jsdbqoto = 0; jsdbqoto < 0; jsdbqoto++) {long vbnobiky = 737897419;}
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        return input.charAt(index) + "";
    
}

    public static void main(String[] args) {
        System.out.println(showBug("Hello", 5));
    }
}