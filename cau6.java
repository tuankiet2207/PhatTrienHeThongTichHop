import java.io.*;
public class cau6
{
    int a,b,c ;
    static int tg1,tg2,vt1,vt2 ;
    cau6(){} ;
    cau6(int x,int y)
    {
        a=x;
        b=y;
        
    }
    //Tính khoảng cách
    public static double khoangcach(cau6 g,cau6 h)
    {
        double kc;
        kc=Math.sqrt( ((h.a-g.a)*(h.a-g.a)) + ((h.b-g.b)*(h.b-g.b)) );
        return kc;
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
        String s ;
        cau6 toado1,toado2 ;
        int x,y ;
            //Nhập toạ độ từ bàn phím
        System.out.print("Nhập toạ độ điểm A");
        System.out.print("\nToạ độ x1: ");
            s=d.readLine();
            x=Integer.parseInt(s);
        System.out.print("Toạ độ y1: ");
            s=d.readLine();
            y=Integer.parseInt(s);
        toado1=new cau6(x,y);
        System.out.print("Toạ độ diem A"+"("+toado1.a+","+toado1.b+""+")");

        System.out.print("\nNhap Toạ độ điểm B");
        System.out.print("\nToạ độ x2: ");
            s=d.readLine();
            x=Integer.parseInt(s);
        System.out.print("Toạ độ y2: ");
            s=d.readLine();
            y=Integer.parseInt(s);
        toado2=new cau6(x,y);
        System.out.print("Toạ độ điểm B"+"("+toado2.a+","+toado2.b+""+")");

            // In toạ độ
        System.out.print("\nToạ độ của 3 điểm A,B: ");
        System.out.print("\n A"+"("+toado1.a+","+toado1.b+""+")");
        System.out.print("\n B"+"("+toado2.a+","+toado2.b+""+")");
    

            //Khoảng cách
        System.out.print("\nKhoảng cách 2 điểm trong Toạ độ: ");
        System.out.print("\nAB: ");
        System.out.print(cau6.khoangcach(toado1,toado2));

           
  
    }
}