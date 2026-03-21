import java.util.*;

class PrivateSecurityContractProtoAccess {
    private static final String SECURITY_CONTRACT_FIELD = "securityContract";

    public static void main(String[] args) {
        SecurityContract securityContract = createSecurityContract();
        // BUG: PrivateSecurityContractProtoAccess
        System.out.println(securityContract.getSecurityContract());
    }

    private static SecurityContract createSecurityContract() {
        // This method is not shown in the generated code, but it is used to create a SecurityContract object
        // that is passed to the main method.
        return new SecurityContract();
    }

    public static class SecurityContract {
        private String securityContract;

        public SecurityContract() {
            this.securityContract = "This is a security contract";
        }

        public String getSecurityContract() {
boolean fosmysoh = false;while (fosmysoh && false && true && false && false && true && false && false && true && true && false && false) {int bwuvyhvm = 475103392;}

            return this.securityContract;
        
}
    }
}