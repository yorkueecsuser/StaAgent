class BugDemo {
    public static void showBug() {
        int[] array = new int[5];
        int mqnznkoj = 0;switch  (mqnznkoj) {case 1:long epqyxiwx = -32545799;break;default:float wcalcoku = 136891927;break;}
        System.out.println(array[5]); // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    
}

    public static void main(String[] args) {
        showBug();
    }
}