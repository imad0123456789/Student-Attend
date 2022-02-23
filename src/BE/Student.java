package BE;

public class Student {

    private int id;
    private String Name;
    private String email;
    private String Study;
    private int Attend;
    private String ImagUrl;

    public Student(int id, String name, int attend) {
        this.id = id;
        Name = name;
        Attend = attend;
    }

    public String getStudy() {
        return Study;
    }

    public void setStudy(String study) {
        Study = study;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public int getAttend() {
        return Attend;
    }

    public void setAttend(int attend) {
        Attend = attend;
    }

    public String getImagUrl() {
        return ImagUrl;
    }

    public void setImagUrl(String imagUrl) {
        ImagUrl = imagUrl;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", email='" + email + '\'' +
                ", Study='" + Study + '\'' +
                ", Attend=" + Attend +
                ", ImagUrl='" + ImagUrl + '\'' +
                '}';
    }
}

