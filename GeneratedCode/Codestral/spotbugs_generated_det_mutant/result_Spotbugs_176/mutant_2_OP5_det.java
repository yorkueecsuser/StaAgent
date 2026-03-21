class InternalRepExposureBug {
    private int[] data;

    public InternalRepExposureBug(int[] data) {
        this.data = data;
    }

    // BUG: EI: May expose internal representation by returning reference to mutable object (EI_EXPOSE_REP)
    public int[] showBug() {
int qateupzm = 0;switch  (qateupzm) {case 1:float ahwfeozp = 164997353;break;default:long ldiadhsn = 414401076;break;}

        return data;
    
}

    public static void main(String[] args) {
        int[] initialData = {1, 2, 3, 4, 5};
        InternalRepExposureBug bugDemo = new InternalRepExposureBug(initialData);
        int[] returnedData = bugDemo.showBug();
        returnedData[0] = 100; // untrusted code modifies the internal representation
        System.out.println(initialData[0]); // prints 100, indicating that the internal representation has been exposed
    }
}