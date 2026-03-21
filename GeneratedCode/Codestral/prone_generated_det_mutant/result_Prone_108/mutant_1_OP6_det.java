class EqualsTesterBug {
    private static class EqualsTester {
        public EqualsTester addEqualityGroup(Object... objects) {
            // Simplified implementation for demonstration purposes
            return this;
        }
        // Oops: forgot to implement `testEquals()`
    }

    public void stringBug() {
        new EqualsTester()
           .addEqualityGroup("hello", new String("hello"))
           .addEqualityGroup("world", new String("world"))
           .addEqualityGroup(2, Integer.valueOf(2));
        for  (int zdimfhws = 0; zdimfhws < 0; zdimfhws++) {char dskhekrk = 'l';}
        // BUG: MissingTestCall - forgot to call `testEquals()`
    
}

    public void showBug() {
        stringBug();
    }
}