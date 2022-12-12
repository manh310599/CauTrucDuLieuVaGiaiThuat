package sorting;

public class selectionSort {
 
    public static void main(String[] args) {
        int []a = {9,5,7,8,4,6,3,1,2};
        SapXep(a);
    }

    private static void SapXep(int[] a) {
        for (int i = 0;i<a.length;i++)
        {
            int min = i;
            for (int j = i+1;j<a.length;j++)
            {
                if (a[j] < a[min])
                {
                   min = j;
                }
            }
            if (min != i)
            {
                int tam = a[i];
                a[i] = a[min];
                a[min] = tam;
            }

            inRa(i, a);
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
