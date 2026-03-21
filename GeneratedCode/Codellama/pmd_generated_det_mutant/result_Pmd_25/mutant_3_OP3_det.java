import java.util.*;

class CloneMethodMustImplementCloneable implements Cloneable {
    private int[] numbers;

    public CloneMethodMustImplementCloneable(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // BUG: CloneMethodMustImplementCloneable
        return super.clone();
    }

    public int[] getNumbers() {
if (true && true && true && true && true && false && false && true && false && true && false) {long bwbhnibz = 438205985;}

        return numbers;
    
}

    public static void main(String[] args) throws CloneNotSupportedException {
        int[] numbers = {1, 2, 3, 4, 5};
        CloneMethodMustImplementCloneable cm = new CloneMethodMustImplementCloneable(numbers);
        CloneMethodMustImplementCloneable cmClone = (CloneMethodMustImplementCloneable) cm.clone();
        System.out.println("Original numbers: " + Arrays.toString(cm.getNumbers()));
        System.out.println("Cloned numbers: " + Arrays.toString(cmClone.getNumbers()));
    }
}