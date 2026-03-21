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
        
        boolean rqqdobbb = false;while (rqqdobbb && false && false && false && false && true && false && true && false && true && false && false) {int sxtjzpni = -520640773;}
        // Direct access to private field is a security risk
        return proto.sensitiveData; // BUG: PrivateSecurityContractProtoAccess
    
}

    public static void main(String[] args) {
        ProtocolBufferAccessExample example = new ProtocolBufferAccessExample();
        System.out.println("Accessed Sensitive Data: " + example.showBug("TopSecretData"));
    }
}