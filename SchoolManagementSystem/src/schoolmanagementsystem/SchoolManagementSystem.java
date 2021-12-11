/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagementsystem;
import java.util.*;


/**
 *
 * @author pc
 */
abstract class Person {
    String name;
    String age;
    
    public abstract void SetData(String n,String a);
    
}
class Teacher extends Person{
    
    String salary;
    String grad_degree;
    String grad_year;
    String yrs_exp;
    String subject;
    public Teacher(String n,String a, String salary,String grad_degree,String grad_year, String yrs_exp,String subject){
        SetData(n,a);
        this.salary=salary;
        this.grad_degree=grad_degree;
        this.grad_year=grad_year;
        this.yrs_exp=yrs_exp;
        this.subject=subject;
    }
    @Override
    public void SetData(String n,String a){
        name=n;
        age=a;
       
    }

    public String getSalary() {
        return salary;
    }

    public void updateSalary(String salary) {
        this.salary = salary;
    }
    public String DisplayTeacher(){
        return "Name: "+name+" Age: "+age+" Salary: "+salary+" Graduation Degree: "
                +grad_degree+" Graduation Year: "+grad_year+" Years of experience: "+yrs_exp+"Subject: "+subject;
        
    }
    
}
class Class{
    String nm;
    Teacher t;
    
    
    public Class(String nm){
    this.nm=nm;
    
        
        
}
    
}

public class SchoolManagementSystem {

    Class []classes; //fixed number of classes
    List<Teacher> t_list;
    
    public void AddToSchool(List<Teacher> l1){
        l1=new ArrayList<>();
        l1=t_list;
        
    }
    public List<Teacher> getArraylist(){
        return t_list;
    }
    /* public void AddToSchool(List<Student> l2){
        l2=new ArrayList<>();
    }*/
   
}
