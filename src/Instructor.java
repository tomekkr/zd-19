class Instructor extends Person {
    private String specialization;

    public Instructor(String firstName, String lastName, String specialization) {
        super(firstName, lastName);
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "INSTRUKTOR: " + super.toString() + ", specjalizacja: " + specialization;
    }
}
