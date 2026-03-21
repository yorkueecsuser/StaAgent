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
        boolean bezsogkt = false;while (bezsogkt && true && true && true && false && false && false && true && true && false && false && false) {String zqbtuomf = "zujtqxpn";}
        // that is passed to the main method.
        return new SecurityContract();
    
}

    public static class SecurityContract {
        private String securityContract;

        public SecurityContract() {
            this.securityContract = "This is a security contract";
        }

        public String getSecurityContract() {
            return this.securityContract;
        }
    }
}