// import java.util.*;

// class DAY2{
//     public static int single(int nums[]){
//         Map<Integer,Integer> map=new HashMap<>();
//         for(int i=0;i<n;i++){
//             if(map.containsKey(nums[i]))
//                 map.put(nums[i],map.get(nums[i])+1);
//             else 
//                 map.put(nums[i],1);

//         }

//         for(Integer num : map.keySet()){
//             if(map.get(num)==1)
//                 return num;
//         }
//     return -1;

//     }

//     public static void main(String args[]){
//         int nums[]={2,5,4,6};
//         System.out.println(single(nums));
//     }
// }


class DAY2{
    public static void single(int arr[]){
        int result=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
            result=result^arr[i];
        System.out.println(result);
    }

    public static void main(String args[]){
        int nums[]={1,2,2,3,5,4,3,4,5};
        single(nums);
    }
}