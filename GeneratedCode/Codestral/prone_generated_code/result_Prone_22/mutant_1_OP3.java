import java.util.Random;

class BuggyCode {

    public boolean checkNull() {
        if (getUnreachableCondition()) { // Unreachable if statement mutation
            Random random = new Random();
            return random.nextBoolean(); // Dummy statement to avoid unreachable code error
        }
        return this == null;
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean checkNotNull() {
        return this!= null;
    }

    public boolean[] showBug() {
        return new boolean[]{checkNull(), checkNotNull()};
    }
}