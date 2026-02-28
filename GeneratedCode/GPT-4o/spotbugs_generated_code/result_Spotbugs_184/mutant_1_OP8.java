class NonFinalStaticFieldExample {

    // This field should be final to prevent accidental or malicious modification
    public static String sharedResource = "InitialValue"; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    public void modifySharedResource(String b) { // Renamed variable from newValue to b
        sharedResource = b; // Modifying the static field
    }

    public String showBug(String c) { // Renamed variable from newValue to c
        System.out.println("Before modification: " + sharedResource);
        modifySharedResource(c);
        System.out.println("After modification: " + sharedResource);
        return sharedResource;
    }

    public static void main(String[] args) {
        NonFinalStaticFieldExample example = new NonFinalStaticFieldExample();
        example.showBug("ModifiedValue");
    }
}