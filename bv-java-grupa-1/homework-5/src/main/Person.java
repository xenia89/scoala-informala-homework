package main;

public class Person {
    private String name;
    private String cnp;
    private boolean insured;
    private String date;

    public Person(String name, String cnp, boolean insured, String date) {
        this.name = name;
        this.cnp = cnp;
        this.insured = insured;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getCnp() {
        return cnp;
    }

    public boolean isInsured() {
        return insured;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        boolean asig = isInsured();
        if (asig) {
            return "The name is " + name + " the CNP is " + cnp + " and the person is insured, " +"the insurance date started " + date + " ,the CID is " + hashCode();
        } else {
            return "The name is " + name + " the CNP is " + cnp + " and the person is not insured!"+ " the CID is "+hashCode();
        }
    }


    @Override
    public boolean equals(final Object o) {
        if (o == null) {
            return false;
        } else if (o instanceof Person && this.cnp.equals(((Person) o).getCnp())) {
            return true;
        }
        return false;

    }

    @Override
    public int hashCode() {
        int cid = (int) Long.parseLong(cnp.substring(2), 16);
        return cid;
    }

}
