abstract class Person implements Payable, Comparable<Person>{
    private static int ID = 0;

    int id;
    String name;
    String surname;

    Person(){
        this.id = ++ID;
    }

    Person(String name, String surname){
        this();
        this.name = name;
        this.surname = surname;
    }


    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public void setName(String Name){
        this.name = Name;
    }
    
    public void setSurname(String Surname){
        this.surname = Surname;
    }

    abstract String getPosition();


    @Override
    public String toString() {
        return id + " " + name + " " + surname;
    }

    @Override
    public int compareTo(Person other){
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }

}
