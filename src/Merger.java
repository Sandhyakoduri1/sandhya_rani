public class Merger {

    public static String mergeAlternately(String word1, String word2) {
        //string builder to store the merged string
        StringBuilder mergedString = new StringBuilder();

        int i = 0, j = 0;
        //length of both input strings
        int len1 = word1.length();
        int len2 = word2.length();

//merge alternatively until one of the strings is fully crosses
        while (i < len1 && j < len2) {
            // Append characters from both strings alternately
            mergedString.append(word1.charAt(i++));
            mergedString.append(word2.charAt(j++));
        }
        // If there are remaining characters in word1, append them
        while (i < len1) {
            mergedString.append(word1.charAt(i++));
        }

        // If there are remaining characters in word2, append them
        while (j < len2) {
            mergedString.append(word2.charAt(j++));
        }

        // Convert StringBuilder to String and return the merged result
        return mergedString.toString();
    }
}
