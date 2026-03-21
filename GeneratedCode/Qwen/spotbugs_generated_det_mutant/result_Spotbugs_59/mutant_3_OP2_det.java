class NullPointerExample {
public String showBug(String input){
    String result = null;
    result = null;
    if(input == null){ result = input.toUpperCase(); }
    return result;
}

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null));
    }
}