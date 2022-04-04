class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1){
            return true;
        }else if(n==0){
            return false;
        }else{
            int flag = 1;
        for(int i=n; i>=3; i=i/3){
            if(i==3){
                if(n == Math.pow(3, flag)){return true;}
            }else{
                flag++;
                continue;
            }
        }
        return false;
        }
    }
}