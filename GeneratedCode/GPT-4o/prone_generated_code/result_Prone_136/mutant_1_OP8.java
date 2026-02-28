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
    }
}

// Mutant Code
class ProtocolBufferAccessExampleMutation {

    private static class SecurityProtocolBuffer {
        // This should be private and only accessible through an approved library
        private String sensitiveData;

        // Constructor to simulate creation of the protocol buffer
        public SecurityProtocolBuffer(String d) { // Variable 'data' renamed to 'd'
            this.sensitiveData = d;
        }
    }

    public String showBug(String d) { // Variable 'data' renamed to 'd'
        SecurityProtocolBuffer proto = new SecurityProtocolBuffer(d);
        
        // Direct access to private field is a security risk
        return proto.sensitiveData; // BUG: PrivateSecurityContractProtoAccess
    }

    public static void main(String[] args) {
        ProtocolBufferAccessExampleMutation exampleMutation = new ProtocolBufferAccessExampleMutation();
        System.out.println("Accessed Sensitive Data: " + exampleMutation.showBug("TopSecretData"));
    }
}