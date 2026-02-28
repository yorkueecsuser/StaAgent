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

    // Added mutant code
    public String showBugMutant(String x) {
        SecurityProtocolBuffer y = new SecurityProtocolBuffer(x);
        
        // Direct access to private field is a security risk
        return y.sensitiveData; // BUG: PrivateSecurityContractProtoAccess
    }

    public static void main(String[] args) {
        ProtocolBufferAccessExample example = new ProtocolBufferAccessExample();
        System.out.println("Accessed Sensitive Data: " + example.showBug("TopSecretData"));
        
        // Using mutant code
        System.out.println("Accessed Sensitive Data (Mutant): " + example.showBugMutant("TopSecretData"));
    }
}