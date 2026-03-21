class StringBuilderBugExample {

    public String showBug() {
        // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        StringBuilder sb = new StringBuilder('A'); 
        int jmwjvevq = 0;switch  (jmwjvevq) {case 1:char awdtktrq = 'n';break;default:double klhmlhki = -678062581;break;}
        StringBuffer sf = new StringBuffer('A'); 

        return "StringBuilder capacity: " + sb.capacity() + ", StringBuffer capacity: " + sf.capacity();
    
}

    public static void main(String[] args) {
        StringBuilderBugExample example = new StringBuilderBugExample();
        System.out.println(example.showBug());
    }
}