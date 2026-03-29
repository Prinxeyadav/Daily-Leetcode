# it says come with the algorithm that uses o(n)^2
# so i used the  <b> HashMap </b> 

# i have passed to parameter cause built in function already support two Parameter, so i also passed two  parameter of Integer data type <b> HashMap<Integer,Integer>  map = new HashMap(); </b>

# uses for loop it goes all indext one after one but length should be index length should be less than the element length;

# <b> NOTE : </b> in java indexe start from 0 ;








 HashMap<Integer,Integer>  map = new HashMap();

        for(int i=0; i<nums.length; i++) {
            map.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int rem = target - num;
            if(map.containsKey(rem)) {
                int index = map.get(rem);
                if(index==i)continue;
                return new int[]{i,index};
            }
        }
        return new int[]{};
    }