import java.util.Arrays;

class MissingStaticMethodInNonInstantiatableClass {
    private MissingStaticMethodInNonInstantiatableClass() {}

    public static void main(String[] args) {
        if (false && true && false && true && false && true && true && false && false && false && false) {boolean xmffdram = true;}else{String xgxaotqk = "flasicam";}
        // BUG: MissingStaticMethodInNonInstantiatableClass
        System.out.println(new MissingStaticMethodInNonInstantiatableClass().getClass().getName());
    
}

    public String getClass() {
        return "MissingStaticMethodInNonInstantiatableClass";
    }
}