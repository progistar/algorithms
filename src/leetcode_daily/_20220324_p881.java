package leetcode_daily;

import java.io.IOException;
import java.util.Arrays;

class Solution_20220324 {
    public int numRescueBoats(int[] people, int limit) {
        
        Arrays.sort(people);
        
        // let's solve greedy
        int ans = 0;
        for(int i=people.length-1; i>=0; i--) {
            // marking already on
            if(people[i] == -1){
                continue;
            }
            ans++;
            int weight = people[i];
            for(int j=0; j<i; j++) {
                // check condition
                if(people[j] != -1 && people[j] + weight <= limit) {
                    weight += people[j];
                    people[j] = -1;
                    break;
                }
            }
            // okay let's ride on the boat people i
            people[i] = -1;
        }
        
        return ans;        
    }
}
public class _20220324_p881 {
	public static void main(String[] args) throws IOException {
		Solution_20220324 a = new Solution_20220324();
		int[] b = {1,2,3,4,5};
		a.numRescueBoats(b, 1);
	}
}
