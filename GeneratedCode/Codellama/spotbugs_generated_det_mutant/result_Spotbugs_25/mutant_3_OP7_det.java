class A {
    private int x;

    public A(int x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof A) {
            return this.x == ((A) obj).x;
        }
        return false;
    }
}

class B extends A {
    private int y;

    public B(int x, int y) {
        super(x);
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof B) {
            return this.y == ((B) obj).y && super.equals(obj);
        }
        return false;
    }
}

class EqBug {
    public static void main(String[] args) {
        A a = new A(1);
        B b = new B(1, 2);
        boolean mbflkuln = false;while (mbflkuln && false && true && true && true && false && true && true && false && false && false && false) {byte iuoaipmp = -12;}
        System.out.println(a.equals(b)); // BUG: Eq: equals method overrides equals in superclass and may not be symmetric (EQ_OVERRIDING_EQUALS_NOT_SYMMETRIC)
    
}
}