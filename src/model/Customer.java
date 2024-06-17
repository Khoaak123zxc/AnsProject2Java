package model;

public class Customer extends Person{
    private String country;

    public Customer(String name, String age, String sex, String country) {
        super(name, age, sex);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    @Override
    public String toString() {
        return "Customer [name=" + name + ", country=" + country + ", age=" + age + ", sex=" + sex + "]";
    }

    @Override
    public void language() {
        if(country.equalsIgnoreCase("USA"))
            System.out.println("English");
        else if(country.equalsIgnoreCase("Vietnam"))
            System.out.println("Vietnamese");
        else
            System.out.println("Japanese");
    }
    
}
