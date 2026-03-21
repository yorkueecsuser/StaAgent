import java.util.Arrays;

class MissingStaticMethodInNonInstantiatableClass {
    private MissingStaticMethodInNonInstantiatableClass() {}

    public static void main(String[] args) {
        // BUG: MissingStaticMethodInNonInstantiatableClass
        System.out.println(new MissingStaticMethodInNonInstantiatableClass().getClass().getName());
    }

    public String getClass() {
boolean xtaralib = false;while (xtaralib && true && true && true && true && true && true && false && true && true && true && false) {short ksbltrsn = -2500;}

        return "MissingStaticMethodInNonInstantiatableClass";
    
}
}