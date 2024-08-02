import java.util.ArrayList;
import java.util.List;
public class GreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatestNum =0;
        List<Boolean> output = new ArrayList<>();

        for(int i = 0; i < candies.length; i++){
            if(candies[i]>greatestNum){
                greatestNum = candies[i];
            }
        }

        for(int i = 0; i< candies.length; i++){
            int addedCandies = candies[i] + extraCandies;
            if(addedCandies >= greatestNum){
                output.add(true);
            }else{
                output.add(false);
            }
        }
        return output;
    }


}
