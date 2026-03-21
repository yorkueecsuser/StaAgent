class NullPointerExample {
public String showBug(String input){
    String result = null;
    result = null;
    try { if(input.equals("test")) { throw new IllegalArgumentException("Simulated exception"); } result = input.toUpperCase(); } catch(IllegalArgumentException e){ System.out.println("Caught an exception: " + e.getMessage()); }
    return result.toLowerCase();
}

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        try {
            example.showBug("test");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
}