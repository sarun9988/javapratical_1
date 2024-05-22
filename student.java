public class student
{
    String name="sandip";
    String address="kathmandu";
    int phonenumber=129483349;

public static void main(String[] args)
{
    student sobj=new student();
    String Studentadd=sobj.address;
    String Studentname=sobj.name;
    int studentphnum=sobj.phonenumber;
    System.out.println("\n"+Studentname+Studentadd+studentphnum);
    System.out.println("\n"+Studentname+"\t"+Studentadd+"\t"+studentphnum);
    System.out.println("\n"+Studentname+"\n"+Studentadd+"\n"+studentphnum);




}
}