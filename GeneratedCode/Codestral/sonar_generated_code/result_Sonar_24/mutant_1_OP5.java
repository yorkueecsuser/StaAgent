record Person(String[] names, int age) {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        Person person = (Person) o;
        return Arrays.equals(names, person.names) && age == person.age;
    }
}

class BugDemo {
    public static boolean showBug(Person p1, Person p2) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            int value = 0;
            switch (value) {
                case 1:
                    System.out.println("This line should be unreachable");
                    break;
            }
        }
        return p1.equals(p2);
    }

    private static boolean getCondition() {
        return false;
    }

    private static int getValue() {
        return 0;
    }

    public static void main(String[] args) {
        String[] names1 = {"John", "Doe"};
        String[] names2 = {"John", "Doe"};
        Person p1 = new Person(names1, 30);
        Person p2 = new Person(names2, 30);

        System.out.println(showBug(p1, p2)); // Expected: true, Actual: false
    }
}