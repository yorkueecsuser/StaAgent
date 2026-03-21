class BugExample {
    public void showBug() {
        String xbqmqpmy = "Test";
        boolean exkhidvh = xbqmqpmy instanceof String;
        System.out.println(exkhidvh); // BUG: IsInstanceIncompatibleType
    }
}