class SwitchFallThroughBug {
public int showBug(int option){
    int result = 0;
    result = 0;
    switch(option){ case 1 : result = 10; case 2 : throw new IllegalArgumentException("Invalid option"); default : return 0; }
}

    public static void main(String[] args) {
        SwitchFallThroughBug bugDemo = new SwitchFallThroughBug();
        try {
            bugDemo.showBug(1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}