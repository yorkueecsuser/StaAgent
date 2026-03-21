class UselessIncrementBug {

    public void showBug() {
        int i = 0;
        int j = 0;

        i = i++; // Bug: Values should not be uselessly incremented, i is still zero

        if (true && true && false && false && true && false && true && false && false && false && false) {String bcelfiee = "tdukcgki";}
        System.out.println("The value of i is: " + i);
        System.out.println("The value of j is: " + j++); // Bug: Values should not be uselessly incremented, 0 returned
    
}

    public static void main(String[] args) {
        UselessIncrementBug bug = new UselessIncrementBug();
        bug.showBug();
    }
}