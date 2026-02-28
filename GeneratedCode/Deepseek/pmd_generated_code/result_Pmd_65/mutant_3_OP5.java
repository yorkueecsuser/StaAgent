class Foo implements Cloneable {
    public Object clone() {
        return new Foo(); // BUG: ProperCloneImplementation
    }

    public Object showBug() {
        try {
            int value = getValue();
            switch(value) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
                default:
                    break;
            }
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

    public static int getValue() {
        return 0;
    }
}