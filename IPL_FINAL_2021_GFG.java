class Solution {
    static int findMaxLen(String S) {
        // code here
        int ans = 0;
        
        
        int n = S.length();
        
        Stack<Integer> st = new Stack<>();
        
        st.push(-1);
        
        for(int i=0;i<n;i++)
        {
            char c = S.charAt(i);
            
            if(c=='(')
            {
                st.push(i);
            }
            else{
                st.pop();
                if(st.isEmpty())
                {
                    st.push(i);
                }
                else{
                    ans = Math.max(ans,i-st.peek());
                }
            }
        }
        
        return ans; 
    }
};
