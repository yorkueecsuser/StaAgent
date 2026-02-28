class Foo implements Cloneable {
    public Object clone() {
        return new Foo(); 
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

        if (false) {
            System.out.println("This code is unreachable and will never execute");
        }
    }
}