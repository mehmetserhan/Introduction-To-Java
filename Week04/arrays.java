import java.util.Arrays;

public class arrays{
    public static void main(String args[]){
        
        int arr[] = {100, 200, 300};
        System.out.println(arr[0]);
        System.out.println("-----");
  
        String list[] = new String[]{"Ali", "Veli", "Ahmet", "Mehmet"};
        System.out.println(list[1]);
        System.out.println("-----");

        int arr1[] = new int[3];
        arr1 = new int[]{5, 10, 15};
        /*
         * arr[0] = 5;
         * arr[1] = 10;     same thing as above
         * arr[2] = 15;
        */
        int i;
        for(i=0; i<arr1.length; i++){
            System.out.printf("%d. element: %d\n", i, arr1[i]);
        }
        System.out.println("-----");

        int arr2[][] = new int[2][3];
        arr2 = new int[][]{{1, 2, 3}, {4, 5, 6}}; 
        int j;
        for(i=0; i<2; i++){
            for(j=0; j<3; j++){
                System.out.printf("%d. row %d. column -> %d\n", i, j, arr2[i][j]);
            }
        }
        System.out.println("-----");
    
        int arr3[][] = new int[3][];
        arr3[0] = new int[2];
        arr3[1] = new int[1];                        // each index has different size of subarrays
        arr3[2] = new int[3];
        arr3[0][0] = 10;
        arr3[0][1] = 20;
        arr3[1][0] = 30;
        arr3[2][0] = 40;
        arr3[2][1] = 50;
        arr3[2][2] = 60;
        System.out.printf("arr3[2][1] -> %d\n", arr3[2][1]);
        System.out.println("-----");

        
        Object[] arr4;            // array of different type of elements
        arr4 = new Object[4];
        arr4[0] = "Ali";
        arr4[1] = 5.0;
        arr4[2] = "Veli";
        arr4[3] = 'c';
        for(int k=0; k<arr4.length; k++){
            System.out.println(arr4[k]);
        }
        System.out.println("-----");

        int arr5[] = {1, 2, 3, 4, 5};
        int arr6[] = new int[5];
        System.arraycopy(arr5, 0, arr6, 0, arr5.length);
        for(i=0; i<arr6.length; i++){
            System.out.print(arr6[i] + " ");
        }
        System.out.print("\n");
        
        int arr7[] = {5, 25, 15, 20};
        Arrays.sort(arr7);
        for(i=0; i<arr7.length; i++){
            System.out.print(arr7[i] + " ");
        }

        System.out.print("\nAre they equal? ");     
        System.out.println(Arrays.equals(arr6, arr7));
    }
}
