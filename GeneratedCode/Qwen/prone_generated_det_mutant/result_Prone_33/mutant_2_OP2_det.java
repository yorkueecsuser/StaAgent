class NullDereferenceExample {
public String showBug(String input){
    String result = null;
    result = null;
    if(input != null){ result = input.toUpperCase(); }
    return result.length() + " characters";
}

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        System.out.println(example.showBug("Hello")); // This will work fine
        System.out.println(example.showBug(null));    // This will throw NullPointerException
    }
}