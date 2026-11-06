import java.util.Stack;

class Qn20 {
    public static boolean isValid(String s){
        Stack<Character> stack=new Stack<>();

        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(' || '[' || '{'){
                stack.push('s.charAt(i)');

            }
            else
                if(stack.size()||
                    stack.peek()== '(' && s.charAt(i)==')' ||
                    stack.peek() == '[' && s.charAt(i)==']' ||
                    stack.peek() == '{' && s.charAt(i)=='}'
                )
                return false;
               
               
                stack.pop();
                
                    
                
        }
        return stack.size()==0;
    }
    public static void main(String args[]){
        String str="";

    }
}