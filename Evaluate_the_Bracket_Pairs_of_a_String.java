class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> keys = new HashMap<>();
        for(List<String> i : knowledge){
            keys.put(i.get(0), i.get(1));
        }
        int flag = 0;
        String ans = "";
        String key = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(')
                flag = 1;
            else if(flag == 1 && s.charAt(i) == ')'){
                flag = 0;
                if(keys.containsKey(key))
                    ans += keys.get(key);
                else
                    ans += "?";
                key = "";
            }
            else if(flag == 0)
                ans += s.charAt(i);
            else if(flag == 1)
                key += s.charAt(i);
        }
        return ans;
    }
}