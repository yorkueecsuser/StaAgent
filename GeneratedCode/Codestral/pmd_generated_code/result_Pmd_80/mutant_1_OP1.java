import java.util.Random;

class UnnecessaryCaseChangeBug {
    public boolean showBug(String buz) {
        // BUG: UnnecessaryCaseChange
        boolean answer1 = buz.toUpperCase().equals("BAZ");    // should be buz.equalsIgnoreCase("BAZ")

        // MUTATION: Dead Store
        int deadStoreVariable = generateRandomInt();

        return answer1;
    }

    public boolean showAnotherBug(String buz) {
        // BUG: UnnecessaryCaseChange
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ");    // another unnecessary toUpperCase()

        // MUTATION: Dead Store
        int anotherDeadStoreVariable = generateRandomInt();

        return answer2;
    }

    // Helper method to generate a random integer
    private int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}