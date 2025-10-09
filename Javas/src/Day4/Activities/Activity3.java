/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Thexe
 */
public class Activity3 {
    static String month,sign;
    static int date;

    public static void main(String[] args) {
        Activity3 get = new Activity3();
        get.Inputs();
        get.Zodiacs(); 
        System.out.println("Birthdate: " + month + " " + date);
        System.out.println("Zodiac Sign: " + sign);
        //End of Main Method         
    }


public void Zodiacs(){
/////////////JANUARY

    if(month.equalsIgnoreCase("January")){
        if(date >= 1 && date <= 19 ){
            sign = "♈ Capricornus (Goat): December 22 to January 19";
        }
        else if(date >= 20 && date <=31 ){
            sign = "♒ Aquarius (Water Bearer): January 20 to February 18";              
        }
    }
    
/////////////FEBUARY
    else if(month.equalsIgnoreCase("Febuary")){
        if (date >= 1 && date <= 18) {
            sign = "♒ Aquarius (Water Bearer): January 20 to February 18";            
        }
        else if (date >= 19 && date <= 28) {
            sign = "♓ Pisces (Fish): February 19 to March 20";
        }
    }

/////////////MARCH
else if(month.equalsIgnoreCase("March")){
    if (date >= 1 && date <= 20) {
        sign = "♓ Pisces (Fish): February 19 to March 20";            
    }
    else if (date >= 21 && date <= 31) {
        sign = "♈ Aries (Ram): March 21 to April 19";
    }
}

/////////////APRIL
else if(month.equalsIgnoreCase("April")){
    if (date >= 1 && date <= 19) {
        sign = "♈ Aries (Ram): March 21 to April 19";            
    }
    else if (date >= 20 && date <= 30) {
        sign = "♉ Taurus (Bull): April 20 to May 20 here";
    }
}

/////////////May
else if(month.equalsIgnoreCase("May")){
    if (date >= 1 && date <= 20) {
        sign =  "♉ Taurus (Bull): April 20 to May 20 here";            
    }
    else if (date >=21 && date <= 31) {
        sign = "♊ Gemini (Twins): May 21 to June 21";
        }
}

/////////////June
else if(month.equalsIgnoreCase("June")){
    if (date >= 1 && date <= 21) {
        sign =  "♉♊ Gemini (Twins): May 21 to June 21 here";            
    }
    else if (date >=22 && date <= 30) {
        sign = "♋ Cancer (Crab): June 22 to July 22";
        }
}

////////////July
else if(month.equalsIgnoreCase("July")){
    if (date >= 1 && date <= 22) {
        sign =  "♋ Cancer (Crab): June 22 to July 22";            
    }
    else if (date >=23 && date <= 31) {
        sign = "♌ Leo (Lion): July 23 to August 22";
        }
}

////////////August
else if(month.equalsIgnoreCase("August")){
    if (date >= 1 && date <= 22) {
        sign =  "♌ Leo (Lion): July 23 to August 22here";            
    }
    else if (date >=23 && date <= 31) {
        sign = "♍ Virgo (Virgin): August 23 to September 22 ";
        }
}
////////////September
else if(month.equalsIgnoreCase("September")){
    if (date >= 1 && date <= 22) {
        sign =  "♌ Virgo (Virgin): August 23 to September 22";            
    }
    else if (date >=23 && date <= 30) {
        sign = "♎ Libra (Balance): September 23 to October 23";
        }
}
////////////October
else if(month.equalsIgnoreCase("October")){
    if (date >= 1 && date <= 23) {
        sign =  "♎ Libra (Balance): September 23 to October 23";            
    }
    else if (date >=24 && date <= 31) {
        sign = "♎♏ Scorpius (Scorpion): October 24 to November 21";
        }
}

////////////November
else if(month.equalsIgnoreCase("November")){
    if (date >= 1 && date <= 21) {
        sign =  "♎♏ Scorpius (Scorpion): October 24 to November 21";            
    }
    else if (date >=22 && date <= 30) {
        sign = "♐ Sagittarius (Archer): November 22 to December 21";
        }
}
////////////December
else if(month.equalsIgnoreCase("December")){
    if (date >= 1 && date <= 21) {
        sign =  "♐ Sagittarius (Archer): November 22 to December 21 done";            
    }
    else if (date >=22 && date <= 31) {
        sign = "♑ Capricornus (Goat): December 22 to January 1 to ";
        }
}

//END OF ZODIACS
}

public void Inputs() {

    Scanner scan = new Scanner(System.in);
    System.out.print("Please Input Your Birth Month: "); month = scan.nextLine().trim().toLowerCase();
    System.out.print("Please Input Your Date of Birth: "); date = scan.nextInt(); 
    scan.close();
}


//END OF CLASS
}

/* 
 * 
 * ♈ Aries (Ram): March 21–April 19 DONE
♉ Taurus (Bull): April 20–May 20 DONE
♊ Gemini (Twins): May 21–June 21 DONE
♋ Cancer (Crab): June 22–July 22 DONE
♌ Leo (Lion): July 23–August 22 DONE
♍ Virgo (Virgin): August 23–September 22 done
♎ Libra (Balance): September 23–October 23 done
♏ Scorpius (Scorpion): October 24–November 21 done
♐ Sagittarius (Archer): November 22–December 21 done
♑ Capricornus (Goat): December 22–January 19 DONE
♒ Aquarius (Water Bearer): January 20–February 18 okay done all
♓ Pisces (Fish): February 19–March 20 DONE ALL
 * 
 * 
 * 
 * 
*/
