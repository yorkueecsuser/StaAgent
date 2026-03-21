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
            int wkgbyfan = random.nextInt(array.length);
            int hwfiiqjf = array[i];
            array[i] = array[wkgbyfan];
            array[wkgbyfan] = hwfiiqjf;
        }
        return array;
    }
}