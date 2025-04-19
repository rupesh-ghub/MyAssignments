package week3.day2;

public class WebElement {
	
	public void click()
	{
		System.out.println("Button is clicked");
	}
	
	public void setText (String text)
	{
		System.out.println(text);
		
	}
	

	public static void main(String[] args) {
		
		WebElement elements = new WebElement();
		elements.click();
		elements.setText("Calling from own class");

	}

}
