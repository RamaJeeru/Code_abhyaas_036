// DAY - 1
// find the frequency of each element in an array 
public class FrequencyOfElements{

    static void frequency(int[] arr){
        int freq = 1;
        int i = 1,max = 0,m=0;
        int min = arr.length, n = 0;
        while(i<arr.length){
            while(i<arr.length && arr[i]==arr[i-1]){
                freq++;
                i++;
                // Find max frequency element in an array
                if(freq > max){
                max = freq;
                m = arr[i-1];
                }

                else{
                    if(freq == 1){
                        n = arr[i];
                    }
                    else{
                        min = freq;
                        n = arr[i];
                    }
                }

            }
            System.out.println(arr[i-1]+" "+freq);
            freq = 1;
            i++;
        }
        if(arr.length==1 || arr[i-1]!=arr[i-2]){
            System.out.println(arr[i-1]+" "+freq);
        }
        System.out.println("max :"+ m);
        System.out.println("min :"+ n);

    }

public static void main(String[] args) {

    int[] arr = {10,10,10,10,20,20,20,30,30,40};
    frequency(arr);

}    
}