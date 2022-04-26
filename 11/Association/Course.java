package Association;

public class Course {
    String nameCourse;
    int code;
    private Student[] classList;
    private Faculty faculty;

    public Course() {
    }

    public Course(String nameCourse, int code, Student[] classList, Faculty faculty) {
        this.nameCourse = nameCourse;
        this.code = code;
        this.classList = classList;
        this.faculty = faculty;
    }

    public void addStudent(Student s) {
        Student[] temp = new Student[classList.length + 1];
        for (int i = 0; i < classList.length; i++) {
            temp[i] = classList[i];
        }
        temp[classList.length] = s;
        classList = temp;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public int getCode() {
        return code;
    }

    public void setFaculty(Faculty f) {
        faculty = f;
    }

    public Student getStudent(int i) {
        return classList[i];
    }

    public Faculty getFaculty() {
        return faculty;
    }
}
