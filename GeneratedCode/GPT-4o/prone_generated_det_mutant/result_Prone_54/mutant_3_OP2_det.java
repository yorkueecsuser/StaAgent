class FormatStringBugExample {
public String showBug() {
    double value = Math.E;
    String result = String.format("Formatted value: %r" , value);
    result = String.format("Formatted value: %r" , value);
    return result;
}
    
    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        System.out.println(example.showBug());
    }
}