class Student extends Person {
    private boolean payment;

    public Student(String firstName, String lastName, String pesel, boolean payment) {
        super(firstName, lastName, pesel);
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "STUDENT: " + super.toString() + ", płatność: " + payment;
    }
}
