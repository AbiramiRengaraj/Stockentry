import java.util.*;
class StockEntry
{
    Scanner sc=new Scanner(System.in);
    static int id=1;
    static ArrayList<String>pname=new ArrayList<String>();
    static ArrayList<Integer>pid=new ArrayList<Integer>();
    static ArrayList<Integer>price=new ArrayList<Integer>();
    static ArrayList<Integer>qty=new ArrayList<Integer>();
    
    void menu()
    {
        System.out.println("1.Add\n2.Update\n3.Delete");
        int choice=sc.nextInt();
        if(choice==1)
        {
            this.add();
        }
        else if(choice==2)
        {
            this.update();
        }
        else
        {
            this.delete();
        }
    }
    
    void add()
    {
       pid.add(id);
       System.out.println("Enter Product Name:");
       pname.add(sc.next());
       System.out.println("Enter Price:");
       price.add(sc.nextInt());
       System.out.println("Enter Quantity:");
       qty.add(sc.nextInt());
       System.out.println("Added Successfully");
       id++;
    }
     void update()
    {
     
       System.out.println("Enter Product id:");
       int x=sc.nextInt();
       int z=0;
       boolean f=true;
       for(int i=0;i<pid.size();i++)
       {
           if(x==pid.get(i))
           {
               z=i;
               f=false;
               break;
           }
       }
       if(f)
       {
           System.out.println("Invalid ID");
       }
       else{
       System.out.println("Enter new Quantity:");
       qty.set(z,sc.nextInt());
       System.out.println("Enter new Price:");
       price.set(z,sc.nextInt());
       System.out.println("Updated Successfully");
       }
    }
    void delete()
    {
       System.out.println("Enter Product id:");
       int x=sc.nextInt();
       int z=0;
       boolean f=true;
       for(int i=0;i<pid.size();i++)
       {
           if(x==pid.get(i))
           {
               z=i;
               f=false;
               break;
           }
       }
       if(f)
       {
           System.out.println("Invalid ID");
       }
       else
       {
       pname.remove(z);
       pid.remove(z);
       qty.remove(z);
       price.remove(z);
       System.out.println("Removed Successfully");
       }
    }

}
class BillEntry extends StockEntry
{
    void test()
    {
        for(int i=0;i<pname.size();i++)
        {
            
            System.out.println(pname.get(i));
            System.out.println(pid.get(i));
            System.out.println(price.get(i));
            System.out.println(qty.get(i));
            
        }
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int o;
	    ArrayList<String> cashier=new ArrayList<String>();
	    ArrayList<Integer> cid=new ArrayList<Integer>();
	    do
	    {
		System.out.println("1.Owner\n2.Cashier\n3.Exit");
		int n=sc.nextInt();
		    if(n==1)
		    {
		        System.out.println("Welcome Admin\n1.Report\n2.Add Cashier");
		        int x=sc.nextInt();
		        if(x==2)
		        {
		            System.out.println("Enter Cashier Name:");
		            cashier.add(sc.next());
		            System.out.println("Enter Cashier ID:");
		            cid.add(sc.nextInt());
		        }
		        else
		        {
		            
		        }
		    }
		    else if(n==2)
		    {
		        
		        System.out.println("Enter your ID:");
		        int x=sc.nextInt();
		        boolean f=true;
		        for(int i=0;i<cid.size();i++)
		        {
		            if(x==cid.get(i))
		            {
		                //method
		                System.out.println("1.Stock\n2.Bill");
		                int opt=sc.nextInt();
		               
		                if(opt==1)
		                {
		                    StockEntry se=new StockEntry();
		                    se.menu();
		                }
		                else
		                {
		                    BillEntry be=new BillEntry();
		                    be.test();
		                    //method
		                }
		                f=false;
		                break;
		            }
		        }
		        if(f)
		        {
		            System.out.println("");
		        }
		    }
		    else
		    break;
		    System.out.println("Press 1 to 0 to exit");
		     o=sc.nextInt();
	    }while(o!=0);
	}
}

