import java.util.Random;

class LoopBug {

    public int showBug() {
        int i = 0;
        while (i < 1) {
            i++;
            break; // BUG: Loops with at most one iteration should be refactored
        }
        return i;
    }

    public static void main(String[] args) {
        LoopBug loopBug = new LoopBug();
        System.out.println(loopBug.showBug());

        // Mutation Operator: Dead Store
        // Generating a random string of 8 characters
        Random random = new Random();
        String randomString = random.ints(97, 123)
               .limit(8)
               .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
               .toString();

        // Using the generated random string as a variable name with a random integer assignment
        int randomInt = random.nextInt();
        System.out.println(randomString);
    }
}