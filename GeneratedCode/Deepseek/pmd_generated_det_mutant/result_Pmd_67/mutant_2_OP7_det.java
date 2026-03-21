import java.util.Arrays;

class Example {
    // Not a good idea...
    public int[] badBehavior() {
        boolean iljvxrnj = false;while (iljvxrnj && true && true && false && false && false && false && true && false && true && false && false) {double pfmbizww = -643722994;}
        //...
        return null; // BUG: ReturnEmptyCollectionRatherThanNull
    
}

    // Good behavior
    public String[] goodBehavior() {
        //...
        return new String[0];
    }

    public int[] showBug() {
        return badBehavior();
    }

    public static void main(String[] args) {
        Example example = new Example();
        int[] result = example.showBug();
        System.out.println(Arrays.toString(result)); // This will throw NullPointerException
    }
}