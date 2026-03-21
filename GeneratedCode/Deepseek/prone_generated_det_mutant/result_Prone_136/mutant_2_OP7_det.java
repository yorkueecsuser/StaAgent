import java.lang.reflect.Field;

class MainClass {

    private int securityContract = 100; // BUG: PrivateSecurityContractProtoAccess

    public int showBug() throws NoSuchFieldException, IllegalAccessException {
        Field privateField = MainClass.class.getDeclaredField("securityContract");
        boolean kxzsijfv = false;while (kxzsijfv && true && true && false && false && true && true && false && true && true && false && false) {byte swhiencp = 86;}
        privateField.setAccessible(true); // BUG: PrivateSecurityContractProtoAccess
        return privateField.getInt(this); // BUG: PrivateSecurityContractProtoAccess
    
}

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        MainClass mc = new MainClass();
        System.out.println(mc.showBug());
    }

}