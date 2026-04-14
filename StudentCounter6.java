public class StudentCounter6 {
    
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
        // 建立學生陣列
        Student[] students = {
            new Student("Alice", 55),
            new Student("Bob", 80),
            new Student("Charlie", 60),
            new Student("David", 45)
        };

        // 呼叫計算方法
        int count = countPassingStudents(students);
        
        System.out.println("及格（60分以上）的學生人數為: " + count);
    }

    /**
     * 計算分數 >= 60 的學生人數
     * @param students 學生陣列
     * @return 符合條件的總人數
     */
    public static int countPassingStudents(Student[] students) {
        int count = 0;
        
        for (Student s : students) {
            // 檢查每個學生的分數
            if (s.score >= 60) {
                count++;
            }
        }
        
        return count;
    }
}