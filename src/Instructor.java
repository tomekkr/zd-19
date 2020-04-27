class Instructor extends Person {
    private String specialization;

    public Instructor(String firstName, String lastName, String pesel, String specialization) {
        super(firstName, lastName, pesel);
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "INSTRUKTOR: " + super.toString() + ", specjalizacja: " + specialization;
    }
}
