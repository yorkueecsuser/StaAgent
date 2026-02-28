private static void makeHttpRequest(String urlString) {
    try {
        URL url = new URL(urlString);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        // Mutant code - Add an unreachable if-else branch
        boolean unreachableCondition = false;  // This condition is always false
        if (unreachableCondition) {
            // This code is unreachable so it won't be executed
            System.out.println("This is an unreachable code block.");
        } else {
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine())!= null) {
                content.append(inputLine);
            }
            in.close();

            con.disconnect();
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}