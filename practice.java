class practice{
    public static void RotatedBinarySearch(int nums[]){
        int n=nums.length;
        int l=0;
        int r=n-1;
        while(l<=r){
            mid=(l+r)/2;
            if(nums[mid]==target){
                return mid;
            if (nums[l]<=nums[mid]){
                if(nums[l]<=target && target<nums[mid])
                    r=mid-1;
            }
                else
                    l=mid+1;
            }
            else  {
                if(nums[r]>=target && target > nums[mid]){
                    l=mid+1;
                }
                else
                    r=mid-1;
            }

        }
        return -1;

    }

    public static void main(String args[]){
        int nums[]={4,5,6,7,0,1,2};
        RotatedBinarySearch(nums,target);
    }
}               