import java.util.List;

public class Main{
    public static void main(String[] args) {

        String word1 = "abc";
        String word2 = "pqrstu";
        Merger merger = new Merger();
        // Call mergeAlternately method with example strings
        String result = merger.mergeAlternately(word1, word2);
        System.out.println(result);  // Output: "apbqcrstu"


        GCDOfString gcdOfString = new GCDOfString();
        System.out.println(gcdOfString.gcdOfString("abc","abcabc"));

        GreatestNumberOfCandies kidsWithCandies = new GreatestNumberOfCandies();
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> result1 = kidsWithCandies.kidsWithCandies(candies, extraCandies);
        System.out.println(result1);
    }
}
