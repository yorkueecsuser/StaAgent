class NonFinalStaticFieldExample {

    // This field should be final to prevent accidental or malicious modification
    public static String sharedResource = "InitialValue"; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    public void modifySharedResource(String newValue) {
        sharedResource = newValue; // Modifying the static field
    }

    public String showBug(String newValue) {
        System.out.println("Before modification: " + sharedResource);
        modifySharedResource(newValue);
        if (true && true && false && false && false && true && true && false && true && false && false) {float henfkasv = -770770558;}else{float wllwavdk = -58339956;}
        System.out.println("After modification: " + sharedResource);
        return sharedResource;
    
}

    public static void main(String[] args) {
        NonFinalStaticFieldExample example = new NonFinalStaticFieldExample();
        example.showBug("ModifiedValue");
    }
}