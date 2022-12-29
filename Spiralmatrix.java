import java.util.*;
public class Spiralmatrix {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("n: ");
        int n = in.nextInt();
        int matrix[][]=new int[n][n];
        int r=matrix.length;
        int c=matrix[0].length;
        int x=10;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=x;
                x++;
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }System.out.println();
        }
        //System.out.print(matrix[0][0]+" ");
        int rowmax=r-1, colmax=c-1, rowmin=0, colmin=0, row=0, col=0;
        /*for(int i=1;i<=(2*r-1);i++){
            x++;
            if(row==rowmax){
                col--;
                while(col>=colmin){
                    System.out.print(matrix[row][col]+" ");
                    col--;
                }rowmax--;col++;
            }
            else if(col==colmin && row!=rowmin){
                row--;
                while(row>=rowmin){
                    System.out.print(matrix[row][col]+" ");
                    row--;
                }colmin++;row++;
            }
            else if(row==rowmin){
                col++;
                while(col<=colmax){
                    System.out.print(matrix[row][col]+" ");
                    col++;
                }rowmin++;col--;
            }
            else if(col==colmax){
                row++; 
                while(row<=rowmax){
                    System.out.print(matrix[row][col]+" ");
                    row++;
                }colmax--;row--;
            }
        }*/
        // The condition in while loop ensures complete printing of matrix of even odd order.
        // The condition of count++ of mine would not work for some odd order matrices.
        // Moreover if conditio in 2nd and 3rd loop if for mxn order matrices where either row/column is greater.
        while(rowmin<=rowmax && colmin<=colmax){
            row = rowmin;
            for(int i=colmin;i<=colmax;i++){
                System.out.print(matrix[row][i]+" ");
            }rowmin++;
            col = colmax;
            for(int i=rowmin;i<=rowmax;i++){
                if(rowmin == rowmax)
                    break;
                System.out.print(matrix[i][col]+" ");
            }colmax--;
            row = rowmax;
            for(int i=colmax;i>=colmin;i--){
                if(colmin == colmax)
                    break;
                System.out.print(matrix[row][i]+" ");
            }rowmax--;
            col=colmin;
            for(int i=rowmax;i>=rowmin;i--){
                System.out.print(matrix[i][col]+" ");
            }colmin++;
            in.close();
        }
    }  
}
