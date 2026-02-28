import java.lang.reflect.Field;

class MainClass {

    private int securityContract = 100; 

    public int showBug() throws NoSuchFieldException, IllegalAccessException {
        Field privateField = MainClass.class.getDeclaredField("securityContract");
        privateField.setAccessible(true); // Duplicated Line
        privateField.setAccessible(true); // Added Mutant
        return privateField.getInt(this); 
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        MainClass mc = new MainClass();
        System.out.println(mc.showBug());
    }

}