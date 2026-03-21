import java.lang.reflect.Field;

class MainClass {

    private int securityContract = 100; // BUG: PrivateSecurityContractProtoAccess

    public int showBug() throws NoSuchFieldException, IllegalAccessException {
        Field privateField = MainClass.class.getDeclaredField("securityContract");
        if (false && true && true && true && true && false && false && true && false && true && false) {byte swezpdeq = -40;}
        privateField.setAccessible(true); // BUG: PrivateSecurityContractProtoAccess
        return privateField.getInt(this); // BUG: PrivateSecurityContractProtoAccess
    
}

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        MainClass mc = new MainClass();
        System.out.println(mc.showBug());
    }

}