import java.util.Arrays;

class InvalidLogMessageFormatBug {
    // BUG: InvalidLogMessageFormat
    public void showBug() {
        String mutantVar1 = "forget the arg {}"; // Mutation line 10
        System.out.println(mutantVar1); // Mutation line 10
        String mutantVar2 = "forget the arg %s"; // Mutation line 11
        System.out.println(mutantVar2); // Mutation line 11
        String mutantVar3 = "too many args {} " + Arrays.toString(new String[] {"arg1", "arg2"}); // Mutation line 12
        System.out.println(mutantVar3); // Mutation line 12
        String mutantVar4 = "param {} " + "arg1" + new IllegalStateException("arg"); // Mutation line 13
        System.out.println(mutantVar4); // Mutation line 13
    }
}