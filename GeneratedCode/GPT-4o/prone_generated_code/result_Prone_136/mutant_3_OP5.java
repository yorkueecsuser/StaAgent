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
        
        // Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never be reached.");
                break;
            case 2:
                System.out.println("Nor will this.");
                break;
            default:
                System.out.println("Default case - also unreachable.");
                break;
        }
    }

    // This method simulates getting a value that makes the switch statement unreachable
    private static int getUnreachableValue() {
        return 0; // Ensures that none of the cases in the switch statement are matched
    }
}