package tutorial;

public class JavaString {
    public static void main(String[] args) {
        String txt = "ikwamoPI NWiunamoON JWNAkaPMACANM apple WAdawedAAASWda SDawdadasAWdSDf";
        System.out.println("Length of text is " + txt.length());

        System.out.println("Upper case: " + txt.toUpperCase());
        System.out.println("Lower case: " + txt.toLowerCase());

        System.out.println("Start index of apple is " + txt.indexOf("apple"));


        String firstName = "Bolat ";
        String lastName = "Abdulaziz";

        System.out.println("Concat firstName and lastName: " + firstName.concat(lastName));

        int a = 10;
        String b = "23";
        System.out.println(a+b);


        System.out.println("\nSpecial Characters: ");
        System.out.println("We cannot print \" without \\, cause it is special character");
        System.out.println("Apple,\tbanana,\ncherry,\bpeach,\n\r,pear,\f");
    }
}
