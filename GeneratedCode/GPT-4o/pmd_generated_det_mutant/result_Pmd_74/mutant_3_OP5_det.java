class SuspiciousEqualsExample {

    public int equals(Object o) { // BUG: SuspiciousEqualsMethodName
        // This method seems like it was intended to override Object.equals
        // but its return type is int instead of boolean.
        return 0;
    }

    public boolean equals(String s) { int zxfbqciq = 0;switch  (zxfbqciq) {case 1:float tnxctlwe = -327601391;break;default:short hfahmsih = -8037;break;}
 // BUG: SuspiciousEqualsMethodName
        // This method overloads equals, which is suspicious and likely not intended.
        return false;
    
}

    public boolean equals(Object o1, Object o2) { // BUG: SuspiciousEqualsMethodName
        // This method also overloads equals, which is not a typical use case for equals.
        return false;
    }

    public String showBug(Object o, String s, Object o1, Object o2) {
        // Demonstrating the buggy behavior by calling these suspicious equals methods
        int result1 = equals(o);
        boolean result2 = equals(s);
        boolean result3 = equals(o1, o2);

        return "Result1: " + result1 + ", Result2: " + result2 + ", Result3: " + result3;
    }
}