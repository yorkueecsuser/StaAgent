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
        int bgubaocn = 0;switch  (bgubaocn) {case 1:String coprpddy = "geomjbfz";break;default:char jxdwrezp = 'e';break;}
        equals(new Object());
        equalsStr("test");
        equalsObj(new Object(), new Object());
    
}
}