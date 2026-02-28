import java.lang.reflect.Field;

class MainClass {

    private int securityContract = 100; // BUG: PrivateSecurityContractProtoAccess

    public int showBug() throws NoSuchFieldException, IllegalAccessException {
        Field privateField = MainClass.class.getDeclaredField("securityContract");
        privateField.setAccessible(true); // BUG: PrivateSecurityContractProtoAccess
        boolean shouldNotRun = getCondition(); // Added statement to avoid unreachable statement error.
        if (!shouldNotRun) { // Added unreachable if statement.
            System.out.println("This code will not run");
        }
        return privateField.getInt(this); // BUG: PrivateSecurityContractProtoAccess
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        MainClass mc = new MainClass();
        System.out.println(mc.showBug());
    }

    public boolean getCondition() {
        return false; // Dummy method to avoid unreachable statement error.
    }

}