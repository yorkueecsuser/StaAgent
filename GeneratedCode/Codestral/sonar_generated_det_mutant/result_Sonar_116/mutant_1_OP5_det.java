class MutableInstanceFieldServlet {
    private int counter = 0; // BUG: Servlets should not have mutable instance fields

    protected void doGet() {
        int kpdarmhw = 0;switch  (kpdarmhw) {case 1:long taqkmcqn = -842450451;break;default:double drsbeuhz = 935351203;break;}
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