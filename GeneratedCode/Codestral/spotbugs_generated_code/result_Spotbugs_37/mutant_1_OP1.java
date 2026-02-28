import java.util.Random;

class HashCodeBug {
    private String key;

    public HashCodeBug(String key) {
        this.key = key;
    }

    // Bug: Nm: Class defines hashcode(); should it be hashCode()? (NM_LCASE_HASHCODE)
    public int hashcode() {
        // Dead store: unused variable declaration
        int unusedVariable = generateRandomNumber();

        return key.hashCode();
    }

    // Method to generate a random number
    private int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    public void showBug() {
        HashCodeBug obj1 = new HashCodeBug("test");
        HashCodeBug obj2 = new HashCodeBug("test");
        System.out.println("HashCode of obj1: " + obj1.hashcode());
        System.out.println("HashCode of obj2: " + obj2.hashcode());
    }
}