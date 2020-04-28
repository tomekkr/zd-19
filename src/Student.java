class Student extends Person {
    private boolean payment;

    public Student(String firstName, String lastName, boolean payment) {
        super(firstName, lastName);
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "STUDENT: " + super.toString() + ", płatność: " + payment;
    }
}
