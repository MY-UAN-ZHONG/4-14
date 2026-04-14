public class SumCalculator7 {
    public static void main(String[] args) {
        int[] scores = {70, 80, 90};
        
        int total = sum(scores);
        
        System.out.println("陣列總和為: " + total);
    }

    /**
     * 計算陣列中所有元素的總和
     * @param arr 要進行加總的整數陣列
     * @return 陣列元素的總和
     */
    public static int sum(int[] arr) {
        int total = 0;
        
        // 遍歷陣列並累加數值
        for (int value : arr) {
            total += value; // 等同於 total = total + value
        }
        
        return total;
    }
}