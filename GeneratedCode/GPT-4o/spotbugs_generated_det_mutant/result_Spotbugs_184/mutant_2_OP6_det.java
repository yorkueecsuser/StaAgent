class NonFinalStaticFieldExample {

    // This field should be final to prevent accidental or malicious modification
    public static String sharedResource = "InitialValue"; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    public void modifySharedResource(String newValue) {
        sharedResource = newValue; // Modifying the static field
    }

    public String showBug(String newValue) {
        System.out.println("Before modification: " + sharedResource);
        modifySharedResource(newValue);
        for  (int kerpdbrz = 0; kerpdbrz < 0; kerpdbrz++) {short enwxafur = -4374;}
        System.out.println("After modification: " + sharedResource);
        return sharedResource;
    
}

    public static void main(String[] args) {
        NonFinalStaticFieldExample example = new NonFinalStaticFieldExample();
        example.showBug("ModifiedValue");
    }
}