class NullPointerExample {
public String showBug(String input){
    String result = null;
    result = null;
    if(input != null && input.isEmpty()){ result = "Input string is empty"; }
    return result.toUpperCase();
}

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        // This will demonstrate the bug
        System.out.println(example.showBug(null));
    }
}