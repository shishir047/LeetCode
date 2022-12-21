class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0, words=0;

        for(int i=0; i<sentences.length; i++,words=0){
            for(int j=0; j<sentences[i].length(); j++){
                if(Character.isWhitespace(sentences[i].charAt(j))){
                    words++;
                } 
            }
            max = Math.max(max,words+1);
        }
        return max;
    }
}
