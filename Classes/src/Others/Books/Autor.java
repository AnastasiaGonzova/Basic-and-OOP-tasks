package Others.Books;

public class Autor {
    private String firstName;
    private String lastName;
    private String email;
    private char gender;

    public Autor(String firstName, String lastName, String email, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return gender == autor.gender &&
                firstName.equals(autor.firstName) &&
                lastName.equals(autor.lastName) &&
                email.equals(autor.email);
    }

    @Override
    public int hashCode() {
        int result = 7;
        result = 31*result + firstName.hashCode();
        result = 31*result + lastName.hashCode();
        result = 31*result + email.hashCode();
        result = 31*result + Character.hashCode(gender);
        return result;
    }

    @Override
    public String toString() {
        return "{name = " + getName() +
                ", email= " + email +
                ", gender = " + gender +
                '}';
    }
}
