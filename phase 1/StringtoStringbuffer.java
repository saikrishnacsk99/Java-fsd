package AssistedPractice;

public class StringtoStringbuffer {

public static void main(String[] args) {

String str = "INDIA IS MY COUNTRY";
StringBuffer sb= new StringBuffer(str);
System.out.println("Converted String to stringBuffer: "+sb);

//Conversion of StringtoStringbuilder{ 
String P[] = {"SAI KRISHNA", "PRAVEEN","DiGGU", "VINAY","VAMSI","ADITYA"};

StringBuilder S= new StringBuilder();

S.append(P[0]);

S.append("" +P[1]);

S.append("" +P[2]);

S.append(" " +P[3]);

S.append("" +P[4]);

S.append("" +P[5]);

System.out.println(S.toString());

}
}
