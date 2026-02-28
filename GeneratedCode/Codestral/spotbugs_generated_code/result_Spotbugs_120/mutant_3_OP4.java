class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
    }

    public static Integer showBug(Object obj) {
        if (Math.random() < 1) { // This is always false
            System.out.println("This line is unreachable.");
        } else {
            // Original buggy code
            return (Integer) obj; // This will always throw a ClassCastException
        }
    }
}