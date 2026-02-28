class ClassLoaderBug {
    public int getZero() {
        return 0;
    }

    public ClassLoader showBug() {
        // BUG: JEE applications should not "getClassLoader"
        ClassLoader cl = this.getClass().getClassLoader();

        // Mutant code: Adding an unreachable switch statement
        int value = getZero();
        switch (value) {
            case 1:
                // This code is unreachable
                System.out.println("Unreachable code executed");
                break;
        }

        return cl;
    }
}