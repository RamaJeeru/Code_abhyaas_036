public class SubArrays{

    public static void subarray(int[] a){
        
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(a[j2]+" ");
                }System.out.println();
            }
        }
    }

    public static int maxSubarray(int[] a){
        int sum=0, max_sum = 0;
        int start=0, s=0, end =0;

        for (int i = 0; i < a.length; i++) {
            
            if (sum>=0) {
                sum += a[i];
                start = s;
                end = i;
            } else {
                sum = a[i];
            }

            if (sum>max_sum) {
                max_sum = sum;
                s = i+1;
            }
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int[] a = {1,-2,3,4,5};
        subarray(a);
        System.out.println("The maximum value of subarray: "+maxSubarray(a));
    }
}