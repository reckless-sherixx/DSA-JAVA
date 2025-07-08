package ProblemSolving.LeetCode.Arrays;

public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        int count = 0 ;
        int n = candyType.length /2;
        for(int i = 0 ; i<candyType.length ; i++){
            boolean isUnique = true;
            for(int j = i + 1; j < candyType.length ; j++){
                if(candyType[i] == candyType[j]){
                    isUnique = false;
                    break;
                }
            }
                if(isUnique){
                    count ++;
                }
        }
        return  Math.min(count , n);       
    }
}
