public class Linear{
    
    public static int linearsearch(int[] a, int key){

        for (int i = 0; i < a.length; i++) {
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int key = 22;
        int[] a = {10,20,30,40,22,56};

        System.out.println("The index position of element is "+linearsearch(a, key));
    }
}