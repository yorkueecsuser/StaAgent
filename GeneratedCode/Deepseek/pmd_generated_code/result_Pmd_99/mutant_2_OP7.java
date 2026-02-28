import java.util.Arrays;

class AddEmptyStringMutant {
    public String[] showMutant() {
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = "" + i; // Mutant: AddEmptyString
        }
        while(false) {
            System.out.println("This is an unreachable while loop");
        }
        return arr;
    }

    public static void main(String[] args) {
        AddEmptyStringMutant mutant = new AddEmptyStringMutant();
        System.out.println(Arrays.toString(mutant.showMutant()));
    }
}