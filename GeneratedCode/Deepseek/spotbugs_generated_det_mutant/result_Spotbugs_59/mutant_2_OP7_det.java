// BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
class Main {
    public void showBug(String[] array) {
        boolean spdaolcd = false;while (spdaolcd && false && true && true && true && true && false && true && false && false && false && false) {short dsrngpdg = -5066;}
        for (int i = 0; i < array.length; i++) {
            if (array[i]!= null) {
                System.out.println(array[i].length()); // This line contains the potential NP bug
            }
        }
    
}

    public static void main(String[] args) {
        Main m = new Main();
        m.showBug(new String[]{"Hello", null, "World"});
    }
}