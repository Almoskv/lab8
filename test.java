public class test {
    public static void main(String[] args) {
        int a = 10;
        People people = new People();
        people.printInfo();
        People peopleTwo = new People("Ivan","Ivanov",12);
        peopleTwo.printInfo();
        peopleTwo.walk();
        peopleTwo.voice();
        peopleTwo.run();
        Student student = new Student("Andrey", "Andreev", 22);
        student.printInfo();
        student.learn();
        Teacher teacher = new Teacher("Petr", "Petrov", 45);
        teacher.printInfo();
        teacher.teach();
    }
}