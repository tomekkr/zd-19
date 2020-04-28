class Main {
    public static void main(String[] args) {
        Instructor[] instructors = new Instructor[10];
        Student[] students = new Student[10];

        instructors[0] = new Instructor("Marek", "Kowalski", "Angielski");
        instructors[1] = new Instructor("a", "b", "Niemiecki");
        students[0] = new Student("Maria", "Pieńkowska", true);
        students[1] = new Student("Katarzyna", "Markowska", true);

        Group english = new Group("Angielski", 2);
        english.addInstructor(instructors[0]);
        english.addStudent(students[0]);
        english.addStudent(students[1]);

        english.printInfo();
    }
}
