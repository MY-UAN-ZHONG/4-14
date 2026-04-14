public class MaxFinder2 {
    public static void main(String[] args) {
        // 修改數據以符合預期結果 9
        int[] scores = {7, 8, 9};
        
        try {
            int max = findMax(scores);
            System.out.println("最大值是: " + max);
        } catch (IllegalArgumentException e) {
            System.out.println("錯誤: " + e.getMessage());
        }
    }

    /**
     * 在陣列中尋找最大值
     * @param arr 輸入的整數陣列
     * @return 陣列中的最大值
     * @throws IllegalArgumentException 當陣列為 null 或長度為 0 時拋出
     */
    public static int findMax(int[] arr) {
        // 輸入檢查：確保陣列有效
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("陣列不能為空");
        }

        // 假設第一個元素為初始最大值
        int max = arr[0];
        
        // 從第二個元素開始進行比較
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // 更新最大值
            }
        }
        
        return max;
    }
}