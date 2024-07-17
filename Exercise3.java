import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
      int a=4;
      int b=5;
      int c=8;
      int max=Integer.MIN_VALUE;
      int min=Integer.MAX_VALUE;
      Random r=new Random();
      int[][][] matrix=new int[a][b][c];
      for(int i=0;i<a;i++){
        for(int j=0;j<b;j++){
          for(int k=0;k<c;k++){
            matrix[i][j][k]=r.nextInt(1000)+1;
            if(max<matrix[i][j][k]){
              max=matrix[i][j][k];
            }
            if(min>matrix[i][j][k]){
              min=matrix[i][j][k];
            }
          }
        }
      }
      for(int[][] i:matrix){
        for(int[] j:i){
          for(int k:j){
            System.out.print(k+" ");
          }
        }
        System.out.println();
      }
      System.out.println("Minimum Value :"+min);
      System.out.println("Maximum value :"+max);
  }
}