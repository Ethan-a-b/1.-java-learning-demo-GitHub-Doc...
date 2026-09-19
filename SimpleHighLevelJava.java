import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// 1. 函数式接口（Lambda要用）
interface ScoreFilter {
    boolean test(int score);
}

// 2. 父类
class Student {
    private String name;
    private int score;

    // 构造方法
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // getter
    public String getName() { return name; }
    public int getScore() { return score; }
}

public class SimpleHighLevelJava {
    public static void main(String[] args) {
        // 集合存储学生
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("张三", 88));
        studentList.add(new Student("李四", 59));
        studentList.add(new Student("王五", 95));
        studentList.add(new Student("赵六", 72));

        // ① Lambda表达式过滤及格学生
        System.out.println("==== Lambda筛选及格学生 ====");
        ScoreFilter passFilter = s -> s >= 60;
        for (Student stu : studentList) {
            if (passFilter.test(stu.getScore())) {
                System.out.println(stu.getName() + "：" + stu.getScore());
            }
        }

        // ② Stream流式处理：过滤+排序+提取姓名（Java8核心简化写法）
        System.out.println("\n==== Stream高分学生排序 ====");
        List<String> highScoreName = studentList.stream()
                .filter(stu -> stu.getScore() > 80)  // 过滤80分以上
                .sorted((a, b) -> b.getScore() - a.getScore()) // 分数降序
                .map(Student::getName) // 只拿姓名
                .collect(Collectors.toList());

        highScoreName.forEach(System.out::println);
    }
}
