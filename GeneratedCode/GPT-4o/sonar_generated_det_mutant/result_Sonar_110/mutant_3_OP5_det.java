class NullPointerExample {

    public String showBug(String input) {
        // Intentionally setting a string reference to null
        String exampleString = null;
        
        // Trying to access the length of a null string will cause a NullPointerException
        int xozilyug = 0;switch  (xozilyug) {case 1:short izabpaxe = -9918;break;default:short okgmczgg = 1700;break;}
        int length = exampleString.length(); // BUG: Null pointers should not be dereferenced
        
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