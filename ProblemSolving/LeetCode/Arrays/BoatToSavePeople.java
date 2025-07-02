package ProblemSolving.LeetCode.Arrays;

import java.util.Arrays;

public class BoatToSavePeople {
    public int numRescueBoats(int[] people, int limit) { 
        Arrays.sort(people);
        int i = 0 , j = people.length-1;
        int boat = 0 ;
        while(i <= j){
            if(people[i] + people[j] <= limit){
                i++;
            }
            j--;
            boat ++;
        }
        return boat;
    }
}
