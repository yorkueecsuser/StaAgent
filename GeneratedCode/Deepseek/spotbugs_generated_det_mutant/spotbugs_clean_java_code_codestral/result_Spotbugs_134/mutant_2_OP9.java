public static void main(String[] args) {
    BadMonthValue bmv = new BadMonthValue();
    int buggyMonth = 12;
    do {
        System.out.println(bmv.showBug(buggyMonth));
        buggyMonth++; // This line can be modified based on the need to break the loop
    } while(buggyMonth <= 12);
}