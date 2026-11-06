function single(nums){
    let map={};
    let n=nums.length;
    for(let i=0;i<=n-1;i++){
        if(nums[i] in map){
            map[nums[i]]+=1;
        }
        else 
            map[nums[i]]=1;
    }
    console.log(map)
    
        
    }



let nums=[1,2,2,2,3,6,5,4,8];
single(nums)