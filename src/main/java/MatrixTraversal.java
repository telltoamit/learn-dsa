public class MatrixTraversal {

   public static void main(String[]  args) {
      int[][] matrix = {{1,2,3,4},{1,2,3,4},{1,2,3,4}};
     
     spiralTraversal(matrix,2,3,0,0);
     
   }
  
  public static spiralTraversal(int[][] matrix , row, column, startRow, startColumn) {
     System.out.print("[");
    if(row<0 && column<0) 
        return;
    else if(row<=0){
          for(int i= startColumn;i<=column;i++){
             System.out.print(" " + matrix[row][i]);
          }
    } else if(column<=0){
      for(int i= startRow;i<=row;i++){
           System.out.print(" " + matrix[column][column]);
          }
    }
    
    for(int i=startCoulmn;i<=column;i++){
          System.out.print(" " + matrix[startRow][i]);
    }
    for(int i=startRow+1;i<=row;i++) {
        System.out.print(" " + matrix[i][column]);
    }
    for(int i=column-1;i>=startCoulmn; i--) {
        System.out.print(" " + matrix[row][i]);
    }
    for(int i=row-1;i>=startRow+1;i--){
      System.out.print(" " + matrix[i][column]);
    }
      System.out.print("]");
      spiralTraversal(matrix, row-1, column-1, startRow+1, startColumn+1);
  
  }


}
