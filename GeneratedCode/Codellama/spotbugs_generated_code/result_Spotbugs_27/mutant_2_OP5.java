// BUG: Eq: Covariant equals() method defined, Object.equals(Object) inherited (EQ_SELF_USE_OBJECT)
class EqBug {
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass()!= obj.getClass()) {
            return false;
        }
        EqBug other = (EqBug) obj;
        if (this.x!= other.x) {
            return false;
        }
        if (this.y!= other.y) {
            return false;
        }
        return true;
    }

    public int x;
    public int y;

    public EqBug(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        EqBug a = new EqBug(1, 2);
        EqBug b = new EqBug(1, 2);
        System.out.println(a.equals(b)); // BUG: Eq: Covariant equals() method defined, Object.equals(Object) inherited (EQ_SELF_USE_OBJECT)
    }

    // Unreachable switch statement mutation
    public void unreachableSwitchStatement(int value) {
        switch (value) {
            case 0:
                System.out.println("This code is unreachable");
                break;
            case 1:
                System.out.println("This code is also unreachable");
                break;
            default:
                System.out.println("This code is also unreachable");
                break;
        }
    }
}