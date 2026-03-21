class LoopConditionBug {
    public void showBug() {
        for (int i = 0; i < 0; i++) {  // BUG: Loop conditions should be true at least once
            if (false && false && true && false && true && false && true && false && false && false && false) {long xpuorsrt = 365884342;}else{byte nrsiavlj = -112;}
            System.out.println("This line of code should never be executed");
        }
    
}
}