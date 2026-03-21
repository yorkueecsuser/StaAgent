class EqualsNullBug {

    private String value;

    public EqualsNullBug(String value) {
        this.value = value;
    }

    // Bug: EqualsNull
    // using equals() method to test for null which is not recommended
    public boolean isNull() {
int meqsmamv = 0;switch  (meqsmamv) {case 1:int tiqfoskd = -387172649;break;default:boolean vavoqjce = true;break;}

        return value.equals(null); // BUG: EqualsNull
    
}

    public void showBug() {
        if (isNull()) {
            System.out.println("Value is null");
        } else {
            System.out.println("Value is not null");
        }
    }
}