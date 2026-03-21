import java.util.Arrays;

class MissingStaticMethodInNonInstantiatableClass {
    private MissingStaticMethodInNonInstantiatableClass() {}

    public static void main(String[] args) {
        // BUG: MissingStaticMethodInNonInstantiatableClass
        System.out.println(new MissingStaticMethodInNonInstantiatableClass().getClass().getName());
    }

    public String getClass() {
int tvijggcq = 0;switch  (tvijggcq) {case 1:char kjyqiwzz = 't';break;default:byte scbxvveu = -102;break;}

        return "MissingStaticMethodInNonInstantiatableClass";
    
}
}