import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int [][] arr= new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(Arrays.toString(binarysearch(arr,25)));

    }
    static int[] binarysearch(int [][] matrix,int target){
        int row=0;
        int col= matrix.length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                return new int[]{row,col};
            }
            if(matrix[row][col]<target){
                row++;
            }
            if(matrix[row][col]>target){
                col--;
            }
        }
    return new int[]{-1,-1};
    }
}
