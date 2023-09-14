public class UnionOfTwoArrays{
    public static void main(String[] args) {
        int[] a = {1,1,2,3,4,5};
        int[] a2 = {2,2,3,4,4,5,6};
        int m = a.length;
        int n = a2.length;
        System.out.print("Union of two arrays:");
        printUnion(a,a2,m,n);
    
    }
    public static void  printUnion(int[] a, int[] a2,int m, int n){
        int i=0, j=0;
        while (i<m && j<n) {
            if (a[i]<a2[j]) {
                System.out.print(a[i++]+" ");
            }
            else if (a[i]>a2[j]) {
                System.out.print(a[j++]+" ");
            }
            else{
                System.out.print(a[i++]);
                j++;
            }
        }

        while (i<m) {
            System.out.print(a[i++]+" ");
        }
        while (j<n) {
            System.out.print(a2[j++]+" ");
        }
    }
}