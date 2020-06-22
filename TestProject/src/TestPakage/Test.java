package TestPakage;

import org.openqa.selenium.WebElement;

public class Test {
	public static boolean isElementSelected(WebElement element, boolean expStatus) {
		boolean bStatus = false;
		try {
			highlight(element);
			boolean b = element.isSelected();
			if(b == expStatus) bStatus = true;
		}
		catch(Exception e) {
			bStatus = false;
		}
		return bStatus;
	}
}
