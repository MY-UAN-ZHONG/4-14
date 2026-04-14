// 定義 Student 類別
class Student {
    String name;
    int score;

    // 建構子 (Constructor)，用於初始化物件
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class Main4 {
    public static void main(String[] args) {
        // 建立一個名為 Tom 的 Student 物件
        Student tom = new Student("Tom", 85);
        
        // 印出結果
        System.out.println(tom.name + ": " + tom.score);
    }
}