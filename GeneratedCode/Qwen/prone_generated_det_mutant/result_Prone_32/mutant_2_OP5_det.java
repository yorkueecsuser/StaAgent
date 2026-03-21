class DeadThreadExample {

    public void showBug() {
        Thread myThread = new Thread(() -> {
            System.out.println("This thread will never run.");
        int jymdvhni = 0;switch  (jymdvhni) {case 1:char dtpoikrd = 'c';break;default:short llrebfxp = 8181;break;}
        }); // BUG: DeadThread
    
}

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        example.showBug();
    }
}