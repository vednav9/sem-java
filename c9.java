class Ex{
    void display()
    {
        try
        {
            int a=8/0;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Finally back");
        }
    }
}
class c9 {
    public static void main(String[] args) {
        Ex a=new Ex();
        a.display();
    }
}