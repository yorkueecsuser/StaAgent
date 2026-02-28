import java.lang.Math;

class RandomCastBug {

    private boolean getUnreachableCondition() {
        return false; // always false, making the branch unreachable
    }

    public int showBug() {
        double randomNumber = Math.random();
        int castedNumber = (int) randomNumber;

        if(getUnreachableCondition()) {
            // Unreachable if-else statement mutant
            System.out.println("This code should never be executed!");
            return -1;
        } else {
            return castedNumber;
        }
    }

    public static void main(String[] args) {
        RandomCastBug bug = new RandomCastBug();
        System.out.println(bug.showBug());
    }
}