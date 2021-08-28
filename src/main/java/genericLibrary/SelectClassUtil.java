package genericLibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
/***
 * 
 * @author Sumanth
 *
 */
public class SelectClassUtil {

	/***
	 * This method will select drop down based on index, value and visible text
	 * @param listbox pass the drop down element 
	 * @param data it can be index or value or visible text
	 */
	public void selectDropDownByVisibleText(WebElement listbox, String data) {		
		Select select = new Select(listbox);
		int counter=0;

		try {
			int index = Integer.parseInt(data);
			select.selectByIndex(index);
			counter++;
		} catch(Exception e) {
			System.out.println("It is not a index");
		}
		
		if(counter==0) {
			try {
				select.selectByVisibleText(data);
			} catch(Exception e) {
				select.selectByValue(data);
			}
		}
	}
}
