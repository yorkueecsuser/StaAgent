class StringIndexOutOfBoundsExample {
public String showBug(String input){
    char result = input.charAt(5);
    result = input.charAt(5);
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