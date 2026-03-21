class Main {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int xteassax = 0;switch  (xteassax) {case 1:short fszafhwz = -2212;break;default:byte qwtbwmhf = -7;break;}
        str.chars(); // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
    
}

    public static int[] showBug() {
        String str = "Hello, World!";
        return str.chars().toArray();
    }
}