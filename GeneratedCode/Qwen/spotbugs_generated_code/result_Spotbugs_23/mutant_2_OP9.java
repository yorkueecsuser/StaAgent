class AlwaysTrueEquals {

    private String name;

    public AlwaysTrueEquals(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return true; // BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE) 
    }

    public void showBug() {
        AlwaysTrueEquals obj1 = new AlwaysTrueEquals("Alice");
        AlwaysTrueEquals obj2 = new AlwaysTrueEquals("Bob");

        // Added a meaningless loop for demonstration purposes
        int i = 0;
        while (i < 0) {
            i++;
        }

        // Equivalent do-while loop
        int j = 0;
        do {
            j++;
        } while (j < 0);

        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2));
        System.out.println("obj2.equals(obj1): " + obj2.equals(obj1));
    }

    public static void main(String[] args) {
        AlwaysTrueEquals example = new AlwaysTrueEquals("Example");
        example.showBug();
    }
}