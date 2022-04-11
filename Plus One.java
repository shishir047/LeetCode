class Solution {
    public int[] plusOne(int[] digits) {
        int flag = 1;
        if(digits[digits.length-1]==9){
            for(int i=0; i<digits.length-1; i++){
                if(digits[i]==9){
                    flag++;
                }else{
                    break;
                }
            }
            if(flag==digits.length){
                int[] res = new int[digits.length+1];
                res[0] = 1;
                return res;
            }else{
                int[] res = new int[digits.length];
                for(int i=digits.length-1;i>=0;i--){
                    if(digits[i] == 9){
                        res[i]=0;
                    }else{
                        res[i]=digits[i]+1;
                        for(int j = 0; j<i; j++){
                            res[j] = digits[j];
                        }
                        return res;
                    }
                }

            }

        }else{
            int[] res = new int[digits.length];
            for(int i=0; i<digits.length; i++){
                if (i == digits.length-1){
                    res[i] = digits[i]+1;
                } else{
                    res[i] = digits[i];
                }
            }
            return res;
        }


            return digits;
        }

}