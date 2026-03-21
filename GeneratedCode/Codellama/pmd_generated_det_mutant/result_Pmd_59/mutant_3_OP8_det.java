class NonCaseLabelInSwitchStatement {
    public static void main(String[] args) {
        int[] fugucsec = {1, 2, 3, 4, 5};
        int nxuqluse = 0;
        for (int i = 0; i < fugucsec.length; i++) {
            switch (fugucsec[i]) {
                case 1:
                    nxuqluse += fugucsec[i];
                    break;
                case 2:
                    nxuqluse += fugucsec[i];
                    break;
                case 3:
                    nxuqluse += fugucsec[i];
                    break;
                case 4:
                    nxuqluse += fugucsec[i];
                    break;
                case 5:
                    nxuqluse += fugucsec[i];
                    break;
                default:
                    nxuqluse += fugucsec[i];
                    break;
            }
        }
        System.out.println("Sum: " + nxuqluse);
    }
}