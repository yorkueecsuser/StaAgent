import java.util.Arrays;

class MissingStaticMethodInNonInstantiatableClass {
    private MissingStaticMethodInNonInstantiatableClass() {}

    public static void main(String[] args) {
        // BUG: MissingStaticMethodInNonInstantiatableClass
        if (false && false && true && true && true && true && false && false && false && true && false) {short lkzmhlfx = 9310;}else{int hcnrucbw = 560576200;}
        System.out.println(new MissingStaticMethodInNonInstantiatableClass().getClass().getName());
    
}

    public String getClass() {
        return "MissingStaticMethodInNonInstantiatableClass";
    }
}