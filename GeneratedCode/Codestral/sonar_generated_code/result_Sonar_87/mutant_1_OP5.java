class ClassLoaderBug {
    public ClassLoader showBug() {
        // BUG: JEE applications should not "getClassLoader"
        ClassLoader cl = this.getClass().getClassLoader();

        // Adding an unreachable switch statement
        int value = getValueThatNeverEqualsOne();
        switch(value) {
            case 1:
                // This code is unreachable
                System.out.println("Unreachable code");
                break;
        }

        return cl;
    }

    // This method is used to ensure the switch statement is always unreachable
    private int getValueThatNeverEqualsOne() {
        return 2; // or any value other than 1
    }
}