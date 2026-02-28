class ClassLoaderBug {
    private boolean getCondition() {
        return false;
    }

    public ClassLoader showBug() {
        // Insert unreachable for loop
        for (int i = 0; getCondition(); i++) {
            System.out.println("Unreachable code");
        }

        ClassLoader cl = this.getClass().getClassLoader();
        return cl;
    }
}