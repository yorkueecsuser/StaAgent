class NullPointerExample {
public String showBug(String input){
    String result = null;
    result = null;
    try { if(input.equals("throw")) { throw new IllegalArgumentException("Simulated exception"); } result = input.toUpperCase(); } catch(IllegalArgumentException e){ System.out.println("Exception caught: " + e.getMessage()); }
    return result.toLowerCase();
}

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug("throw")); // This will cause a NullPointerException
    }
}