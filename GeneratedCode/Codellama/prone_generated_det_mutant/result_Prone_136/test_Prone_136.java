import org.junit.Test;
import static org.junit.Assert.*;

class PrivateSecurityContractProtoAccessTest {
    @Test
    public void testBug() {
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
            return this.securityContract;
        }
    }
}