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

        // Mutant Code: Unreachable Switch Statement
        boolean condition = getCondition();
        if (condition) {
            switch (0) {
                case 1: // Unreachable Switch Case
                    System.out.println("This line is unreachable");
                    break;
            }
        }
    }

    // Method to always return false
    private static boolean getCondition() {
        return false;
    }
}