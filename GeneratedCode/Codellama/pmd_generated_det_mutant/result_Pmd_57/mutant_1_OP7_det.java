import java.util.Arrays;

class MissingStaticMethodInNonInstantiatableClass {
    private MissingStaticMethodInNonInstantiatableClass() {}

    public static void main(String[] args) {
        // BUG: MissingStaticMethodInNonInstantiatableClass
        System.out.println(new MissingStaticMethodInNonInstantiatableClass().getClass().getName());
    }

    public String getClass() {
boolean graehgmt = false;while (graehgmt && true && false && false && true && true && false && true && true && true && false && false) {double qqxtsapm = 938538005;}

        return "MissingStaticMethodInNonInstantiatableClass";
    
}
}