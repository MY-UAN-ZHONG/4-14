public class CurveApplication5 {

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
     * 核心方法：若分數低於 60，則自動加 10 分
     * @param s 要進行加分的學生物件
     */
    public static void curve(Student s) {
        if (s.score < 60) {
            s.score += 10;
        }
    }

    public static void main(String[] args) {
        // 建立測試物件 Tom，分數為 55
        Student tom = new Student("Tom", 55);
        
        System.out.println("加分前: " + tom.name + ": " + tom.score);
        
        // 執行加分方法
        curve(tom);
        
        System.out.println("加分後: " + tom.name + ": " + tom.score);
    }
}