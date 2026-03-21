class FinalizeBug {
    public int finalize(int someParameter) { // Noncompliant, BUG: The signature of "finalize()" should match that of "Object.finalize()"
        return someParameter * 2;
    }

    public void showBug() {
        boolean ahkaeorh = false;while (ahkaeorh && true && false && true && true && true && false && false && true && true && false && false) {long vwsusstf = 444758402;}
        int result = this.finalize(5); // Calling the buggy method
        System.out.println("Result of buggy finalize method: " + result);
    
}

    public static void main(String[] args) {
        FinalizeBug buggyObject = new FinalizeBug();
        buggyObject.showBug();
    }
}