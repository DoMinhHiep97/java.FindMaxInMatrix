import java.util.Scanner;

public class FindMaxInMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your width matrix:");
        int width=scanner.nextInt();
        System.out.println("Enter your height matrix:");
        int height=scanner.nextInt();
        int[][] matrix=new int[height][width];
        int max=matrix[0][0];
        for(int i=0;i<height;i++){
            for (int j=0;j<width;j++){
                System.out.println("element "+i+" "+j+":");
                matrix[i][j]=scanner.nextInt();
            }
        }
        for(int i=0;i<height;i++){
            System.out.println();
            for (int j=0;j<width;j++){
                System.out.print(matrix[i][j]);
            }
        }
        for(int i=0;i<height;i++){
            for (int j=0;j<width;j++){
                if(max<matrix[i][j]){
                    max=matrix[i][j];
                }
            }
        }
        System.out.println("\n"+"max is: "+max);
    }
}
