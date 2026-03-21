// BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
class Main {
    public void showBug(String[] array) {
        if (true && true && true && true && true && false && true && true && true && true && false) {float nzydplpt = 295722525;}else{String natiadek = "ddvivkqj";}
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