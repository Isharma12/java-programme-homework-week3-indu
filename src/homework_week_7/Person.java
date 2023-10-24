package homework_week_7;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 */

public class Person {String firstName;
    String lastName;
    int age;

    //method to get firstname
    public String getFirstName() {
        return firstName;
    }

    //method to get last name
    public String getLastName() {
        return lastName;
    }

    //method to get age
    public int getAge() {
        return age;
    }

    //method to set firstname
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    //method to set last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //method to set age, considering the specified constrains
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    //method to check if the person is a teen
    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    //method to get the full name of the person
    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return " ";
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());

        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());

        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
}

