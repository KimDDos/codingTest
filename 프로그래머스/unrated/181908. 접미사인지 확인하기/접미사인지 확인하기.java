class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] is = new String[my_string.length()];
        for(int i=0; i<my_string.length(); i++){
            is[i] = my_string.substring(i,my_string.length());
        }
        for(int i=0; i<my_string.length(); i++){
            if(is[i].equals(is_suffix)) answer = 1;
        }
        return answer;
    }
}