class MutableInstanceFieldServlet {
    private int counter = 0; // BUG: Servlets should not have mutable instance fields

    protected void doGet() {
        int bzxjjbiv = 0;switch  (bzxjjbiv) {case 1:int bowxaytt = 672676668;break;default:byte gwkntzzd = -31;break;}
        incrementCounter();
        System.out.println("Counter: " + counter);
    
}

    private void incrementCounter() {
        counter++;
    }

    public int showBug() {
        incrementCounter();
        return counter;
    }
}