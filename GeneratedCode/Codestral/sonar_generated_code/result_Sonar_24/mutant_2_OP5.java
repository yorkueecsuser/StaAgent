record Person(String[] names, int age) { }

class BugDemo {
    public static boolean showBug(Person p1, Person p2) {
        // Adding the unreachable switch statement
        int value = getValue();
        switch(value) {
            case 1:
                System.out.println("This line will never be executed");
                break;
        }

        return p1.equals(p2);
    }

    // Additional method to ensure the switch statement is unreachable
    private static int getValue() {
        return 0; // This value will never match case 1 in the switch statement
    }

    public static void main(String[] args) {
        String[] names1 = {"John", "Doe"};
        String[] names2 = {"John", "Doe"};
        Person p1 = new Person(names1, 30);
        Person p2 = new Person(names2, 30);

        System.out.println(showBug(p1, p2)); // Expected: true, Actual: false
    }
}