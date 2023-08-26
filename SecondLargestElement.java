public class SecondLargestElement{

    public static void main(String[] args) {
        int[] a = {80,45,67,8,2,45};
        int max = 0, sec_max =0;
        // Find the Second largest element in array
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max = a[i];
            }
        }
        for (int j = 0; j < a.length; j++) {
            if(a[j]<max && a[j]>sec_max){
                sec_max = a[j];
            }  
        }
        System.out.println("1st largest element:"+max);
        System.out.println("2nd largest element:"+sec_max);
        

        // Find the second Smallest Element  of an array
        int temp, count = a.length;
        for (int i = 0; i < count; i++) {
            for (int j = i+1; j < count; j++) {
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("The 1st smallest element: "+a[0]);
        System.out.println("The 2nd smallest element: "+a[1]);
    }
}