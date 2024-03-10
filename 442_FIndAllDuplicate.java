class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        int n = arr.length;
        while( i < arr.length){
            int correct = arr[i] - 1;
            if( correct >=0 && correct <n && arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else{
                i++;
            }
        }
        List<Integer> li = new ArrayList<>();
        for(int index=0; index < arr.length ; index++){
            if(arr[index] != index+1){
                li.add(arr[index]);
            }
        }
        return li;
    }
}
