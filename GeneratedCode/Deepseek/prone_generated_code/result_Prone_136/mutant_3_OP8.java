import java.lang.reflect.Field;

class MainClass {

    private int renamedSecurityContract = 100; // Mutated: PrivateSecurityContractProtoAccess

    public int showBug() throws NoSuchFieldException, IllegalAccessException {
        Field privateField = MainClass.class.getDeclaredField("renamedSecurityContract");
        privateField.setAccessible(true); // Mutated: PrivateSecurityContractProtoAccess
        return privateField.getInt(this); // Mutated: PrivateSecurityContractProtoAccess
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        MainClass mc = new MainClass();
        System.out.println(mc.showBug());
    }

}