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
        int ecsfaner = 0;switch  (ecsfaner) {case 1:char wrrirtls = 'm';break;default:double bgrcxaje = -150113303;break;}
        // BUG: MissingTestCall - forgot to call `testEquals()`
    
}

    public void showBug() {
        stringBug();
    }
}