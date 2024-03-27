package Problems;

public class StrMethoDemo {
    public static void main(String[] args) {
        String str="Welcome All";
        System.out.println(str.substring(2));//substring-part of a string
        System.out.println(str.substring(3, 8));//being index imnclusive ,end index -exclusive
        System.out.println(str.toUpperCase());//converting to uppercase
        System.out.println(str.toLowerCase());//converting to lower case
        System.out.println(str.startsWith(" Wel"));//startswith
        System.out.println(str.endsWith("e All"));//ends with
        System.out.println(str.charAt(10));//charAt-check the character for the given index
        System.out.println(str.length());//length-should count from 1
        System.out.println(str.replace("All", "some"));
        System.out.println(str.replace('l','i'));
        float f = 3.567f;
        System.out.println(f+100);
        String str1= String.valueOf(f);// used to convert one datatype to string datatype
        System.out.println(str1+100);
        int i = 10;
        String str2= String.valueOf(i);
        System.out.println(str2+10);
        String str3="       avanthi              ";
        System.out.println(str3.trim());// trim-remove white spaces 

    }
    
}
