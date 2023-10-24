package homework_week_7;

/**
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 * If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
 * otherwise return false.
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 */


public class Programme_4DaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            return true;
        }else {
            return false;
        }

    }
      public static int getDaysInMonth(int month, int year){
        if (month < 1 || month > 12 || year < 1 || year >9999){
            return -1;
        }
        int daysInMonth;
        switch (month){
            case 1: //January
            case 3: //March
            case 5: //May
            case 7: //July
            case 8: //August
            case 10: //October
            case 12: //December
            daysInMonth = 31;
            break;

            case 4: //April
            case 6: //June
            case 9: //September
            case 11: //November
                daysInMonth = 30;
                break;

            case 2: //February
                if (isLeapYear(year)){
                    daysInMonth = 29;
                }else{
                    daysInMonth = 28;
                }
                break;
            default:
                daysInMonth = -1;
        }
        return daysInMonth;
      }

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600)); //should return false
        System.out.println(isLeapYear(1600));  //should return true
        System.out.println(isLeapYear(2017));  //should return false
        System.out.println(isLeapYear(2000));  //should return true

        System.out.println(getDaysInMonth(1, 2020)); //should return 31
        System.out.println(getDaysInMonth(2,2020));  //should return 29
        System.out.println(getDaysInMonth(2,2018));  //should return 28
        System.out.println(getDaysInMonth(-1,2020)); //should return -1
        System.out.println(getDaysInMonth(1,-2020)); //should return -1
    }

}
