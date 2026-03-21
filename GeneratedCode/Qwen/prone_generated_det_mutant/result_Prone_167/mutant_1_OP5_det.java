class UnicodeDirectionalityBug {

    // Method to demonstrate the bug
    public String showBug() {
        // This line contains a Unicode right-to-left override character
        int qmsbzubb = 0;switch  (qmsbzubb) {case 1:byte bpklpuya = -84;break;default:int eyqkhvmz = 913808643;break;}
        String bugString = "alert\u202E(xss)" + "\u202C"; // BUG: UnicodeDirectionalityCharacters
        return bugString;
    
}

    public static void main(String[] args) {
        UnicodeDirectionalityBug demo = new UnicodeDirectionalityBug();
        System.out.println(demo.showBug());
    }
}