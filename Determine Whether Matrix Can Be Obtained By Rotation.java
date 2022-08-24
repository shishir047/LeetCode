class Solution {
    public boolean findRotation(int[][] matrix, int[][] target) { 
        
        
        
            int[][] newMatrix = new int[matrix.length][matrix.length];
            int[][] new1Matrix = new int[matrix.length][matrix.length];
        if(equal(matrix,target)){
       return true;
        }else{ 
            
        
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    newMatrix[i][j] = matrix[j][i];
                }
            }  

            
            for (int i = 0; i < newMatrix.length; i++) {
                for (int j = 0; j < newMatrix.length; j++) {
                    new1Matrix[i][j] = newMatrix[i][newMatrix.length-1 - j];
                }
            }

             if(equal(new1Matrix, target)){  
                return true; 
            } else{
                   for (int i = 0; i < matrix.length; i++) { 
                    for (int j = 0; j < matrix.length; j++) {
                        newMatrix[i][j] = new1Matrix[j][i];
                    }
                }

                for (int i = 0; i < newMatrix.length; i++) {
                    for (int j = 0; j < newMatrix.length; j++) {
                        matrix[i][j] = newMatrix[i][newMatrix.length-1 - j];
                    }
                }

                if(equal(matrix, target)){
                    return true;
                } else{


                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix.length; j++) {
                            new1Matrix[i][j] = matrix[j][i];
                        }
                    }

                    for (int i = 0; i < newMatrix.length; i++) {
                        for (int j = 0; j < newMatrix.length; j++) {
                            newMatrix[i][j] = new1Matrix[i][newMatrix.length-1 - j];
                        }
                    }
                    if(equal(newMatrix, target)){
                        return true;
                    } else{
                        return false;
                    }
                }
            }
        
        }
            
    }
    
    public static boolean equal( int[][] arr1,  int[][] arr2) {
 
  if (arr1 == null) {
 
 
return (arr2 == null);
 
  }
 
 
  if (arr2 == null) {
 
 
return false;
 
  }
 
 
  if (arr1.length != arr2.length) {
 
 
return false;
 
  }
 
 
  for (int i = 0; i < arr1.length; i++) {
 
 
if (!Arrays.equals(arr1[i], arr2[i])) {
 
 
    return false;
 
 
}
 
  }
 
  return true;
    }
}
    
    
    
    
   
