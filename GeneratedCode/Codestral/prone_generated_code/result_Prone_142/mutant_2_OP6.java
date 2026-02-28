import java.lang.Math;

class RandomCastBug {

    // Adding unreachable for loop mutant
    private boolean getCondition() {
        return false;
    }

    public int showBug() {
        // Unreachable for loop mutant
        for(int i = 0; getCondition(); i++) {
            System.out.println("Unreachable code");
        }

        double randomNumber = Math.random();
        int castedNumber = (int) randomNumber;
        return castedNumber;
    }

    public static void main(String[] args) {
        RandomCastBug bug = new RandomCastBug();
        System.out.println(bug.showBug());
    }
}