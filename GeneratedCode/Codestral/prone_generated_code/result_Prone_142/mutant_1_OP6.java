import java.lang.Math;

class RandomCastBug {

    private boolean getCondition() {
        return false;
    }

    public int showBug() {
        double randomNumber = Math.random();
        int castedNumber = (int) randomNumber;

        // Unreachable for loop mutant
        for (int i = 0; getCondition(); i++) {
            System.out.println("This line should not be executed.");
        }

        return castedNumber;
    }

    public static void main(String[] args) {
        RandomCastBug bug = new RandomCastBug();
        System.out.println(bug.showBug());
    }
}