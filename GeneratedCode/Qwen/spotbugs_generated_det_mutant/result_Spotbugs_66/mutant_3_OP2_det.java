class NullDereferenceExample {
public String showBug(String input){
    String result = null;
    result = null;
    if(input == null){ result = null; }
    return result.toUpperCase();
}

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        try {
            System.out.println(example.showBug(null));
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}