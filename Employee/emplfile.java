import java.util.*;
import java.io.*;
import java.time.Year;
class emplfile
{
   public static void main(String[] args) throws IOException,ClassNotFoundException
    {
    FileOutputStream f = new FileOutputStream("employee.ser");
    ObjectOutputStream o = new ObjectOutputStream(f);

    ArrayList<employeefile> a = new ArrayList<>();
    a.add(new employeefile("Harish",10000,2018));
    a.add(new employeefile("Javid",10000,2018));
    o.writeObject(a);

    f.close();
    o.close();
    FileInputStream fi = new FileInputStream("employee.ser");
    ObjectInputStream oi = new ObjectInputStream(fi);

    ArrayList<employeefile> b = new ArrayList<>();
    b=(ArrayList<employeefile>) oi.readObject();

    for(employeefile e : b)
    {
    e.getter();
    if(Year.now().getValue()-e.getyr()>=2)
    e.setter();
    e.getter();
    }
    }
}