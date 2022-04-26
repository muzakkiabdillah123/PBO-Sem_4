package Association;

public class Faculty {
    String nameFaculty;
    int id;
    private Course[] courseList;

    public Faculty() {
    }

    public Faculty(String nameFaculty, int id, Course[] courseList) {
        this.nameFaculty = nameFaculty;
        this.id = id;
        this.courseList = courseList;
    }

    public void addCourse(Course c) {
        Course[] temp = new Course[courseList.length + 1];
        for (int i = 0; i < courseList.length; i++) {
            temp[i] = courseList[i];
        }
        temp[courseList.length] = c;
        courseList = temp;
    }

    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public int getId() {
        return id;
    }
}
