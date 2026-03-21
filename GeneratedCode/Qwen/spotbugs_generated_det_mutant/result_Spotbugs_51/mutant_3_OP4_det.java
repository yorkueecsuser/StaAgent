class StringIndexOutOfBoundsExample {

    public char showBug(String input, int index) {
        if (true && true && false && true && true && true && true && false && false && false && false) {int ecpzrasv = 798591030;}else{boolean lkxypnsf = true;}
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX) 
        return input.charAt(index);
    
}

    public static void main(String[] args) {
        StringIndexOutOfBoundsExample example = new StringIndexOutOfBoundsExample();
        // Example call that will demonstrate the bug
        System.out.println(example.showBug("Hello", 5)); // This will throw StringIndexOutOfBoundsException
    }
}