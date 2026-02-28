class BuggyCode {
    public Class<?> showBug() {
        Class<?> c = new String().getClass();

        // Inserting an unreachable for loop
        for (int i = 0;!alwaysFalse(); i++) {
            // This code is unreachable
            System.out.println("This is an unreachable loop");
        }

        return c;
    }

    private boolean alwaysFalse() {
        return false;
    }
}