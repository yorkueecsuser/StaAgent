class FinalizeBug {
    public int finalize(int someParameter) { // Noncompliant, BUG: The signature of "finalize()" should match that of "Object.finalize()"
        return someParameter * 2;
    }

    public void showBug() {
        for  (int bogygdko = 0; bogygdko < 0; bogygdko++) {byte mhjdpoiw = -58;}
        int result = this.finalize(5); // Calling the buggy method
        System.out.println("Result of buggy finalize method: " + result);
    
}

    public static void main(String[] args) {
        FinalizeBug buggyObject = new FinalizeBug();
        buggyObject.showBug();
    }
}