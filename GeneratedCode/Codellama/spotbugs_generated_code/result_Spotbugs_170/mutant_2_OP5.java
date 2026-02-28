import java.util.Random;

class ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD {

    private int[] array = new int[5];

    public void showBug() {
        // BUG: ASE: Method invoked in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD)
        assert shuffleArray()[0] == 0;
    }

    private int[] shuffleArray() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomIndex = random.nextInt(array.length);
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
        return array;
    }

    // Unreachable switch statement mutation
    void unreachableSwitch() {
        boolean condition = getCondition();
        switch(condition) {
            case true: {
                System.out.println("Unreachable switch statement");
                break;
            }
            case false: {
                System.out.println("Unreachable switch statement");
                break;
            }
        }
    }

    // Get condition method
    private boolean getCondition() {
        return false;
    }
}