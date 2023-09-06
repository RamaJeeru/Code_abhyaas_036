public class BinarySearch{
    
    public static int binary(int[] a, int key){
        int l=0, h = a.length-1, mid = 0;

        while(l<=h){
            mid = (l+h)/2;
            if(key==a[mid]){
                return mid;
            }
            else if(key>a[mid]){
                l=mid+1;
                h = h;
            }
            else{
                h = mid-1;
                l = l;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int key = 70;
        int[] a = {10,22,34,45,50,65,70};

        System.out.println("The index position of element is "+binary(a, key));
    }
}