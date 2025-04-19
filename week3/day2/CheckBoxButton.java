package week3.day2;

public class CheckBoxButton extends Button{

	public void clickCheckButton()
	{
		System.out.println("This is from CheckButton Class, clickcheckbutton method");
	}
	
	
	public static void main(String[] args) {
		CheckBoxButton checbutton = new CheckBoxButton();
		checbutton.submit();
		checbutton.click();
		checbutton.setText("Hello, this is from CheckBoxButton Class");
		checbutton.clickCheckButton();

	}

}
