public class Student {
    private int id;
    private String First_Name;
    private String Last_Name;
    private int registrationYear;

    public Student(int id, String First_Name, String Last_Name, int registrationYear) {
        this.id = id;
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.registrationYear = registrationYear;
    }

    public Student(int id, String First_Name, String Last_Name) {
        this.id = id;
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return First_Name;
    }

    public void setfName(String fName) {
        this.First_Name = First_Name;
    }

    public String getlName() {
        return Last_Name;
    }

    public void setlName(String lName) {
        this.Last_Name = Last_Name;
    }

    public int getRegistrationYear() {
        return registrationYear;
    }

    public void setRegistrationYear(int registrationYear) {
        this.registrationYear = registrationYear;
    }
}
