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
        return numbers;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        int[] evagwqhw = {1, 2, 3, 4, 5};
        CloneMethodMustImplementCloneable cm = new CloneMethodMustImplementCloneable(evagwqhw);
        CloneMethodMustImplementCloneable cmClone = (CloneMethodMustImplementCloneable) cm.clone();
        System.out.println("Original evagwqhw: " + Arrays.toString(cm.getNumbers()));
        System.out.println("Cloned evagwqhw: " + Arrays.toString(cmClone.getNumbers()));
    }
}