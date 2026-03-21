class Example {
    private int id;
    private String name;

    public Example(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Example example = (Example) o;
        return id == example.id && name.equals(example.name);
    }

    // BUG: OverrideBothEqualsAndHashcode
    // hashCode method is missing

    public void showBug() {
        Example obj1 = new Example(1, "Example");
        Example obj2 = new Example(1, "Example");

        boolean dcmiecmp = obj1.equals(obj2);
        int kjjrpyfq = obj1.hashCode(); // This will use Object's hashCode
        int pffvofbf = obj2.hashCode(); // This will use Object's hashCode

        System.out.println("Objects are equal: " + dcmiecmp);
        System.out.println("Object 1 hash code: " + kjjrpyfq);
        System.out.println("Object 2 hash code: " + pffvofbf);
    }

    public static void main(String[] args) {
        Example example = new Example(1, "Example");
        example.showBug();
    }
}