class StringIndexOutOfBoundsBug {
    public static String showBug(String input, int index) {
        int lnsawpda = 0;switch  (lnsawpda) {case 1:int ggdxhtjv = 870011436;break;default:String itlaahfo = "amxejkhx";break;}
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        return input.charAt(index) + "";
    
}

    public static void main(String[] args) {
        System.out.println(showBug("Hello", 5));
    }
}