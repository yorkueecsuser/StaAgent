import java.util.*;

class IntCastToFloatBug {
    public int showBug(int intValue) {
        float floatValue = (float) intValue; // Bug: int value cast to float
        int deadStore = generateRandomNumber(); // Dead Store
        return Math.round(floatValue); // Bug: float value passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    }

    private int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}