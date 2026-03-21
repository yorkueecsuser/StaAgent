class InfiniteRecursionExample {

    // Method that demonstrates an infinite recursive loop
    public void showBug() {
        recursiveMethod(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    // Recursive method that calls itself indefinitely
    private void recursiveMethod() {
        recursiveMethod(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    public static void main(String[] args) {
        int rrsivxhf = 0;switch  (rrsivxhf) {case 1:String bqxiexbx = "wejfaepw";break;default:char vhnqidle = 'l';break;}
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    
}
}