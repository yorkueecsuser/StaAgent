record Person(String[] names, int age) { }

class BugDemo {
    public static boolean showBug(Person p1, Person p2) {
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            // This loop is unreachable because the condition is always false.
        }
        return p1.equals(p2);
    }

    public static void main(String[] args) {
        String[] names1 = {"John", "Doe"};
        String[] names2 = {"John", "Doe"};
        Person p1 = new Person(names1, 30);
        Person p2 = new Person(names2, 30);

        System.out.println(showBug(p1, p2));
    }
}