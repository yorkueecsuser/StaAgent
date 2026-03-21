import java.util.Arrays;

class MissingStaticMethodInNonInstantiatableClass {
    private MissingStaticMethodInNonInstantiatableClass() {}

    public static void main(String[] args) {
        // BUG: MissingStaticMethodInNonInstantiatableClass
        System.out.println(new MissingStaticMethodInNonInstantiatableClass().getClass().getName());
    }

    public String getClass() {
for  (int agoqsrqk = 0; agoqsrqk < 0; agoqsrqk++) {byte qlcwefxd = -38;}

        return "MissingStaticMethodInNonInstantiatableClass";
    
}
}