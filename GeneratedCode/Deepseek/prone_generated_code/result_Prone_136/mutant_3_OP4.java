import java.lang.reflect.Field;

class MainClass {

    private int securityContract = 100; // BUG: PrivateSecurityContractProtoAccess

    public int showBug() throws NoSuchFieldException, IllegalAccessException {
        Field privateField = MainClass.class.getDeclaredField("securityContract");
        privateField.setAccessible(true); // BUG: PrivateSecurityContractProtoAccess
        return privateField.getInt(this); // BUG: PrivateSecurityContractProtoAccess
    }

    public boolean getCondition() {
        return false;
    }

    public void addUnreachableIfElse() throws NoSuchFieldException, IllegalAccessException {
        if (getCondition()) {
            System.out.println("This branch will never be executed");
        } else {
            Field privateField = MainClass.class.getDeclaredField("securityContract");
            privateField.setAccessible(true); 
            System.out.println(privateField.getInt(this));
        }
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        MainClass mc = new MainClass();
        System.out.println(mc.showBug());
        mc.addUnreachableIfElse();
    }
}