package sorting;

public class inserctionSort {
    ///////////////////Thuật toán sắp xếp chèn//////////////////////////
    /////Link bài học https://blog.luyencode.net/thuat-toan-sap-xep-chen/
    
    public static void main(String[] args) {
        int [] a = {9,5,7,8,4,1,2,6,3};
        sapXep(a);
    }

    private static void sapXep(int[] a) {
        int  n = a.length;
////////////////Bắt đầu tìm từ vị trí thứ 2/////////////////////////////////
        for (int i = 1;i<n;i++)
        {
            ///////////////////Lưu giá trị a[i] vào biến tạm thời//////////////////
            int ai = a[i];
            ///////////////////Lưu giá trị a[i-1] vào biến tạm thời//////////////////
            int j = i -1;
            ////////////// Điều kiện biến j phải lớn hơn hoặc bằng 0
            ////////////// Và a[i-1] > a[i] sẽ áp dụng lưu giá trị   a[i] vào a[i-1]
            //////////////
            while (j >= 0 && a[j]>ai)
            {
                a[j+1] = a[j];
                j--;
            }

            a[j+1] = ai;
            inRa(i,a);
        }
    }

    private static void inRa(int i, int[] a) {
        System.out.printf("%d: ",i);
        for (int j = 0;j<a.length;j++)
        {
            System.out.printf("%d ",a[j]);
        }
        System.out.println("\n");
    }
}
