class ClassComparisonBug {
    private String name;

    public ClassComparisonBug(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        String thisClass = this.getClass().getName();
        String objClass = obj.getClass().getName();
        // Mutant code: Added a duplicate assignment statement
        String objClassDuplicate = obj.getClass().getName();

        return thisClass.equals(objClassDuplicate);
    }

    public String getName() {
        return name;
    }

    public void showBug(Object obj) {
        System.out.println("Are the objects equal? " + this.equals(obj));
    }

    // Rest of the code...
}