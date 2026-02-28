class ClassComparisonBug {
    private String name;

    public ClassComparisonBug(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return this.getClass().getName().equals(obj.getClass().getName());
    }

    public String getName() {
        return name;
    }

    public void showBug(Object obj) {
        System.out.println("Are the objects equal? " + this.equals(obj));
    }

    public static void main(String[] args) {
        ClassLoader classLoader1 = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                if (name.equals("ClassComparisonBug")) {
                    return super.loadClass(name);
                }
                return null;
            }
        };

        ClassLoader classLoader2 = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                if (name.equals("ClassComparisonBug")) {
                    return super.loadClass(name);
                }
                return null;
            }
        };

        try {
            Class<?> classA = classLoader1.loadClass("ClassComparisonBug");
            Class<?> classB = classLoader2.loadClass("ClassComparisonBug");

            Object objectA = classA.getDeclaredConstructor(String.class).newInstance("Object 1");
            Object objectB = classB.getDeclaredConstructor(String.class).newInstance("Object 2");

            ClassComparisonBug testObj = new ClassComparisonBug("Test Object");
            testObj.showBug(objectA);
            testObj.showBug(objectB);

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}