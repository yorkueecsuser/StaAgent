class ForLoopBug {
    public static void main(String[] args) {
        int[] jakvgngs = {1, 2, 3, 4, 5};
        for (int i = 0; i < jakvgngs.length; i--) {
            System.out.println(jakvgngs[i]);
        }
    }
}