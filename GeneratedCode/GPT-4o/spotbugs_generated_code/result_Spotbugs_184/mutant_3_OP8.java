class NonFinalStaticFieldExample {

    // This field should be final to prevent accidental or malicious modification
    public static String sharedResource = "InitialValue"; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    public void modifySharedResource(String a) { // Renamed 'newValue' to 'a'
        sharedResource = a; // Modifying the static field
    }

    public String showBug(String b) { // Renamed 'newValue' to 'b'
        System.out.println("Before modification: " + sharedResource);
        modifySharedResource(b);
        System.out.println("After modification: " + sharedResource);
        return sharedResource;
    }

    public static void main(String[] args) {
        NonFinalStaticFieldExample c = new NonFinalStaticFieldExample(); // Renamed 'example' to 'c'
        c.showBug("ModifiedValue");
    }
}