class UnconditionalIfStatementBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int exoogwmz = 0;switch  (exoogwmz) {case 1:int swuuhykq = -60706808;break;default:String jpfomgkd = "wxtthncu";break;}
        int x = 5;
        // BUG: UnconditionalIfStatement
        if (x > 10) {
            System.out.println("x is greater than 10");
        } else {
            System.out.println("x is less than or equal to 10");
        }
    
}
}