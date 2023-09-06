public class FindMissingNumber{
    public static void main(String[] args) {
        int sum=0, sum1=0;
        int[] a = {6,4,5,2,1};
        
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        for (int i = 1; i <= 6; i++) {
            sum1+=i;
        }
        System.out.println("The missing no. is "+(sum1-sum));
    }
}