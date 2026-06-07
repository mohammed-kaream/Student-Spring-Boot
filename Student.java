package student_mohammed.demo;

// تم استبدال حزم jakarta بحزم javax ليتوافق مع إصدار Spring Boot 2
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String major;
    private Double grade;

    public Student() {}
    public Student(Long id, String name, String major, Double grade) {
        this.id = id; this.name = name; this.major = major; this.grade = grade;
    }
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }
    public Double getGrade() { return grade; }
    public void setGrade(Double grade) { this.grade = grade; }
}
