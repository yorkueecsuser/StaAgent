import java.lang.reflect.Field;

class MainClass {

    private int securityContract = 100; // BUG: PrivateSecurityContractProtoAccess

    public int showBug() throws NoSuchFieldException, IllegalAccessException {
        Field privateField = MainClass.class.getDeclaredField("securityContract");
        privateField.setAccessible(true); // BUG: PrivateSecurityContractProtoAccess
        return privateField.getInt(this); // BUG: PrivateSecurityContractProtoAccess
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        MainClass mc = new MainClass();
        System.out.println(mc.showBug());
        // Mutant Code
        boolean mutantCondition = false; // mutated code for Unreachable for loop mutation operator
        if (mutantCondition) {
            System.out.println("Unreachable code");
            // Mutant Code
            for (int i = 0; i < 10; i++) {
                System.out.println("Unreachable code");
            }
        }
    }
}