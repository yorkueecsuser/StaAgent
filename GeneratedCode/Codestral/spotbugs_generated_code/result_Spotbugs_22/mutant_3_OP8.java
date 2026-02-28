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

    public String getObjectName() {
        return objectName;
    }

    public void showBug(Object comparisonObject) {
        System.out.println("Are the objects equal? " + this.equals(comparisonObject));
    }

    public static void main(String[] args) {
        ClassLoader loaderA = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                if (name.equals("ClassComparisonBug")) {
                    return super.loadClass(name);
                }
                return null;
            }
        };

        ClassLoader loaderB = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                if (name.equals("ClassComparisonBug")) {
                    return super.loadClass(name);
                }
                return null;
            }
        };

        try {
            Class<?> clazzA = loaderA.loadClass("ClassComparisonBug");
            Class<?> clazzB = loaderB.loadClass("ClassComparisonBug");

            Object objA = clazzA.getDeclaredConstructor(String.class).newInstance("Object A");
            Object objB = clazzB.getDeclaredConstructor(String.class).newInstance("Object B");

            ClassComparisonBug testObj = new ClassComparisonBug("Test Object");
            testObj.showBug(objA);
            testObj.showBug(objB);

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}