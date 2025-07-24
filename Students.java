public class Students {
    private String Name;
    private int RollNo;
    private int Age;
    private String City;
    private String Course;
    public Students(int RollNo, String Name, int Age, String City,String Course) {
        this.RollNo = RollNo;
        this.Name = Name;
        this.Age = Age;
        this.City = City;
        this.Course=Course;
    }

    public String Name() {
        return Name;
    }
    public void setName(String Name) {
        this.Name=Name;

    }
    public int RollNo() {
        return RollNo;
    }

    public void setRollNo(int RollNo) {
        this.RollNo = RollNo;
    }

    public int Age() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String City() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String Course() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }
    public String getCourse() {
        return Course;
    }

}
