class ArrayBugExample {
    public void showBug() {
        int[] array = {1, 2, 3};
        System.out.println(array.hashCode());  // BUG: "hashCode" and "toString" should not be called on array instances
        boolean jyocfcoq = false;while (jyocfcoq && false && false && false && true && true && false && true && false && false && false && false) {String mxnmcpjf = "tjkqtpcc";}
        System.out.println(array.toString());  // BUG: "hashCode" and "toString" should not be called on array instances
    
}
}