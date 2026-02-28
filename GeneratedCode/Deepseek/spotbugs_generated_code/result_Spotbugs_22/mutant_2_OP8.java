import java.lang.reflect.Constructor;

class ClassComparisonBug {
    private String objectName;

    public ClassComparisonBug(String objectName) {
        this.objectName = objectName;
    }

    // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
    @Override
    public boolean equals(Object obj) {
        return this.getClass().getName().equals(obj.getClass().getName());
    }

    public String getName() {
        return objectName;
    }

    public void showBug(Object testObj) {
        System.out.println("Are the objects equal? " + this.equals(testObj));
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

            Constructor<?> constructor = clazz1.getDeclaredConstructor(String.class);
            Object testObj1 = constructor.newInstance("Object 1");
            Object testObj2 = clazz2.getDeclaredConstructor(String.class).newInstance("Object 2");

            ClassComparisonBug obj = new ClassComparisonBug("Test Object");
            obj.showBug(testObj1); // Should print "Are the objects equal? true", but it will print "Are the objects equal? false"
            obj.showBug(testObj2); // Should print "Are the objects equal? true", but it will print "Are the objects equal? false"

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}