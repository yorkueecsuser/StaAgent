import java.util.Arrays;

class MissingStaticMethodInNonInstantiatableClass {
    private MissingStaticMethodInNonInstantiatableClass() {}

    public static void main(String[] args) {
        // BUG: MissingStaticMethodInNonInstantiatableClass
        System.out.println(new MissingStaticMethodInNonInstantiatableClass().getClass().getName());
    }

    public String getClass() {
long zjeweqde = -329698404;

        return "MissingStaticMethodInNonInstantiatableClass";
    
}
}