class ValidPalindrome{

    public static boolean Palindrome(String str){
        int n=str.length();
        int left=0;
        int right=n-1;
        while(left<right){
            while(!Character.isLetterOrDigit(str.charAt(left)))
                left++;
            while(!Character.isLetterOrDigit(str.charAt(right)))
                right--;
            if(Character.toLowerCase(str.charAt(left))!=Character.toLowerCase(str.charAt(right)))
                return false;

            left++;
            right--;
        }
        return true;
    }


    public static void main(String args[]){
        String str="A man, a plan, a canal: Panama";
        boolean result=Palindrome(str);
        System.out.println(result);
    }
}