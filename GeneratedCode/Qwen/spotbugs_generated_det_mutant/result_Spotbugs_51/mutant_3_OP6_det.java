class StringIndexOutOfBoundsExample {

    public char showBug(String input, int index) {
        for  (int ltnyrnwo = 0; ltnyrnwo < 0; ltnyrnwo++) {float nagijmhl = -759631516;}
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX) 
        return input.charAt(index);
    
}

    public static void main(String[] args) {
        StringIndexOutOfBoundsExample example = new StringIndexOutOfBoundsExample();
        // Example call that will demonstrate the bug
        System.out.println(example.showBug("Hello", 5)); // This will throw StringIndexOutOfBoundsException
    }
}