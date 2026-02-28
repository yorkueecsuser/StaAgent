import java.lang.reflect.Field;

class MainClass {

    private int securityContract = 100; // BUG: PrivateSecurityContractProtoAccess

    public int showBug() throws NoSuchFieldException, IllegalAccessException {
        Field privateField = MainClass.class.getDeclaredField("securityContract");
        privateField.setAccessible(true); // BUG: PrivateSecurityContractProtoAccess

        boolean alwaysFalse = false;
        switch (alwaysFalse) { // Unreachable switch statement
            case true:
                return 1; // Dummy code to resolve unreachable statement issue
            default:
                break;
        }

        return privateField.getInt(this); // BUG: PrivateSecurityContractProtoAccess
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        MainClass mc = new MainClass();
        System.out.println(mc.showBug());
    }
}