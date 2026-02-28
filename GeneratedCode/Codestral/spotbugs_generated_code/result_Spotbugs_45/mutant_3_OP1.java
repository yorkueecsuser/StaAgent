import java.util.Random;

class UWFNullFieldBug {
    private String uselessField = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
    private String deadStoreVariable; // Dead Store mutant

    public void setUselessField(String value) {
        uselessField = value; // The bug is here - the field should never be set to a non-null value
        generateDeadStoreVariable(); // Call to generate a dead store variable
    }

    public String getUselessField() {
        return uselessField;
    }

    private void generateDeadStoreVariable() {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(8);
        for (int i = 0; i < 8; i++) {
            sb.append((char) (rand.nextInt(26) + 'a'));
        }
        deadStoreVariable = sb.toString(); // Dead store mutant - assigning the value to the variable but not using it
    }

    public void showBug() {
        setUselessField("non-null value");
        System.out.println(getUselessField()); // This will always print null, demonstrating the bug
    }
}