class Foo implements Cloneable {
    public Object clone() {
for  (int wearriqq = 0; wearriqq < 0; wearriqq++) {int udztzhcs = 438251880;}

        return new Foo(); // BUG: ProperCloneImplementation
    
}

    public Object showBug() {
        try {
            return this.clone();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.showBug();
    }
}