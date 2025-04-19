package week3.day2;

public class TextField extends WebElement{
	
	public void getText() 
	{
		System.out.println("Hello, this is from TextField Class, gettext method");
	}

	public static void main(String[] args) {
		TextField fieldOptions = new TextField();
		fieldOptions.click();
		fieldOptions.setText("Hello, this is from TextField Class");
		fieldOptions.getText();

	}

}
