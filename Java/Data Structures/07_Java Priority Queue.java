
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Collections;

class Student implements Comparable<Student>
{
    private int id;
    private String name;
    private double cgpa;
    public Student(int id,String name,double cgpa)
    {
        super();
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getCgpa() {
        return cgpa;
    }
    
    public int compareTo(Student o)
    {
        if(this.cgpa != o.cgpa)
        return Double.compare(o.cgpa,this.cgpa);
        else if(!this.name.equals(o.name))
        return this.name.compareTo(o.name);
        else
        return this.id - o.id;
        
    }
}
class Priorities
{
    public List<Student> getStudents(List<String> e)
    {
        PriorityQueue<Student> kiyas = new PriorityQueue<>();
        for(String i : e)
        {
            String[] bolme = i.split(" ");
            if(bolme[0].equals("ENTER"))
            {
                String isim=bolme[1];
                double cgpa = Double.parseDouble(bolme[2]);
                int id = Integer.parseInt(bolme[3]);
                kiyas.add(new Student(id,isim,cgpa));
            }
            else
               kiyas.poll();
        }
        List<Student> ogrenciler = new ArrayList<>();
        while(!kiyas.isEmpty())
        ogrenciler.add(kiyas.poll());
        return ogrenciler;
    }
}
