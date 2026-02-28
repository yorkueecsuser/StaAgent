class ClassLoaderBug {
    private boolean getFalseCondition() {
        return false;
    }

    public ClassLoader showBug() {
        if (getFalseCondition()) {
            throw new RuntimeException("This code should be unreachable");
        }

        ClassLoader cl = this.getClass().getClassLoader();
        return cl;
    }
}