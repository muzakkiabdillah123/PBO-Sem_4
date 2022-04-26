package Association;

public class Student {
    String nama;
    String nim;
    private Course[] courseList;

    public Student() {
    }

    public Student(String nama, String nim, Course[] courseList) {
        this.nama = nama;
        this.nim = nim;
        this.courseList = courseList;
    }

    public void addCourse(Course s) {
        Course[] temp = new Course[courseList.length + 1];
        for (int i = 0; i < courseList.length; i++) {
            temp[i] = courseList[i];
        }
        temp[courseList.length] = s;
        courseList = temp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public Course getCourse(int i) {
        return courseList[i];
    }
}
