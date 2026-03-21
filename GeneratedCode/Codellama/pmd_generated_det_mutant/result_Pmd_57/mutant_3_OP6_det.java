import java.util.Arrays;

class MissingStaticMethodInNonInstantiatableClass {
    private MissingStaticMethodInNonInstantiatableClass() {}

    public static void main(String[] args) {
        // BUG: MissingStaticMethodInNonInstantiatableClass
        System.out.println(new MissingStaticMethodInNonInstantiatableClass().getClass().getName());
    }

    public String getClass() {
for  (int ckozygas = 0; ckozygas < 0; ckozygas++) {boolean epzwrmeq = true;}

        return "MissingStaticMethodInNonInstantiatableClass";
    
}
}