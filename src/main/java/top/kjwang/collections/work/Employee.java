package top.kjwang.collections.work;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kjwang
 * @Date 2023/3/9 18:42
 */
public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        //定义ArrayList对象
        ArrayList eList=new ArrayList();
        //创建三个Employee类的对象
        Employee e1=new Employee(1,"张三",5000.0);
        Employee e2=new Employee(2,"李四",5500.0);
        Employee e3=new Employee(3,"赵六",4000.0);
        //添加员工信息到ArrayList中
        eList.add(e1);
        eList.add(e2);
        eList.add(e3);
        //显示员工的姓名和薪资
        System.out.println("员工姓名"+"  "+"员工薪资");
        for(int i=0;i<eList.size();i++){
            System.out.println(((Employee)(eList.get(i))).getName()+"      "+((Employee)(eList.get(i))).getSalary());
        }
//        System.out.println(eList.toString());
    }
}
