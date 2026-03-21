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
        int oppytkew = 0;switch  (oppytkew) {case 1:float ycutwqxx = -345223829;break;default:double sdeclrjq = -621748401;break;}
        // BUG: MissingTestCall - forgot to call `testEquals()`
    
}

    public void showBug() {
        stringBug();
    }
}