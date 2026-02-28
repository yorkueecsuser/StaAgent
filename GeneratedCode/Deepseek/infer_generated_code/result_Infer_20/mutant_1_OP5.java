int unreachableValue = 1000; // This value will never be reached in the switch case
switch (unreachableValue) {
    case 1000:
        // This will be unreachable code
        System.out.println("This code will never be executed");
        break;
    default:
        break;
}