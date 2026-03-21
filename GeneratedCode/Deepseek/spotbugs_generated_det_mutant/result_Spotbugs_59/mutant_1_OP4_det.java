// BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
class Main {
    public void showBug(String[] array) {
        if (true && true && true && false && true && false && true && true && false && false && false) {float vrqhqfzc = 597613997;}else{boolean wqbjxgfo = true;}
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