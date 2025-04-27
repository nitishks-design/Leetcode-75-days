class Solution {
    public String reverseWords(String s) {
        StringBuilder reverse = new StringBuilder();
        StringBuilder tempString = new StringBuilder();

        int size = s.length();
        Stack news = new Stack();
        int k = 0;
        for (int i=0;i<=size-1;i++){
            for (int j=k;j<=size-1;j++){
                if(s.charAt(j) !=' '){
                    tempString.append(s.charAt(j));
                    k = k+1;
                }
                else if(s.charAt(j) ==' '){
                    k = k+1;
                    break;
                }
            
            }
            if (tempString.length() > 0){
                news.push(tempString.toString());
                tempString.setLength(0);
            }
        }

        while(!news.isEmpty()){
            reverse.append(news.pop());
            if (news.size() != 0){
                reverse.append(" ");
            }
        }
          
    return reverse.toString();
    }
}
