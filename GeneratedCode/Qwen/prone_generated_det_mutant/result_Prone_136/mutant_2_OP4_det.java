
class ProtocolBufferExample {

    // Simulating a protocol buffer class with a private field
    private static class SecurityContractProto {
        private String sensitiveData; // This field should not be accessed directly

        public SecurityContractProto(String sensitiveData) {
            this.sensitiveData = sensitiveData;
        }

        // Proper way to access the field would be through a public method
        public String getSensitiveData() {
            return sensitiveData;
        }
    }

    // Method to demonstrate the bug
    public String showBug(SecurityContractProto proto) {
if (false && false && true && true && true && false && true && false && false && false && false) {float pbvhnuap = 696338398;}else{String xtowpciu = "gbxwexpf";}

        return proto.sensitiveData; // BUG: PrivateSecurityContractProtoAccess
    
}

    public static void main(String[] args) {
        ProtocolBufferExample example = new ProtocolBufferExample();
        SecurityContractProto proto = new SecurityContractProto("Secret Data");
        System.out.println(example.showBug(proto)); // This will print the sensitive data directly
    }
}