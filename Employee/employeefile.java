import java.io.*;

public class employeefile implements Serializable
{
    int salary,yrofjoining;
    String name;
    public employeefile(String n,int s,int yr)        
    {
        this.salary=s;
        this.name=n;
        this.yrofjoining=yr;
    }
    public void getter()
    {
        System.out.println(this.name+" "+this.salary+" "+this.yrofjoining);
    }
    public int getyr()
    {
        return this.yrofjoining;
    }
    public void setter()
    {
        this.salary=this.salary+(3*salary)/100;
    }
}
