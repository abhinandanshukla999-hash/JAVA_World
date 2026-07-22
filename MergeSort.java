import java.util.Scanner;

class Apply {
    int P;
    int R;

    public void MergeS(int A[], int P, int R) {
        if (P < R) {
            int q = (P + R) / 2;
            MergeS(A, P, q);
            MergeS(A, q + 1, R);
            Merge(A, P, q, R);
            
        }
    }

    public void Merge(int A[], int P, int q, int R) {

        int n1 = q - P + 1;
        int n2 = R - q;

        int[] L = new int[n1 + 1];
        int[] R1 = new int[n2 + 1];

        for (int i = 0; i < n1; i++)
            L[i] = A[P + i];

        for (int j = 0; j < n2; j++)
            R1[j] = A[q + 1 + j];

        L[n1] = Integer.MAX_VALUE;
        R1[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;

        for (int k = P; k <= R; k++) {
            if (L[i] <= R1[j]) {
                A[k] = L[i++];
            } else {
                A[k] = R1[j++];
            }
        }
        
    }
       

}

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Entered array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }
        Apply obj = new Apply();
        obj.MergeS(a, 0, n - 1);
        sc.close();
        System.out.println("\nSorted Array Is:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }

}
