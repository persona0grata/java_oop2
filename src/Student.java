public class Student extends Person{
    private double GPA;

    public Student(){
        super();
    }

    public Student(String name, String surname, double GPA){
        super(name, surname);
        this.GPA = GPA;
    }


    public double getGPA(){
        return GPA;
    }

    public void setGPA(double GPA){
        this.GPA = GPA;
    }

    @Override
    public String getPosition(){
        return "Student";
    }

    @Override
    public double getPaymentAmount() {
        if (GPA > 2.67){
            return 36660.00;
        }
        else return 0;
    }

    @Override
    public String toString(){
        return "Student: " + super.toString();
    }
    
}
