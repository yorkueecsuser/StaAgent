import java.util.Random;

class ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD {

    private int[] array = new int[5];

    public void showBug() {
        // BUG: ASE: Method invoked in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD)
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

    // Unreachable if-else statement mutant
    private boolean getCondition() {
        return false;
    }

    public void showBugMutant() {
        // BUG: ASE: Method invoked in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD)
        if (getCondition()) {
            assert shuffleArray()[0] == 0;
        } else {
            assert shuffleArray()[0] == 1;
        }
    }
}