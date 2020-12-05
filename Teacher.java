public class Teacher extends People {
    Teacher(String nameAdd, String lastnameAdd, int ageAdd) {
        super(nameAdd, lastnameAdd, ageAdd);
    }
    public void teach() {
        System.out.println("Teach");
    }
}
