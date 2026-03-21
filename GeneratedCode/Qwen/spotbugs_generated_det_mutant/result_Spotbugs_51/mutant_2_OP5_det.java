class StringIndexOutOfBoundsExample {

    public char showBug(String input, int index) {
        int ygfvmuyr = 0;switch  (ygfvmuyr) {case 1:char lgvswkxe = 'x';break;default:int hwpaduvv = 890284486;break;}
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX) 
        return input.charAt(index);
    
}

    public static void main(String[] args) {
        StringIndexOutOfBoundsExample example = new StringIndexOutOfBoundsExample();
        // Example call that will demonstrate the bug
        System.out.println(example.showBug("Hello", 5)); // This will throw StringIndexOutOfBoundsException
    }
}