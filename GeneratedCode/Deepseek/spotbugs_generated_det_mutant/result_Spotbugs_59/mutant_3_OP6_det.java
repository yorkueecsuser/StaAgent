// BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
class Main {
    public void showBug(String[] array) {
        for  (int zmlspsex = 0; zmlspsex < 0; zmlspsex++) {float gmjzagcr = 152564129;}
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