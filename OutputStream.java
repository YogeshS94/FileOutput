import java.io.*;
class OutputStream{  
  public static void main(String args[]){  
   try{  
     FileOutputStream fout=new FileOutputStream("E:\\abc.txt");  
     String s="Sachin Tendulkar is my favourite player";  
     byte b[]=s.getBytes(); 
     fout.write(b);  
     fout.close();  
     System.out.println("success...");  
    }catch(Exception e){System.out.println(e);}  
  }  
} 