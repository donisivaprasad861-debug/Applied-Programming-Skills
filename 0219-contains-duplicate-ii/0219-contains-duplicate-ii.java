class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) 
{
        Map<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                int previousIndex = map.get(nums[i]);
                if(i - previousIndex <= k)
                {
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;

////////////////////////////////////////////////////
        //This is a BRUTE FORCE Approach//

        // for(int i=0;i<nums.length;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if(nums[i] == nums[j] && j-i <= k)
        //             return true;
        //     }
        // }
        // return false;
///////////////////////////////////////////////////
    }
}