class Solution {
    public String mergeAlternately(String word1, String word2) {
        int sizeword1 = word1.length();
        int sizeword2 = word2.length();

        StringBuilder newString = new StringBuilder();
        int smallersize = sizeword1;
        String smallerString = word1;
        String biggerString = word2;

        if (sizeword1 > sizeword2){
            smallersize = sizeword2;
            smallerString = word2;
            biggerString = word1;
        }
        

        int counter = 0;

        for(int i=0;i<sizeword1;i++){
            if (counter == smallersize){
                break;
            }else{
                newString.append(word1.charAt(i));
                for(int j=i;j<=i+1;j++){
                    newString.append(word2.charAt(j));
                    break;
                }
                counter = counter+1;
            }
        }
        String remain = biggerString.substring(counter);
        newString.append(remain);
        return newString.toString();
        
    }
}
