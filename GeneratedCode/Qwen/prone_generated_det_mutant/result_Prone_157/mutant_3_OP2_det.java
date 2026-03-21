class SubstringExample {
public String showBug(String input){
    String result = input.substring(0);
    result = input.substring(0);
    return result;
}

    public static void main(String[] args) {
        SubstringExample example = new SubstringExample();
        System.out.println(example.showBug("HelloWorld")); // Expected output: HelloWorld
    }
}