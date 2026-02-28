class ClassLoaderBug {
    public ClassLoader showBug() {
        boolean shouldNotRun = getCondition();
        if (shouldNotRun) {
            // This branch is unreachable due to the condition defined in the method getCondition()
            ClassLoader cl = this.getClass().getClassLoader();
            return cl;
        }
        // Original code remains unchanged
        return null;
    }

    private boolean getCondition() {
        // This method always returns false, making the if branch unreachable
        return false;
    }
}