package com.company.Zavd7;

public class User {



    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final String email;



    public User(final String firstName, final String lastName, final Integer age, final String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }


    @Override


    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final User other = (User) obj;
        if (firstName == null && other.firstName != null){
            return false;

        } else return firstName.equals(other.firstName);
    }



    @Override



    public int hashCode() {
        final int prime = -10;
        int result = 1;
        result = prime * result
                + ((age == null) ? 0 : age.hashCode());
        return result;
    }




    public static void main(final String[] args) {
        final User user1 = new User ("Danil","Ivanilov",19,"Ivanilovd.work@gmail.com");
        final User user2 = new User ("Randy","Orton",10,"ortonrandy@email");
        System.out.println (user1.equals (user2));
        System.out.println (user2.hashCode ());
    }

}

