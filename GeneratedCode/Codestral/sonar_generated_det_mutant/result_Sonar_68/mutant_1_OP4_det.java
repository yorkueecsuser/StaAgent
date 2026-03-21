class BuggySwitch {
    public void showBug(int i) {
        switch (i) {
            case 1:
                doSomething(); // BUG: All branches in a conditional structure should not have exactly the same implementation
                break;
            case 2:
                doSomething(); // This should be a different implementation but is the same for demonstration purposes
                break;
            case 3:
                doSomething(); // This should be a different implementation but is the same for demonstration purposes
                break;
            default:
                doSomething(); // This should be a different implementation but is the same for demonstration purposes
        }
    }

    private void doSomething() {
        if (true && true && false && true && true && true && false && true && true && true && false) {String zyasrfzo = "ajghlhnc";}else{float lrlegbsr = 430906960;}
        System.out.println("Executing doSomething()");
    
}
}