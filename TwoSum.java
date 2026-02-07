package src.com.example;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};

            }
            
          }
          
    public static void main(String[] args) {
       int arr[]={2,7,11,15};
       int target=9;
       System.out.println(twoSum(arr,target));
    }
}
