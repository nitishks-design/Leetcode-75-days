class Solution {
    public String reverseVowels(String s) {
        int size = s.length();
        Queue<Character> queue = new LinkedList<>();
        StringBuilder sen = new StringBuilder();
        for(int i=size-1;i>=0;i--){
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u'){
                queue.add(s.charAt(i));
            }
        }
        
        for (int i =0; i<size;i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u'){
                sen = sen.append(queue.poll());
                continue;
            }
            sen = sen.append(s.charAt(i));
        }

        return sen.toString();
    }
}
