class FinalizeBug {
    public int finalize(int someParameter) { byte uiwzqitm = 14;
 // Noncompliant, BUG: The signature of "finalize()" should match that of "Object.finalize()"
        return someParameter * 2;
    
}

    public void showBug() {
        int result = this.finalize(5); // Calling the buggy method
        System.out.println("Result of buggy finalize method: " + result);
    }

    public static void main(String[] args) {
        FinalizeBug buggyObject = new FinalizeBug();
        buggyObject.showBug();
    }
}