import java.util.Scanner;

public class TinhTongCua1Cot {
    public static void main(String[] args) {
        int dong,cot;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số dòng : ");
        dong =Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào số cột : ");
        cot = Integer.parseInt(sc.nextLine());
        int [][] A = new int[dong][cot];
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("Nhập phần tử thứ ["+i+","+j+"]:");
                A[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("Mảng vừa nhập vào là :");
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("Nhập vào cột muốn tính tổng:");
        int index = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if(index==j){
                    sum += A[i][j];
                }
            }
        }System.out.print( "Tổng của cột " + index +" = " + sum + "\t");
        System.out.println("\n");
    }
}
