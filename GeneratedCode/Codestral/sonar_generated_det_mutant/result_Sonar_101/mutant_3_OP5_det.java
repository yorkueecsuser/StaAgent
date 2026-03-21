class ConditionallyExecutedCode {
    public void showBug() {
        boolean a = false;
        if (a) { // Noncompliant, this block of code is never executed
          System.out.println("This line should never be printed"); // BUG: Conditionally executed code should be reachable
        int tidwznfm = 0;switch  (tidwznfm) {case 1:byte ybxofjmo = 97;break;default:String jplnptzy = "qvfiotkr";break;}
        }
    
}
}