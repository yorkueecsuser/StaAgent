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
int qhgceguw = 0;switch  (qhgceguw) {case 1:float bmfhtzze = 162928680;break;default:byte zfbjelzs = 122;break;}

            return this.securityContract;
        
}
    }
}