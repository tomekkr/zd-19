import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Instructor instructor = new Instructor("Marek", "Kowalski", "990023", "Angielski");
        Student student1 = new Student("Maria", "Pieńkowska", "8656456456", true);
        Student student2 = new Student("Katarzyna", "Markowska", "5345345", true);

        Group group = new Group();
        Person[] english = group.createGroup(instructor, 2);
        group.addStudent(english, student1);
        System.out.println(Arrays.toString(english));
        group.addStudent(english, student2);
        System.out.println(Arrays.toString(english));
    }
}
