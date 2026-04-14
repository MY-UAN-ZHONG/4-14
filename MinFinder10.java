public class MinFinder10 {
    public static void main(String[] args) {
        int[] scores = {70, 80, 90, 60, 95};
        
        int min = findMin(scores);
        
        System.out.println("陣列中的最小值是: " + min);
    }

    /**
     * 在陣列中尋找最小值
     * @param arr 輸入的整數陣列
     * @return 陣列中的最小值
     */
    public static int findMin(int[] arr) {
        // 假設第一個元素為最小值
        int min = arr[0];
        
        // 從第二個元素開始遍歷比較
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // 如果發現更小的值，則更新 min
            }
        }
        
        return min;
    }
}