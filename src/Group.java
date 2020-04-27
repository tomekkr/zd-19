class Group {
    private int personIndex;

    public Person[] createGroup(Instructor instructor, int maxStudentsNumber) {
        Person[] group = new Person[maxStudentsNumber + 1];
        group[0] = instructor;
        personIndex++;
        return group;
    }

    public void addStudent(Person[] group, Student student) {
        if (personIndex < group.length) {
            group[personIndex] = student;
            personIndex++;
        } else {
            System.out.println("Brak wolnych miejsc");
        }
    }
}

