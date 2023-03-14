package io.github.shishir;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int array[] = {10,1,1,6}; // Output: [9,1,1,6]
        System.out.println(Arrays.toString(main.finalPrices(array)));
    }

    public int[] finalPrices(int[] prices) {

        int[] fPrice = new int[prices.length];
        for(int i=0; i< prices.length ; i++){
            if(i==prices.length-1){  
                fPrice[i] = prices[i];
            }
            for(int j=i+1; j< prices.length ; j++){
 
                if(prices[j]<=prices[i]){
                    fPrice[i] = prices[i]-prices[j];
                    break;
                }else if(j == prices.length-1){
                    fPrice[i] = prices[i];
                    break;
                }


            }




        }



return fPrice;
    }

}
