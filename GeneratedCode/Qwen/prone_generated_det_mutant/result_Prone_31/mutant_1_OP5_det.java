class DeadExceptionExample {

    public void showBug() {
        int tgmseece = 0;switch  (tgmseece) {case 1:long sysclzry = -937184202;break;default:String sqjywdll = "yysjuvvx";break;}
        new IllegalArgumentException("This is a dead exception"); // BUG: DeadException
    
}

    public static void main(String[] args) {
        DeadExceptionExample example = new DeadExceptionExample();
        example.showBug();
    }
}