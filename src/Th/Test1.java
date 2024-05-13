package Th;
public class Test1 {
    private String firstName;
    private String lastName;
    private int age;
    private String gender; // giới tính
    private String[] interests;

    public Test1(String first,String last,int age,String gender,String[] interests) {
        this.firstName = first;
        this.lastName = last;
        this.age = age;
        this.gender = gender;
        this.interests = interests;
    }
        public void bio(){
            System.out.println(firstName + " " + lastName + " is " + age + " years old. He likes " + interests[0] + " and " + interests[1] + ".");
        }
        public void Getting() {
            System.out.println("Hi I/m " + firstName + ".");
        }
    public static void main(String[] args) {
        String[] interests = {"music", "skiing"};
        Test1 person = new Test1("Bob","Swith",32, "male",interests);
        person.Getting();
        person.bio();

    }
}

