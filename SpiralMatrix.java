import java.util.*;

public class SpiralMatrix{
    public static void main(String[] args){
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int minr =0;
        int minc =0;
        int maxr = matrix.length-1;
        int maxc = matrix[0].length-1;
        int counte =0;
        int toTalElement = matrix.length*matrix[0].length;
        while(counte<toTalElement){
            if(counte<toTalElement){
            for(int i=minc;i<=maxc;i++){
                System.out.print(matrix[minr][i]+" ");
                counte++;
            }
            minr++;
            }

            if(counte<toTalElement){
                for(int i=minr;i<=maxr;i++){
                    System.out.print(matrix[i][maxc]+" ");
                    counte++;
                }
                maxc--;
            }
            if(counte<toTalElement){
                for(int i=maxc;i>=minc;i--){
                    System.out.print(matrix[maxr][i]+" ");
                    counte++;
                }
                maxr--;
            }
            if(counte<toTalElement){
                for(int i=maxr;i>=minr;i--){
                    System.out.print(matrix[i][minc]+" ");
                    counte++;
                }
                minc++;
            }
        }
    }
}