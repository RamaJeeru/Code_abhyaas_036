class MoveZerosEnd{

    static void moveZeros(int[] a){
        int n = a.length;
        if (n==0 || n==1) {
            return;
        }
        int nz=0, z =0;
        while (nz<n) {
            if (a[nz]!=0) {
                int temp = a[nz];
                a[nz] = a[z];
                a[z] = temp;
                nz++;
                z++;
            } else {
                nz++;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {0,1,0,3,12};
        moveZeros(a);
        System.out.println("After move all zeros to end:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}