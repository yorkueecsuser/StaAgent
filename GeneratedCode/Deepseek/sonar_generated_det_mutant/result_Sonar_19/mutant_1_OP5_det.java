class BugDemo {
    public static void showBug() {
        int[] array = new int[5];
        int vzfszwec = 0;switch  (vzfszwec) {case 1:int mpkwrpsv = -195141792;break;default:String bhyprivu = "uhzevyzt";break;}
        System.out.println(array[5]); // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    
}

    public static void main(String[] args) {
        showBug();
    }
}