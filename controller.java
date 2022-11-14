import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class controller {
    private ArrayList<Employee> allEmployee;
    private ArrayList<Customer> allCustomer;

    public controller()
    {
        allEmployee=new ArrayList<>();
        allCustomer=new ArrayList<>();
    }
    public boolean addEmployee(int i, String n,int a, int p, double s)
    { Employee e=new Employee(i,n,a,p,s);
        allEmployee.add(e);
        return true;
    }
    public boolean addCustomer(int i, String n,int a, int ph, int p,int rnum)
    { Customer c=new Customer(i,n,a,ph,p,rnum);
        allCustomer.add(c);
        return true;
    }
    public ArrayList<Employee> getAllEmployee()
    {
        return allEmployee;
    }
    public ArrayList<Customer>getAllCustomer()
    {
        return allCustomer;
    }
    public  Employee searchForEmployee(int id)
    {
        boolean found=false;
        int i=0;
        while (!found&&i<allEmployee.size())
        {
            if (allEmployee.get(i)!=null) {
                if (allEmployee.get(i).getId() == id)
                    found = true;
                else i++;
            }
            else i++;
        }
        if (i<allEmployee.size())
            return allEmployee.get(i);
        else return null;
    }
    public  Customer searchForCustomer(int id)
    {
        boolean found=false;
        int i=0;
        while (!found&&i<allCustomer.size())
        {
            if (allCustomer.get(i)!=null) {
                if (allCustomer.get(i).getId() == id)
                    found = true;
                else i++;
            }
            else i++;
        }
        if (i<allCustomer.size())
            return allCustomer.get(i);
        else return null;
    }
    public void readEmployeeFile()
    {
        try {
            Scanner in= new Scanner(new File("D:\\Employee1.txt"));
            while (in.hasNext())
            {
                int i= in.nextInt();
                String n=in.next();
                int a=in.nextInt();
                int p=in.nextInt();
                double s=in.nextDouble();
                addEmployee(i,n,a,p,s);
            }
            in.close();

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Error in reading file "+e.getMessage());        }
    }
    public void readCustomerFile()
    {
        try {
            Scanner in= new Scanner(new File("D:\\Customer1.txt"));
            while (in.hasNext())
            {
                int i= in.nextInt();
                String n=in.next();
                int a=in.nextInt();
                int ph=in.nextInt();
                int p=in.nextInt();
                int rnum=in.nextInt();
                addCustomer(i,n,a,ph,p,rnum);
            }
            in.close();

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Error in reading file "+e.getMessage());        }
    }
    public boolean writeEmployee()
    {
        try{
            PrintWriter writer= new PrintWriter(new File("D:\\Employee1.txt"));

            for (Employee x:allEmployee) {

                writer.write(x.getId()+" "+x.getName()+" "+x.getAge()+" "+ x.getPhon()+""+x.calculatevalue()+""+x.getSalary()+"\n");
            }
            writer.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return true;
    }
    public boolean writeCustomer()
    {


        try{
            PrintWriter writer= new PrintWriter(new File("D:\\Customer1.txt"));

            for (Customer x:allCustomer) {

                writer.write(x.getId()+" "+x.getName()+" "+x.getAge()+" "+ x.getPhon()+""+x.getPrice()+""+x.getRoomofnum()+" "+x.calculatevalue()+"\n");
            }
            writer.close();


        } catch (FileNotFoundException c) {
            c.printStackTrace();
        }
        return true;
    }

}
