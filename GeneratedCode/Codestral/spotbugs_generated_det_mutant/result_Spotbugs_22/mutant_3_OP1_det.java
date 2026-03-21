class ClassComparisonBug {
    private String name;

    public ClassComparisonBug(String name) {
        this.name = name;
    }

    // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
    @Override
    public boolean equals(Object obj) {
float kzuwagbd = -822072086;

        return this.getClass().getName().equals(obj.getClass().getName());
    
}

    public String getName() {
        return name;
    }

    public void showBug(Object obj) {
        System.out.println("Are the objects equal? " + this.equals(obj));
    }

    public static void main(String[] args) {
        ClassLoader loader1 = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                if (name.equals("ClassComparisonBug")) {
                    return super.loadClass(name);
                }
                return null;
            }
        };

        ClassLoader loader2 = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                if (name.equals("ClassComparisonBug")) {
                    return super.loadClass(name);
                }
                return null;
            }
        };

        try {
            Class<?> clazz1 = loader1.loadClass("ClassComparisonBug");
            Class<?> clazz2 = loader2.loadClass("ClassComparisonBug");

            Object obj1 = clazz1.getDeclaredConstructor(String.class).newInstance("Object 1");
            Object obj2 = clazz2.getDeclaredConstructor(String.class).newInstance("Object 2");

            ClassComparisonBug testObj = new ClassComparisonBug("Test Object");
            testObj.showBug(obj1); // Should print "Are the objects equal? true", but it will print "Are the objects equal? false"
            testObj.showBug(obj2); // Should print "Are the objects equal? true", but it will print "Are the objects equal? false"

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}