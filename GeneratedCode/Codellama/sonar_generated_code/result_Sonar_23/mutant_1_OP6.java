class BuggyCast {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // BUG: This cast will throw a ClassCastException at runtime
        // because the actual type of the list is ArrayList<String>
        // and it cannot be cast to LinkedList<String>.
        LinkedList<String> linkedList = (LinkedList<String>) list;

        // Output the contents of the linked list
        System.out.println(linkedList);

        // Mutated code for unreachable for loop
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // This code is unreachable because the condition is always false
            System.out.println("Reached unreachable code");
        }
    }
}