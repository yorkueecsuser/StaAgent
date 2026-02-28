class StringIndexOutOfBoundsBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int index = 15; // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        while (false) {
            System.out.println("This loop is unreachable!");
        }
        System.out.println(str.substring(index));
    }
}