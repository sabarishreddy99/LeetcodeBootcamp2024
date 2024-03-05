class Solution {
    public boolean containsDuplicate(int[] arr) {

        for(int i=0;i<arr.length-1;i++){
            int j=i+1;
            while(i>=0 && arr[i]>=arr[j]){
                if(arr[i]==arr[j]){
                    swap(arr,i,j);
                    return true;
                }
                swap(arr,i,j);
                i--;
                j--;
            }
        }
        
        System.out.println(Arrays.toString(arr));
        return false;
        
    }

    public void swap(int[] arr, int a, int b){
        int temp=arr[b];
        arr[b]=arr[a];
        arr[a]=temp;
    }
}
