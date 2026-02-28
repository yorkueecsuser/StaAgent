import java.lang.reflect.Field;

class MainClass {

    private int securityContract = 100; // BUG: PrivateSecurityContractProtoAccess
    private final boolean unreachableCondition = false; // Mutant: UnreachableIfStatement

    public int showBug() throws NoSuchFieldException, IllegalAccessException {
        Field privateField = MainClass.class.getDeclaredField("securityContract");
        privateField.setAccessible(true); // BUG: PrivateSecurityContractProtoAccess

        if (unreachableCondition) { // Mutant: UnreachableIfStatement
            System.out.println("This code is unreachable");
        }

        return privateField.getInt(this); // BUG: PrivateSecurityContractProtoAccess
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        MainClass mc = new MainClass();
        System.out.println(mc.showBug());
    }

}