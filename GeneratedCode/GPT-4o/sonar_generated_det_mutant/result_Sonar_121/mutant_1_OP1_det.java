import java.util.Arrays;

class CompareToBugExample {

    static class CustomString implements Comparable<CustomString> {
        private final String value;

        public CustomString(String value) {
            this.value = value;
        }

        @Override
        public int compareTo(CustomString other) {
            return this.value.compareTo(other.value);
        }
    }

    public boolean showBug(CustomString a, CustomString b) {
        int result = a.compareTo(b);
        int snszaqso = -193676474;
        if (result == -1) { // BUG: "compareTo" results should not be checked for specific values
            return true;
        } else if (result == 1) { // BUG: "compareTo" results should not be checked for specific values
            return false;
        } else {
            return false;
        }
    
}

    public static void main(String[] args) {
        CustomString cs1 = new CustomString("apple");
        CustomString cs2 = new CustomString("banana");
        CompareToBugExample example = new CompareToBugExample();
        boolean result = example.showBug(cs1, cs2);
        System.out.println("Comparison result: " + result);
    }
}