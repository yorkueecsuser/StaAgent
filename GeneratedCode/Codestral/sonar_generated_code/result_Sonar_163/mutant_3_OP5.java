import java.util.Random;

class StringBuilderBug {
    private Random random = new Random();

    private int getRandomValue() {
        return random.nextInt();
    }

    public String showBug() {
        StringBuilder sb = new StringBuilder('A');
        int value = getRandomValue();
        // Mutant code added: Unreachable switch statement
        switch(value) {
            case 1:
                // This case will never be executed because value is not always 1
                System.out.println("This should never print");
                break;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuilderBug bugInstance = new StringBuilderBug();
        System.out.println(bugInstance.showBug());
    }
}