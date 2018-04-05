package test2;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jxl.*;
import jxl.read.biff.BiffException;
public class jxl {

static String sr;
	
static List<String> asq1=new ArrayList<String>();
static List<String> asq2=new ArrayList<String>();
static List<String> asq3=new ArrayList<String>();

static List<String> b21=new ArrayList<String>();
static List<String> b22=new ArrayList<String>();
static List<String> b23=new ArrayList<String>();

static List<String> b31=new ArrayList<String>();
static List<String> b32=new ArrayList<String>();
static List<String> b33=new ArrayList<String>();

static List<String> b11=new ArrayList<String>();
static List<String> b12=new ArrayList<String>();
static List<String> b13=new ArrayList<String>();
static List<String> b14=new ArrayList<String>();
static List<String> b15=new ArrayList<String>();
static List<String> b16=new ArrayList<String>();



public static List<String> f(List<String> as,String path){
	
	try {
		Workbook wb=Workbook.getWorkbook(new File(path));
	    Sheet a=wb.getSheet(0);
	    int x=a.getRows();
	    int y=a.getColumns();
		for(int i=0;i<y;i++) 
		  for(int j=0;j<x;j++) 
			{
				if(a.getCell(i,j).getContents().equals(null))
					as.add("not found");
				else
					as.add( a.getCell(i,j).getContents()); 
				
			}
		for(int r=0;r<x;r++) {
			
			System.err.println("<item>"+as.get(r)+"&#160;&#160;"+as.get(r+x)+"&#160;&#160;"+as.get(r+2*x)+"&#160;&#160;"+as.get(r+3*x)+"</item>");
			
			
			
		}
		
	
		
	} catch (BiffException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return as;
	
	
}
public static List<String> f2(List<String> p,int x,int y){
	
    p=p.subList(x, y);    
    return p;      
	}

public static void main(String[] args) {
  
	f(asq1,"F:\\Python\\\\zgdx_jsjxkpm.xls");

}
}
//	List<String> s1,s2,s3;
//	s1=f(asq1,"F:\\Python\\zgdxpm.xls");
//
//	s2=f(asq2,"F:\\Python\\zgdx_jsjxkpm.xls");
//
//	s3=f(asq3,"F:\\Python\\zgdx_shsypm.xls");
//	
//	
//	try {
//		 
//		b11=f2(s1,0,602);
//		b12=f2(s1,602,602*2);
//	    b13=f2(s1,602*2,602*3);
//	    b14=f2(s1,602*3,602*4);
//		b15=f2(s1,602*4,602*5);
//	    b16=f2(s1,602*5,602*6);
//		        
//		
//		
//	    b21=f2(s2,0,144);
//	    b22=f2(s2,144,288);
//	    b23=f2(s2,288,476);
//	    
//	    b31=f2(s3,0,357);
//	    b32=f2(s3,357,714);
//	    b33=f2(s3,1071,1428);
//	 for(int o=0;o<602;o++) {
//		 System.err.println(" p.add(r.getStringArray(R.array."+b12.get(o)+"));");
//	 }
//	
//	}
//	catch (Exception e) {
//		// TODO: handle exception
//	}
//}}
//   	       
//	    
//	    
	    
	    
//	    System.err.println(b11+"\n"+b12+"\n"+b13+"\n"+b14+"\n"+b15+"\n"+b16+"\n\n"+b21+"\n"+b22+"\n"+b23+"\n\n"+b31+"\n"+b32+"\n"+b33);
//	  for(int i=0;i<100;i++)
//	  { 
//		 int a =0,b =0;
//		 for(int x=1;x<144;x++)
//		 {
//			 if(b12.get(i).equals(b23.get(x)))
//				 a=x;
//		 }
//		 for(int x=1;x<357;x++)
//		 {
//			 if(b12.get(i).equals(b32.get(x)))
//				 b=x;
//		 }
//		  
//		System.err.println("  <string-array name="+'"'+b12.get(i)+'"'+">");
//	    System.err.println("    <item>"+b12.get(i)+"  "+"("+b13.get(i)+")"+"</item>");
//	    System.err.println("    <item>"+"排名   "+b11.get(i)+" "+b21.get(a)+" "+b31.get(b)+"</item>");
//	    System.err.println("    <item>"+"生源质量   "+b15.get(i)+"</item>");
//	    System.err.println("    <item>"+"就业率  "+b16.get(i)+"</item>");
//	    System.err.println("    <item>"+"社会捐赠(k)   "+b33.get(b)+"</item>");
//	    System.err.println("    <item>"+"学科   "+b22.get(a)+"</item>");
//	    System.err.println("    <item>"+"总分  "+b14.get(i)+"/100"+"</item>");
//	    System.err.println("</string-array>");
//	  }
//	  }catch (NullPointerException e) {
//		e.printStackTrace();
//		// TODO: handle exception
//	}
	


