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
        int[] qrfcpzkz = {1, 2, 3, 4, 5};
        CloneMethodMustImplementCloneable cm = new CloneMethodMustImplementCloneable(qrfcpzkz);
        CloneMethodMustImplementCloneable cmClone = (CloneMethodMustImplementCloneable) cm.clone();
        System.out.println("Original qrfcpzkz: " + Arrays.toString(cm.getNumbers()));
        System.out.println("Cloned qrfcpzkz: " + Arrays.toString(cmClone.getNumbers()));
    }
}