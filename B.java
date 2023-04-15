public class B extends A{
    void run()
    {
        // A.super();
        System.out.println("From Class B");
    }
    void prnt(int i)
    {
        System.out.println(i);
    }
    void prnt(int i,int j)
    {
        System.out.println(i+j);
    }
//    int prnt(int i,int j)
//    {
//        int c=i+j;
//        return(c);
//    }
}
