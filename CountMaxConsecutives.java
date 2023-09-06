public class CountMaxConsecutives{
    
    public static int maxOnes(int[] a){
        int max_ones=0, count =0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==1) {
                count = count+1;
            }
            else{
                count = 0;
            }

            if (count > max_ones) {
                max_ones = count;
            }
        }
        return max_ones;
    }
    public static void main(String[] args) {
        int[] a = {1,2,1,1,2,3,1,1,1,1,5,1};
        System.out.println("Maximum cosecutives one's are :"+maxOnes(a));
    }
}