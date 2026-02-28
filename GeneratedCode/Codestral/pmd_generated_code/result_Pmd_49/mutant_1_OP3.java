class BuggyCode {
    public Class<?> showBug() {
        Class<?> c = new String().getClass();
        boolean isUnreachable = false;
        if (isUnreachable) {
            System.out.println("This is an unreachable statement");
        }
        return c;
    }
}