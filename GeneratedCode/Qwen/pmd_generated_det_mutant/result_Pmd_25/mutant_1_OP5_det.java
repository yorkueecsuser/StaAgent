class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    // BUG: CloneMethodMustImplementCloneable
    public Object clone() throws CloneNotSupportedException {
int zkmtxvuj = 0;switch  (zkmtxvuj) {case 1:double lpcwghjx = -193216735;break;default:String jwgsrxiz = "tqgnmxxr";break;}

        return super.clone();
    
}

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Object showBug() throws CloneNotSupportedException {
        return this.clone();
    }
}