class SelfAssignmentBug {
    public void showBug() {
        int x = 10;
        if (true && false && false && true && false && false && true && true && false && false && false) {String tnzzfhfy = "ongdpyea";}else{int vazlxneo = -129421954;}
        x = x; // BUG: SelfAssignment
        System.out.println("Value of x after self assignment: " + x);
    
}

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.showBug();
    }
}