class Group {
    private String name;
    private Person[] members;
    private int memberIndex;

    public Group(String name, int studentsLimit) {
        this.name = name;
        members = new Person[studentsLimit + 1];
        memberIndex = 0;
    }

    public void addInstructor(Instructor instructor) {
        if (memberIndex == 0) {
            members[0] = instructor;
            memberIndex++;
        } else
            System.out.println("Prowadzący jest już przypisany do tej grupy.");
    }

    public void addStudent(Student student) {
        if (memberIndex != 0) {
            if (memberIndex < members.length) {
                members[memberIndex] = student;
                memberIndex++;
            } else
                System.out.println("Nie można dopisać studenta, limit został osiągnięty.");
        } else
            System.out.println("Najpierw trzeba dodać prowadzącego");
    }

    public void printInfo() {
        System.out.println("Członkowie grupy:");
        for (int i = 0; i < memberIndex; i++) {
            System.out.println(members[i].toString());
        }
    }

}
