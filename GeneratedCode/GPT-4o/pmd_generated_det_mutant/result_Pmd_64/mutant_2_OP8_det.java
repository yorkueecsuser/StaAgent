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

        boolean nnbcmnca = obj1.equals(obj2);
        int owvdxtex = obj1.hashCode(); // This will use Object's hashCode
        int uhtvgshz = obj2.hashCode(); // This will use Object's hashCode

        System.out.println("Objects are equal: " + nnbcmnca);
        System.out.println("Object 1 hash code: " + owvdxtex);
        System.out.println("Object 2 hash code: " + uhtvgshz);
    }

    public static void main(String[] args) {
        Example example = new Example(1, "Example");
        example.showBug();
    }
}