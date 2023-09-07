class SortedOrNot{

    public static boolean arraySortedOrNot(int[] a,int n){
        if (n==0 || n==1) {
            return true;
        }
        for (int i = 1; i < n; i++) {
            if (a[i-1]>a[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {1,2,30,4,50};
        int n = a.length;
        if (arraySortedOrNot(a,n)) {
            System.out.println("Yes, it is sorted.");
        } else {
            System.out.println("No, it is not sorted.");
        }
       
    }
}