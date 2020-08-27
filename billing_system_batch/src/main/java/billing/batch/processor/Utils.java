package billing.batch.processor;

import java.time.LocalDate;

public class Utils {

	public static Integer nextMonth() {
		LocalDate current = LocalDate.now();
		LocalDate next = current.plusMonths(1);
		return next.getMonthValue();
	}

	public static String formatAmount(int d) {
		return String.format("%,d", d).replace(',', '.');
	}
}
