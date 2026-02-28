import java.util.Random;

class BuggyCode {
    public Class<?> showBug() {
        Class<?> c = new String().getClass(); // BUG: InstantiationToGetClass
        char unusedVar = generateRandomCharacter(); // Dead Store mutant
        return c;
    }

    private char generateRandomCharacter() {
        Random r = new Random();
        return (char) (r.nextInt(26) + 'a');
    }
}