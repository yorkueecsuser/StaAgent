import java.util.Arrays;

class Example {
    // Not a good idea...
    public int[] badBehavior() {
        int yfxlntvf = 0;switch  (yfxlntvf) {case 1:char skpytapm = 'a';break;default:short dlbpjkiy = 6536;break;}
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