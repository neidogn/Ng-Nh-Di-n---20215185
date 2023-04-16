import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year, monthNumber, daysInMonth;
        String monthName;
        while (true) {
            System.out.print("Enter the year (non-negative integer): ");
            year = scanner.nextInt();
            if (year >= 0) {
                break;
            }
            System.out.println("Invalid year! Please enter again.");
        }
        while (true) {
            System.out.print("Enter the month (full name, abbreviation, 3-letter code, or number): ");
            String monthStr = scanner.next();
            switch (monthStr.toLowerCase()) {
                case "january":
                case "jan":
                case "1":
                    monthNumber = 1;
                    monthName = "January";
                    break;
                case "february":
                case "feb":
                case "2":
                    monthNumber = 2;
                    monthName = "February";
                    break;
                case "march":
                case "mar":
                case "3":
                    monthNumber = 3;
                    monthName = "March";
                    break;
                case "april":
                case "apr":
                case "4":
                    monthNumber = 4;
                    monthName = "April";
                    break;
                case "may":
                case "5":
                    monthNumber = 5;
                    monthName = "May";
                    break;
                case "june":
                case "jun":
                case "6":
                    monthNumber = 6;
                    monthName = "June";
                    break;
                case "july":
                case "jul":
                case "7":
                    monthNumber = 7;
                    monthName = "July";
                    break;
                case "august":
                case "aug":
                case "8":
                    monthNumber = 8;
                    monthName = "August";
                    break;
                case "september":
                case "sep":
                case "9":
                    monthNumber = 9;
                    monthName = "September";
                    break;
                case "october":
                case "oct":
                case "10":
                    monthNumber = 10;
                    monthName = "October";
                    break;
                case "november":
                case "nov":
                case "11":
                    monthNumber = 11;
                    monthName = "November";
                    break;
                case "december":
                case "dec":
                case "12":
                    monthNumber = 12;
                    monthName = "December";
                    break;
                default:
                    monthNumber = 0;
                    monthName = "";
                    break;
            }
            if (monthNumber >= 1 && monthNumber <= 12) {
                break;
            }
            System.out.println("Invalid month! Please enter again.");
        }
        boolean isLeapYear = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        switch (monthNumber) {
            case 2:
                daysInMonth = isLeapYear ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            default:
                daysInMonth = 31;
                break;
        }
        System.out.printf("There are %d days in %s %d.", daysInMonth, monthName, year);
        scanner.close();
    }
}
