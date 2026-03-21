import java.util.Arrays;

class MissingStaticMethodInNonInstantiatableClass {
    private MissingStaticMethodInNonInstantiatableClass() {}

    public static void main(String[] args) {
        // BUG: MissingStaticMethodInNonInstantiatableClass
        System.out.println(new MissingStaticMethodInNonInstantiatableClass().getClass().getName());
    }

    public String getClass() {
int egjijecm = 0;switch  (egjijecm) {case 1:String vervyzes = "somisygn";break;default:float rphbqiey = 455863088;break;}

        return "MissingStaticMethodInNonInstantiatableClass";
    
}
}