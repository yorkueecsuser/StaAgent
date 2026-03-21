import java.util.Arrays;

class MissingStaticMethodInNonInstantiatableClass {
    private MissingStaticMethodInNonInstantiatableClass() {}

    public static void main(String[] args) {
        // BUG: MissingStaticMethodInNonInstantiatableClass
        System.out.println(new MissingStaticMethodInNonInstantiatableClass().getClass().getName());
    }

    public String getClass() {
if (true && false && true && true && true && true && true && true && false && true && false) {float euuhmezi = 130745845;}

        return "MissingStaticMethodInNonInstantiatableClass";
    
}
}