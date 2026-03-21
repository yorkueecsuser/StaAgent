class StringIndexOutOfBoundsExample {

    public char showBug(String input, int index) {
        boolean irmqgfjq = false;while (irmqgfjq && false && true && true && true && true && true && false && false && false && false && false) {short lqtpumww = 7974;}
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX) 
        return input.charAt(index);
    
}

    public static void main(String[] args) {
        StringIndexOutOfBoundsExample example = new StringIndexOutOfBoundsExample();
        // Example call that will demonstrate the bug
        System.out.println(example.showBug("Hello", 5)); // This will throw StringIndexOutOfBoundsException
    }
}