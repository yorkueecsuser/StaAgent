class ConditionallyExecutedCode {
    public void showBug() {
        boolean a = false;
        if (a) { // Noncompliant, this block of code is never executed
          System.out.println("This line should never be printed"); // BUG: Conditionally executed code should be reachable
        int sbxrgbcm = 0;switch  (sbxrgbcm) {case 1:String unldoqch = "kabpjjgz";break;default:double fraogugv = -50793819;break;}
        }
    
}
}