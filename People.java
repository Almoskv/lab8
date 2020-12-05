public class People {
    protected String name;
    protected String lastname;
    protected int age;

    People(){
        this.name = "default";
        this.lastname = "default";
        this.age = 15;
    }
    People(String nameAdd, String lastnameAdd, int ageAdd) {
        this.name = nameAdd;
        this.lastname = lastnameAdd;
        this.age = ageAdd;
    }
    public void printInfo() {
        System.out.println(this.name + " " + this.lastname + " " + this.age);
    }
    public void walk(){
        System.out.println("Walk");
    }
    public void voice(){
        System.out.println("Voice");
    }
    public void run(){
        System.out.println("Run");
    }
}