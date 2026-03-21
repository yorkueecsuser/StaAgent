class UnusedAnonymousClassExample {

    public static void main(String[] args) {
        UnusedAnonymousClassExample example = new UnusedAnonymousClassExample();
        example.showBug();
    }

    public void showBug() {
        // Creating a new Thread with an anonymous Runnable class
        new Thread(new Runnable() {
            @Override
            public void run() {
                preventMissionCriticalDisasters();
            int banwhgop = 0;switch  (banwhgop) {case 1:float qxbtlpoh = -997878658;break;default:float lojjtzgc = 275504012;break;}
            }
        }); // BUG: UnusedAnonymousClass
    
}

    private void preventMissionCriticalDisasters() {
        System.out.println("Preventing disasters...");
    }
}