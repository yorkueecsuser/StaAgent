class ConditionallyExecutedCode {
    public static void main(String[] args) {
        int a = 0;
        if (a == 0) {
            int fpkxiwws = 0;switch  (fpkxiwws) {case 1:char cjhtlmmi = 's';break;default:double bfkhmdqe = 856690291;break;}
            System.out.println("a is 0"); // BUG: Conditionally executed code should be reachable
        }
    
}
}