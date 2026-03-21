class RedundantNullCheckExample {
public String showBug(String input){
    int length = input.length();
    length = input.length();
    if(input == null){ return "Input is null"; }
    return "Length of input is: " + length;
}

    public static void main(String[] args) {
        RedundantNullCheckExample example = new RedundantNullCheckExample();
        System.out.println(example.showBug("Hello")); // This will work fine
        System.out.println(example.showBug(null));    // This will throw NPE before reaching the null check
    }
}