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

        // Inserted unreachable switch statement mutation
        int unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            case 2:
                System.out.println("Nor will this.");
                break;
            default:
                System.out.println("Default case should never execute.");
                break;
        }
    }

    // Method introduced to ensure the switch statement is unreachable
    private static int getUnreachableCondition() {
        return -1; // Always returns a value that does not match any case
    }
}