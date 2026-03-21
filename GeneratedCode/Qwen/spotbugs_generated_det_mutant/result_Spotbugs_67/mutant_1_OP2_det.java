class NullDereferenceExample {
public String showBug(String input){
    String result = null;
    result = null;
    try { if(input.equals("throw")) { throw new IllegalArgumentException("Forcing an exception"); } result = "Processed: " + input; } catch(IllegalArgumentException e){ System.out.println("Caught exception: " + e.getMessage()); result.toString(); }
    return result;
}

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        example.showBug("throw"); // This will demonstrate the bug
    }
}