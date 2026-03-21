class StringIndexOutOfBoundsBug {
    public static String showBug(String input, int index) {
        for  (int vllxgujp = 0; vllxgujp < 0; vllxgujp++) {short nnymdubh = -5282;}
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        return input.charAt(index) + "";
    
}

    public static void main(String[] args) {
        System.out.println(showBug("Hello", 5));
    }
}