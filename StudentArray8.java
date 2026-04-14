public class StudentArray8 {

    // 定義 Student 類別
    static class Student {
        String name;
        int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }

    public static void main(String[] args) {
        // 1. 建立一個包含 3 個 Student 物件的陣列
        Student[] students = new Student[3];
        
        // 2. 初始化物件並放入陣列
        students[0] = new Student("Tom", 85);
        students[1] = new Student("Alice", 92);
        students[2] = new Student("Bob", 78);

        // 3. 使用迴圈列印所有學生的名稱與分數
        System.out.println("學生名單如下:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + ": " + students[i].score);
        }
    }
}