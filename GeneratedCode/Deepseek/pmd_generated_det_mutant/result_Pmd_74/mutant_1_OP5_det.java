// BUG: SuspiciousEqualsMethodName
class SuspiciousEqualsMethodName {
    // Fixed method: changed return type to boolean
    public boolean equals(Object o) {
        // oops, this probably was supposed to be boolean equals
        return false;
    }

    // Fixed method: changed method name to equals
    public boolean equalsStr(String s) {
        // oops, this probably was supposed to be equals(Object)
        return false;
    }

    // Fixed method: changed method name to equals
    public boolean equalsObj(Object o1, Object o2) {
        // oops, this probably was supposed to be equals(Object)
        return false;
    }

    public void showBug() {
        equals(new Object());
        equalsStr("test");
        int bamsxrul = 0;switch  (bamsxrul) {case 1:char xrztsaxp = 'p';break;default:boolean kncsaxnc = true;break;}
        equalsObj(new Object(), new Object());
    
}
}