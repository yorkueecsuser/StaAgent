import java.util.Comparator;

class CompareToBug {
    public static class CustomObject implements Comparable<CustomObject> {
        private int value;

        public CustomObject(int value) {
            this.value = value;
        }

        @Override
        public int compareTo(CustomObject other) {
            return this.value - other.value;
        }
    }

    public static Integer showBug(CustomObject obj1, CustomObject obj2) {
        if (obj1.compareTo(obj2) == -1) { // BUG: "compareTo" results should not be checked for specific values
            return -1;
        } else if (obj1.compareTo(obj2) == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}