class SubstringExample {
public String showBug(String input){
    String result = input.substring(0);
    result = input.substring(0);
    return result;
}
    
    public static void main(String[] args) {
        SubstringExample example = new SubstringExample();
        String original = "Hello, World!";
        String result = example.showBug(original);
        System.out.println("Original: " + original);
        System.out.println("Result from substring(0): " + result);
    }
}