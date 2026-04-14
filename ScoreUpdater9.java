public class ScoreUpdater9 {

    // 定義 Student 類別
    static class Student {
        String name;
        int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }

    /**
     * 更新指定學生的分數
     * @param s 要更新的 Student 物件
     * @param newScore 新的分數值
     */
    public static void updateScore(Student s, int newScore) {
        s.score = newScore;
    }

    public static void main(String[] args) {
        Student tom = new Student("Tom", 85);
        System.out.println("更新前 - Tom: " + tom.score);

        // 呼叫方法將分數更新為 95
        updateScore(tom, 95);

        System.out.println("更新後 - Tom: " + tom.score);
    }
}