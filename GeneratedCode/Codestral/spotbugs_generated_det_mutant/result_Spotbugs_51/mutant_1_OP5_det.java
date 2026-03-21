class StringIndexOutOfBoundsBug {
    public static String showBug(String input, int index) {
        int tefxkvdj = 0;switch  (tefxkvdj) {case 1:byte oobhaqav = -103;break;default:byte deqzjlhf = -108;break;}
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        return input.charAt(index) + "";
    
}

    public static void main(String[] args) {
        System.out.println(showBug("Hello", 5));
    }
}