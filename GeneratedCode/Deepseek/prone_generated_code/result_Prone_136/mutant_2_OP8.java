import java.lang.reflect.Field;

class MainClass {

    private int securityContract = 100; // BUG: PrivateSecurityContractProtoAccess

    public int showBug() throws NoSuchFieldException, IllegalAccessException {
        Field privateField = MainClass.class.getDeclaredField("securityContract");
        privateField.setAccessible(true); // BUG: PrivateSecurityContractProtoAccess
        return privateField.getInt(this); // BUG: PrivateSecurityContractProtoAccess
    }

    public int renameVariable() throws NoSuchFieldException, IllegalAccessException {
        Field renamedField = MainClass.class.getDeclaredField("securityContract"); // Mutation Operator: Renaming
        renamedField.setAccessible(true); // Mutation Operator: Renaming
        return renamedField.getInt(this); // Mutation Operator: Renaming
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        MainClass mc = new MainClass();
        System.out.println(mc.showBug());
        System.out.println(mc.renameVariable()); // Renamed variable is used here
    }

}