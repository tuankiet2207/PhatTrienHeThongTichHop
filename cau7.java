import java.io.*;
public class cau7{
        protected int ts,ms;
        cau7(){
        }
        cau7(int t, int m){
               ts=t;
               ms=m;
        }
        static int nhapgt() throws IOException{            
               InputStreamReader isr = new InputStreamReader(System.in);
               BufferedReader br = new BufferedReader(isr);
               String str = br.readLine();
               return Integer.valueOf(str).intValue();
        }     
        //Nhập phân số 1 và 2:
        cau7 nhapps(int x) throws IOException{
               int tu,mau;
               System.out.println("Nhập phân số: " +x);
               System.out.print("Tử số: ");
               tu=nhapgt();
               System.out.print("Mẫu số: ");
               do{
                       mau=nhapgt();
                       if(mau==0) System.out.print("Nhập lại mẫu số");
               }while(mau==0);
               cau7 ps = new cau7(tu,mau);
               return ps;
        }
        //Tìm ước chung lớn nhất:
        static int UCLN(int a, int b){
               while(a!=b){
                       if(a>b) a=a-b;
                       else b=b-a;
               }
               return a;
        }
        //Tối giản phân số:
        static cau7 toigian(cau7 ps){
            cau7 phanso = new cau7();
               phanso.ts = ps.ts/UCLN(Math.abs(ps.ts),Math.abs(ps.ms));
               phanso.ms = ps.ms/UCLN(Math.abs(ps.ts),Math.abs(ps.ms));
               return phanso;
        }
        //Nghịch đảo phân số
        static cau7 nghichdao(cau7 ps){
            cau7 phansond = new cau7();
            phansond.ts = ps.ms/UCLN(Math.abs(ps.ts),Math.abs(ps.ms));
            phansond.ms = ps.ts/UCLN(Math.abs(ps.ts),Math.abs(ps.ms));
            return phansond;
        }
        //Tính tổng:
        static cau7 tong(cau7 ps1, cau7 ps2){
            cau7 phanso = new cau7();
               phanso.ts= ps1.ts*ps2.ms + ps2.ts*ps1.ms;
               phanso.ms= ps1.ms*ps2.ms;
               if(phanso.ts!=0)
                       phanso=toigian(phanso);
               return phanso;
        }
        //Tính hiệu:
        static cau7 hieu(cau7 ps1, cau7 ps2){
            cau7 phanso = new cau7();
               phanso.ts = ps1.ts*ps2.ms - ps2.ts*ps1.ms;
               phanso.ms = ps1.ms*ps2.ms;
               if(phanso.ts!=0)
                       phanso = toigian(phanso);
               return phanso;
        }
        //Tính tích:
        static cau7 tich(cau7 ps1, cau7 ps2){
            cau7 phanso = new cau7();
               phanso.ts = ps1.ts*ps2.ts;
               phanso.ms = ps1.ms*ps2.ms;
               if(phanso.ts!=0)
                       phanso = toigian(phanso);
               return phanso;
        }
        //Tính thương
        static cau7 thuong(cau7 ps1,cau7 ps2){
            cau7 phanso=new cau7();
               phanso.ts = ps1.ts*ps2.ms;
               phanso.ms = ps1.ms*ps2.ts;
               if(phanso.ts!=0)
                       phanso=toigian(phanso);
               return phanso;
        }
        //Hàm hiển thị kết quả
        static void Hienthi(cau7 ps){
               if(ps.ts==0 || ps.ms==1) System.out.print(ps.ts);
               else System.out.println(ps.ts+"/"+ps.ms);
        }

        public static void main(String args[]) throws IOException{
            cau7 ps1 = new cau7();
            cau7 ps2 = new cau7();
               ps1=ps1.nhapps(1);
               ps2=ps2.nhapps(2);
               if(ps1.ts!=0)
                       ps1=toigian(ps1);
               if(ps2.ts!=0)
                       ps2=toigian(ps2);
               System.out.println("Tối giản phân số 1: "); Hienthi(ps1);
               System.out.println();
               System.out.println("Tối giản phân số 2: "); Hienthi(ps2);
               System.out.println();
               if(ps1.ts!=0)
                       ps1=nghichdao(ps1);
               if(ps2.ts!=0)
                       ps2=nghichdao(ps2);
               System.out.println("Nghịch đảo phân số 1: "); Hienthi(ps1);
               System.out.println();
               System.out.println("Nghịch đảo phân số 2: "); Hienthi(ps2);
               System.out.println();
               System.out.print("Tổng: "); Hienthi(tong(ps1,ps2));
               System.out.print("Hiệu: "); Hienthi(hieu(ps1,ps2));
               System.out.print("Tích: "); Hienthi(tich(ps1,ps2));
               if (ps2.ts!=0){
                       System.out.print("Thương(ps1/ps2): ");
                       Hienthi(thuong(ps1,ps2));
               }
               else System.out.print("Không thể chia ");
                       System.out.println();
               if (ps1.ts!=0){
                       System.out.print("Thương(ps2/ps1): ");
                       Hienthi(thuong(ps2,ps1));
                }
               else System.out.print("Không thể chia");
                       System.out.println();
            }
        }