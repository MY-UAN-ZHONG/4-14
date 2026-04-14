import java.util.Arrays;

public class BonusCalculator3 {
    public static void main(String[] args) {
        int[] scores = {60, 70};
        
        System.out.println("加分前: " + Arrays.toString(scores));
        
        // 呼叫方法
        addBonus(scores);
        
        System.out.println("加分後: " + Arrays.toString(scores));
    }

    /**
     * 為陣列中的每個元素增加 5 分
     * @param scores 要進行加分的整數陣列
     */
    public static void addBonus(int[] scores) {
        // 使用一般的 for 迴圈來遍歷陣列索引，以便修改原始陣列的值
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scores[i] + 5; 
        }
    }
}