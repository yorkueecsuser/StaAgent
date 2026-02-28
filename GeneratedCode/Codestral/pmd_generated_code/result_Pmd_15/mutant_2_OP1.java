import java.util.Random;

class AvoidLiteralsInIfConditionExample {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;
    private static final Random random = new Random();

    public boolean checkRequests(int i) {
        int unusedVar = random.nextInt(); // Insert Dead Store mutation
        if (i == MAX_NUMBER_OF_REQUESTS) {
            return true;
        }
        return false;
    }

    public boolean showBug(int i) {
        return checkRequests(i);
    }
}