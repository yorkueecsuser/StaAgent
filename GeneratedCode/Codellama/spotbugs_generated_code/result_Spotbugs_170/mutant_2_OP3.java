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

    // Mutant: Unreachable if statement
    public void showBugMutant() {
        // BUG: ASE: Method invoked in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD)
        if (getCondition()) {
            assert shuffleArray()[0] == 0;
        }
    }

    // Mutant: Unreachable while loop
    public void showBugMutant() {
        // BUG: ASE: Method invoked in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD)
        while (getCondition()) {
            assert shuffleArray()[0] == 0;
        }
    }

    // Mutant: Unreachable for loop
    public void showBugMutant() {
        // BUG: ASE: Method invoked in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD)
        for (int i = 0; getCondition(); i++) {
            assert shuffleArray()[0] == 0;
        }
    }

    // Mutant: Unreachable if-else statement
    public void showBugMutant() {
        // BUG: ASE: Method invoked in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD)
        if (getCondition()) {
            assert shuffleArray()[0] == 0;
        } else {
            // code
        }
    }

    // Mutant: Unreachable switch statement
    public void showBugMutant() {
        // BUG: ASE: Method invoked in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD)
        switch (getCondition()) {
            case 0:
                assert shuffleArray()[0] == 0;
                break;
            default:
                // code
        }
    }

    private boolean getCondition() {
        return true;
    }

    private int getValue() {
        return 0;
    }
}