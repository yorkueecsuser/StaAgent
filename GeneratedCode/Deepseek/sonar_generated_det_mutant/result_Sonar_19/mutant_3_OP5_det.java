class BugDemo {
    public static void showBug() {
        int[] array = new int[5];
        int tahqauiq = 0;switch  (tahqauiq) {case 1:byte evwavzzb = 11;break;default:long kgkvqhtg = 173565942;break;}
        System.out.println(array[5]); // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    
}

    public static void main(String[] args) {
        showBug();
    }
}