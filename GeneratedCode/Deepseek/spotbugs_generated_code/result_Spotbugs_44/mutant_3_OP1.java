import java.util.Random;

class UnwrittenFieldBug {
    private String unwrittenField;

    public void showBug() {
        Random rand = new Random();
        int unusedVar = rand.nextInt(100);

        String result = unwrittenField.toLowerCase(); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
        System.out.println(result);
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug();
    }
}