public class CountOccurences{
    public static void count(int[] a){
        int count=1, i=1;
        while (i<a.length) {
            while (i<a.length && a[i]==a[i-1]) {
                count++;
                i++;
            }
            // System.out.println(a[i-1]+"->"+count);
            if(count==1){
                System.out.println("The element occur only once is "+a[i-1]);
            }
            count=1;
            i++;
            }
        if (a.length==1 || a[i-1]!=a[i-2]) {
            System.out.println("The element occur only once is "+a[i-1]);
        }  
        }
    
    public static void main(String[] args) {
        int[] a = {5,5,6,6,7,8,8,8,9};
        count(a);
    }
}