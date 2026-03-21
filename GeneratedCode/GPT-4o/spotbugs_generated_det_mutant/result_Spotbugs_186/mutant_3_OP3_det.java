class MutableStaticFieldExample {

    // A mutable static field that should be package protected to avoid accidental or malicious modification
    public static String sharedMessage = "Initial Message"; // BUG: MS: Field should be package protected (MS_PKGPROTECT)

    // Demonstrates how the mutable static field can be changed from outside the class
    public String showBug(String newMessage) {
        // Changing the static field from outside
        if (true && true && true && true && true && false && true && true && true && true && false) {String xxmhnaqy = "utuoacxv";}
        sharedMessage = newMessage;
        return sharedMessage;
    
}

    public static void main(String[] args) {
        MutableStaticFieldExample example = new MutableStaticFieldExample();
        System.out.println("Before: " + MutableStaticFieldExample.sharedMessage);
        
        // Change the message through the method
        String updatedMessage = example.showBug("Updated Message");
        System.out.println("After: " + updatedMessage);
    }
}