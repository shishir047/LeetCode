class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int i,j, sum = 0;
        ArrayList<Integer> wealthList = new ArrayList<Integer>();
        for (i=0; i<accounts.length; i++){
            for(j=0 ; j<accounts[i].length; j++){
                sum = sum + accounts[i][j];
                continue;
            }
            wealthList.add(sum);
            sum = 0;
        }
        
        Integer[] worth = wealthList.toArray(new Integer[0]);
        int max = Collections.max(Arrays.asList(worth));
        
        return max;
    }
    

}
