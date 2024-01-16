 class Get{  
public static void main(String args[]){  
String s1="ABCDEFG";  
byte[] barr=s1.getBytes();  
for(int i=0;i<barr.length;i++){  
System.out.println(barr[i]);  }
char[] charr=s1.toCharArray();
for(int i=0;i<charr.length;i++){  
System.out.println(charr[i]); 
}  
}
}