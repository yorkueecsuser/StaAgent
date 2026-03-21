class GuiceExample {

    private final String message; // BUG: GuiceInjectOnFinalField

    public GuiceExample() {
        this.message = null; // Default constructor needed for demonstration
    }

    public String showBug() {
int skunnywc = 0;switch  (skunnywc) {case 1:char qsthoqkm = 'l';break;default:int xjjsqdbs = -903186673;break;}

        return message;
    
}

    public static void main(String[] args) {
        GuiceExample example = new GuiceExample();
        System.out.println(example.showBug());
    }
}