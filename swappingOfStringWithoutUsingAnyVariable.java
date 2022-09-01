class swappingOfStringWithoutUsingAnyVariable
{
public static void main()
{
String a = "Abc";
String b = "Xzy";

a=a+b;

b=a.substring(0, a.length()-b.substring());

a=a.substring(b.length());

System.out.println("Ist string value : - " + a);

System.out.println("2nd string value : - " + b);

}
}

