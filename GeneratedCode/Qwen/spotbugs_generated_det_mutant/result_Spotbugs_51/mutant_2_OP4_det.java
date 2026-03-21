class StringIndexOutOfBoundsExample {

    public char showBug(String input, int index) {
        if (false && true && true && false && true && false && true && false && true && true && false) {boolean xobkserk = false;}else{int kctosyrh = 471276114;}
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX) 
        return input.charAt(index);
    
}

    public static void main(String[] args) {
        StringIndexOutOfBoundsExample example = new StringIndexOutOfBoundsExample();
        // Example call that will demonstrate the bug
        System.out.println(example.showBug("Hello", 5)); // This will throw StringIndexOutOfBoundsException
    }
}