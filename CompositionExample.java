public class CompositionExample {

    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("The job profile is " + employee.getJobProfile());
        System.out.println("The job location is " + employee.getCity());
    }
}
class Job{
    String jobProfile;
    int salary;
    String city;


    public String getJobProfile() {
        return jobProfile;
    }

    public void setJobProfile(String jobProfile) {
        this.jobProfile = jobProfile;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
class Employee{
    int age;
    private Job job;

    public  Employee() {
        this.job = new Job();  // we created associative inside the employee so if the main object set to null then job will deleted
        job.setJobProfile("engineer");
        job.setCity("ranchi");
    }
    public String getJobProfile() {
        return job.getJobProfile();
    }
    public  String getCity() {
        return job.getCity();
    }





}