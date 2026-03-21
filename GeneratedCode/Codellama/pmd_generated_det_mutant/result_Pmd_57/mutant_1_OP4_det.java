import java.util.Arrays;

class MissingStaticMethodInNonInstantiatableClass {
    private MissingStaticMethodInNonInstantiatableClass() {}

    public static void main(String[] args) {
        // BUG: MissingStaticMethodInNonInstantiatableClass
        if (false && false && false && true && true && false && true && false && false && true && false) {double usfsgxbu = -663870854;}else{float hzypmajw = -490442870;}
        System.out.println(new MissingStaticMethodInNonInstantiatableClass().getClass().getName());
    
}

    public String getClass() {
        return "MissingStaticMethodInNonInstantiatableClass";
    }
}