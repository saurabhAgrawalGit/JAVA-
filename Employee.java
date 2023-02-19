public class emp {
    String fname;
    String lname;
    int  emp_code;
    int salary;
    emp(String fname, String lname, int emp_code, int salary)
    {
        this.fname= fname;
        this.lname = lname;
        this.emp_code=emp_code;
        this.salary= salary;
    }

    public int getEmp_code() {
        return emp_code;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int  Salary12() {
        return  12*salary;
    }
    void newsalary(int per)
    {
        this.salary= salary+((salary/100)*per);
    }

    //@Override
    public String toString() {
        return "NAME "+ fname+" "+lname+" Employee code "+emp_code+" Salary "+salary;
    }

    public static void main(String[] args) {
        System.out.println("hello ");
        emp ob = new emp("saurabh","agrawal",153,20000);
        System.out.println(ob.getFname());
        System.out.println(ob.getLname());
        System.out.println(ob.getEmp_code());
        System.out.println(ob.getSalary());
        System.out.println(ob.Salary12());
        ob.newsalary(12);
        System.out.println(ob.getSalary());
        System.out.println(ob.toString());


    }
}
