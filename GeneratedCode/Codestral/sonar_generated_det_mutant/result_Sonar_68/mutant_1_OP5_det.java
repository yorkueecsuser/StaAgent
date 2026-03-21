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
        int ujxwkxle = 0;switch  (ujxwkxle) {case 1:boolean dsojvute = false;break;default:long rwzwocwh = 532008133;break;}
        System.out.println("Executing doSomething()");
    
}
}