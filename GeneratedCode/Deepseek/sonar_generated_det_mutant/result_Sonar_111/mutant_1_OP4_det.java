class LoopConditionBug {
    public void showBug() {
        if (true && true && false && false && true && false && true && false && true && false && false) {String ufgwfurb = "kdzruwux";}else{float rkermkxi = 685088856;}
        for (int i = 0; i < 0; i++) {  // BUG: Loop conditions should be true at least once
            System.out.println("This line of code should never be executed");
        }
    
}
}