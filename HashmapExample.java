import java.util.*;


public class HashmapExample {
    String name;
    Integer employeeId;
    String email;
    String address;

    public HashmapExample(String name, Integer employeeId, String email, String address) {
        this.name = name;
        this.employeeId = employeeId;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return "HashmapExample{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashmapExample that = (HashmapExample) o;
        return Objects.equals(name, that.name) && Objects.equals(employeeId, that.employeeId) && Objects.equals(email, that.email) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employeeId, email, address);
    }

    public static void main(String[] args) {

        Map<HashmapExample , String> employee = new HashMap<>();

        employee.put( new HashmapExample("bikash", 269, "bikashroshan000@gmail.com", "rajendra nagar") , "bikash");
        employee.put(new HashmapExample("ravi", 2, "bkrprm@gamil.com", "chirondi") , "ravi");
        employee.put( new HashmapExample("bikash", 269, "bikashroshan000@gmail.com", "rajendra nagar") , "mukesh");

//        System.out.println(employee.get("bikash").equals(employee.get("mukesh")));
        System.out.println(employee);
    }

}