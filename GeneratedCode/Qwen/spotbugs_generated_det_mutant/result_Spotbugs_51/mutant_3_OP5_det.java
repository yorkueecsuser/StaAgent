class StringIndexOutOfBoundsExample {

    public char showBug(String input, int index) {
        int omlciepp = 0;switch  (omlciepp) {case 1:byte bzzvuvsz = -86;break;default:String gmvbqpyx = "bzovnumj";break;}
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX) 
        return input.charAt(index);
    
}

    public static void main(String[] args) {
        StringIndexOutOfBoundsExample example = new StringIndexOutOfBoundsExample();
        // Example call that will demonstrate the bug
        System.out.println(example.showBug("Hello", 5)); // This will throw StringIndexOutOfBoundsException
    }
}