class StringBuilderBugExample {

    // Method to demonstrate the bug
public String showBug(char c){
    StringBuilder sb = new StringBuilder(c);
    sb = new StringBuilder(c);
    sb.append("Hello");
    return sb.toString();
}

    public static void main(String[] args) {
        StringBuilderBugExample example = new StringBuilderBugExample();
        System.out.println(example.showBug('A')); // Expected to print "AHello", but prints "Hello" with capacity 65
    }
}