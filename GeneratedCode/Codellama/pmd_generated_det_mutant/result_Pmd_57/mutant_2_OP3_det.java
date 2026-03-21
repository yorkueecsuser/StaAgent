import java.util.Arrays;

class MissingStaticMethodInNonInstantiatableClass {
    private MissingStaticMethodInNonInstantiatableClass() {}

    public static void main(String[] args) {
        // BUG: MissingStaticMethodInNonInstantiatableClass
        if (false && false && false && true && true && false && true && false && false && true && false) {double wvqgtzfg = -278074147;}
        System.out.println(new MissingStaticMethodInNonInstantiatableClass().getClass().getName());
    
}

    public String getClass() {
        return "MissingStaticMethodInNonInstantiatableClass";
    }
}