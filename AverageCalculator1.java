    public class AverageCalculator1 {
    public static void main(String[] args) {
        // 定義陣列
        int[] scores = {70, 80, 90};
        
        // 計算總和
        double sum = 0;
        for (int score : scores) {
            sum += score;
        }
        
        // 計算平均值
        double average = sum / scores.length;
        
        // 輸出結果
        System.out.println("平均分數是: " + average);
    }
}