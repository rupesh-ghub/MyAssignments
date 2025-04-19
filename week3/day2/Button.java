package week3.day2;

public class Button extends WebElement{

	public void submit()
	{
		System.out.println("This is from Button Class, submit method");
	}
	
	public static void main(String[] args) {
		Button buttonOptions = new Button();
		buttonOptions.click();
		buttonOptions.setText("This is from Button Class, calling WebElement class methods");
		buttonOptions.submit();

	}

}
