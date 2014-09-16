package apcsweek2;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of days in the month: ");
		int numDays = scan.nextInt();
		System.out.print("Enter first Sunday of the month: ");
		int firstSunday = scan.nextInt();
		MonthlyCalendar mc = new MonthlyCalendar(firstSunday, numDays);
		mc.print();
	}
}

class MonthlyCalendar {

	private int firstSunday;
	private int numDays;

	public MonthlyCalendar(int firstSunday, int numDays) {
		this.firstSunday = firstSunday;
		this.numDays = numDays;
	}

	public void print() {
		printHeader();
		printDivider();
		int lastDayOfFirstWeek = printFirstWeek();
		for (int i = lastDayOfFirstWeek; i <= numDays; i = i + 7) {
			printWeek(i);
		}
		printDivider();
	}

	private void printHeader() {
		System.out.println("  Sun    Mon    Tue    Wed    Thur    Fri    Sat");
	}

	private void printDivider() {
		System.out
				.println("+------+------+------+------+------+------+------+");
	}

	private int getOffsetForFirstWeek() {
		return 7 - firstSunday;
	}

	private int printFirstWeek() {
		int offSet = getOffsetForFirstWeek();
		for (int i = 0; i < offSet + 1; i++) {
			System.out.print(getPaddedBlankSpace());
		}
		int j = 1;
		for (; j < 7 - offSet; j++) {
			System.out.print("|" + getPaddedNumber(j));
		}
		System.out.println();
		return j;
	}

	private void printWeek(int startDate) {
		for (int i = 1; i <= 7 && startDate <= numDays; i++) {
			System.out.print("|" + getPaddedNumber(startDate++));
		}
		System.out.println();
	}

	private String getPaddedBlankSpace() {
		return "|      ";
	}

	private String getPaddedNumber(int num) {
		if (num <= 9) {
			return "  " + num + "   ";
		} else {
			return " " + num + "   ";
		}
	}

}