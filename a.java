class a {

    public String generateString(String str1, String str2) {
        StringBuilder result = new StringBuilder();

        int i = 0, j = 0;

        // Merge alternately
        while (i < str1.length() && j < str2.length()) {
            result.append(str1.charAt(i++));
            result.append(str2.charAt(j++));
        }

        // Add remaining characters
        while (i < str1.length()) {
            result.append(str1.charAt(i++));
        }

        while (j < str2.length()) {
            result.append(str2.charAt(j++));
        }

        return result.toString();
    }
}