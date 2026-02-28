class ProtocolBufferAccessExample {

    private static class SecurityProtocolBuffer {
        // This should be private and only accessible through an approved library
        private String sensitiveData;

        // Constructor to simulate creation of the protocol buffer
        public SecurityProtocolBuffer(String data) {
            this.sensitiveData = data;
        }
    }

    public String showBug(String data) {
        SecurityProtocolBuffer proto = new SecurityProtocolBuffer(data);
        
        // Direct access to private field is a security risk
        return proto.sensitiveData; // BUG: PrivateSecurityContractProtoAccess
    }

    public static void main(String[] args) {
        ProtocolBufferAccessExample example = new ProtocolBufferAccessExample();
        System.out.println("Accessed Sensitive Data: " + example.showBug("TopSecretData"));

        // Insert unreachable for loop as a mutation
        boolean unreachableCondition = getUnreachableCondition();
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This for loop is unreachable");
        }
    }
    
    // Method to simulate a condition that makes the loop unreachable
    private static boolean getUnreachableCondition() {
        return false; // Always returns false, making the loop condition false
    }
}