import java.lang.reflect.Field;

class MainClass {
    private int securityContract = 100;

    public int showBug() throws NoSuchFieldException, IllegalAccessException {
        Field privateField = MainClass.class.getDeclaredField("securityContract");
        privateField.setAccessible(true);

        switch (getCondition()) { // Unreachable switch statement
            case 0:
                break;
        }

        return privateField.getInt(this);
    }

    private boolean getCondition() {
        return false; // this ensures that the switch statement is unreachable
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        MainClass mc = new MainClass();
        System.out.println(mc.showBug());
    }
}