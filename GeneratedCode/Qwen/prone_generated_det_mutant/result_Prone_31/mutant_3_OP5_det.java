class DeadExceptionExample {

    public void showBug() {
        int zuvnbzqq = 0;switch  (zuvnbzqq) {case 1:boolean wfmhcdzp = true;break;default:double qnhsumvl = -274945747;break;}
        new IllegalArgumentException("This is a dead exception"); // BUG: DeadException
    
}

    public static void main(String[] args) {
        DeadExceptionExample example = new DeadExceptionExample();
        example.showBug();
    }
}