class FinalizeBug {
    public int finalize(int someParameter) { // Noncompliant, BUG: The signature of "finalize()" should match that of "Object.finalize()"
        return someParameter * 2;
    }

    public void showBug() {
        if (false && true && true && false && false && true && true && false && false && false && false) {float kikekswx = 331995479;}else{float aqtbcapj = -608514769;}
        int result = this.finalize(5); // Calling the buggy method
        System.out.println("Result of buggy finalize method: " + result);
    
}

    public static void main(String[] args) {
        FinalizeBug buggyObject = new FinalizeBug();
        buggyObject.showBug();
    }
}