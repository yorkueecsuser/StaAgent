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

        // Unreachable if statement mutation
        boolean isUnreachable = ProtocolBufferAccessExample.getFalseCondition();
        if (isUnreachable) {
            System.out.println("This is an unreachable branch due to a false condition.");
        }
    }

    // Helper method to provide a condition that is always false
    public static boolean getFalseCondition() {
        return false;
    }
}