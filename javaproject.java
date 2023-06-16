import java.util.HashSet;

public class javaproject {


    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> number = new HashSet<>();
        
        for(int i = 0; i< nums.length; i++)
        {
           if(number.contains(nums[i]))
               return true;
            number.add(nums[i]);
      
        }

         for(int i = 0; i< nums.length; i++)
        {
           if(number.contains(nums[i]))
               return true;
            number.add(nums[i]);
      
        }
        return false;
    }
    
}


    // public Boolean containsDuplicate(int[] nums) { 
    // //     for(int i = 0; i< nums.size(); i++){
    // //          for(int j = i+1; j< nums.size(); j++)
    // //          {
    // //              if(nums[i]==nums[j])
    // //              {
    // //                  return true;
    // //              }
                 
    // //          }
            
    // //     }
    // //      return false;
    // // }
   
    //     HashSet<Integer> number = new HashSet<>();
        
    //     for(int i = 0; i< nums.size(); i++)
    //     {
    //        if(number.contains(nums))
    //             number.add(toArray(nums));
    //            return true;
      
    //     }
    //     return false;
    // }
    // return nums;
    

 












