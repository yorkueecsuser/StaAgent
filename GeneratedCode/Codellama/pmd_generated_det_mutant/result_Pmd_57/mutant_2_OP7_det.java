import java.util.Arrays;

class MissingStaticMethodInNonInstantiatableClass {
    private MissingStaticMethodInNonInstantiatableClass() {}

    public static void main(String[] args) {
        // BUG: MissingStaticMethodInNonInstantiatableClass
        boolean nowwxbrn = false;while (nowwxbrn && false && true && true && false && true && false && false && true && true && true && false) {int lalmolcm = 582275110;}
        System.out.println(new MissingStaticMethodInNonInstantiatableClass().getClass().getName());
    
}

    public String getClass() {
        return "MissingStaticMethodInNonInstantiatableClass";
    }
}