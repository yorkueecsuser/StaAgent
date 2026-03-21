class JumbledIncrementerExample {

    public void showBug() {
        for (int i = 0; i < 10; i++) {          // only references 'i'
            int lapghelb = 0;switch  (lapghelb) {case 1:byte jhlmdtxh = -43;break;default:String jhjkdffx = "itxqqwmz";break;}
            for (int k = 0; k < 20; i++) {      // BUG: JumbledIncrementer
                System.out.println("Hello");
                break;
            }
        }
    
}

    public static void main(String[] args) {
        JumbledIncrementerExample example = new JumbledIncrementerExample();
        example.showBug();
    }
}