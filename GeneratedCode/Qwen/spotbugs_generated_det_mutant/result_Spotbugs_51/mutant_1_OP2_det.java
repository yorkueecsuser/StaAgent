class StringIndexOutOfBoundsExample {

    public char showBug(String input, int index) {
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX) 
        return input.charAt(index);
    }
public static void main(String [] args){
    StringIndexOutOfBoundsExample example = new StringIndexOutOfBoundsExample();
    example = new StringIndexOutOfBoundsExample();
    System.out.println(example.showBug("Hello" , 5));
}
}