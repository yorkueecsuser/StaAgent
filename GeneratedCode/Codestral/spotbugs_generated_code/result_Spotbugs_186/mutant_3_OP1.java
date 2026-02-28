// Java code demonstrating the bug: MS: Field should be package protected (MS_PKGPROTECT) with Dead Store mutation
import java.util.Random;

class MutableStaticField {
    public static int sharedData = 0; // BUG: MS: Field should be package protected (MS_PKGPROTECT)
    private static int unusedVariable; // Dead Store mutation

    public void modifySharedData(int newData) {
        sharedData = newData;
        unusedVariable = generateRandomInt(); // Using the dead store variable
    }

    public int showBug() {
        return sharedData;
    }

    private static int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    public static void main(String[] args) {
        MutableStaticField obj = new MutableStaticField();
        obj.modifySharedData(100);
        System.out.println("Shared data after modification: " + obj.showBug());
    }
}