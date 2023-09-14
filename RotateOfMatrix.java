class TranposeOfMatrix{
    
    static void transpose(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i<j) {
                 int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;   
                }
            }
        }
    }
    static void reverse(int[][] a){
        for (int i = 0; i < a.length; i++) {
            int l=0, r=a.length-1;
            while(l<=r){
            int temp = a[i][l];
            a[i][l] = a[i][r];
            a[i][r] = temp;
            
            l++;
            r--;
        }
    }
}
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Before Rotate MAtrix:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        transpose(a);
        reverse(a);

        System.out.println("After 90 degree Rotate MAtrix:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}