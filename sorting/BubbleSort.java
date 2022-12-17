package sorting;

/**
 * BubbleSort
 */
public class BubbleSort {

    public static void main(String[] args) {
        int [] a = {5,3,8,4,6};
        SapXep(a);
        

    }

    private static void SapXep(int[] a) {

            int n = a.length;

            for (int i = 0;i<n;i++)
            {
                for (int j = 0;j<n-i-1;j++)
                {
                    if (a[j]>a[j+1])
                    {
                        int t = a[j];
                        a[j] = a[j+1];
                        a[j+1] = t;
                    }
                }
                inRaMang(i,a);
            }
    }

    private static void inRaMang(int i, int[] a) {
        System.out.printf("%d: ",i);
        for (int j = 0;j<a.length;j++)
        {
            System.out.printf("%d ",a[j]);
        }
        System.out.println("\n");
    }
}