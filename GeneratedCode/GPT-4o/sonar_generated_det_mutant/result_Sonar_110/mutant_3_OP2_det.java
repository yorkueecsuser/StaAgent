class NullPointerExample {
public String showBug(String input){
    String exampleString = null;
    exampleString = null;
    int length = exampleString.length();
    return "Length of input: " + length;
}
    
    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        try {
            String result = example.showBug(null);
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}