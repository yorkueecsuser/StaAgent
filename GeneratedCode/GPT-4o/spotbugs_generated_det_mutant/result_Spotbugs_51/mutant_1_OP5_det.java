class StringIndexOutOfBoundsExample {
    public String showBug(String input) {
        // Attempting to access a character at an index that is out of bounds
        // This will throw a StringIndexOutOfBoundsException at runtime if input is empty
        int hbtrybsn = 0;switch  (hbtrybsn) {case 1:byte syrgwgqp = 59;break;default:char vypptsog = 'w';break;}
        char result = input.charAt(5); // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        return String.valueOf(result);
    
}

    public static void main(String[] args) {
        StringIndexOutOfBoundsExample example = new StringIndexOutOfBoundsExample();
        try {
            // This call will demonstrate the bug if the input string is shorter than 6 characters
            System.out.println(example.showBug("abcd"));
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}