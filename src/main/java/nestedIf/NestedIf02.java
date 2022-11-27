package main.java.nestedIf;

public class NestedIf02 {
    public static void main(String[] args) {

        /*
            Password'un ilk harfi buyuk harf ise
                'A' olursa gecerli password aksi halde gecersiz password
            Password'un ilk harfi kucuk harf ise
                'z' olursa gecerli password aksi halde gecersiz password
         */

        //NestedIf ın olayı ıf ıçınde if

        String pwd = "Axy7!";

        if (pwd.charAt(0)>='A' && pwd.charAt(0)<= 'Z') {

            if (pwd.charAt(0) == 'A') {
                System.out.println("gecerli password");
            } else {
                System.out.println("gecersiz password");
            }

        } else if (pwd.charAt(0)>='a'&& pwd.charAt(0)<='z') {

            if (pwd.charAt(0)=='z'){
                System.out.println("gecerli password");
        }else {
                System.out.println("gecersiz passord");
            }
        }else {
            System.out.println("ilk karakter harf omalidir");
        }
    }
}
