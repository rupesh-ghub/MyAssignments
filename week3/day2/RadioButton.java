package week3.day2;

public class RadioButton extends Button {
	
	public void selectRadioButton()
	{
		System.out.println("This is from RadioButton Class, selectradiobutton method");
				
	}

	public static void main(String[] args) {
		RadioButton buttonOptions = new RadioButton();
		buttonOptions.submit();
		buttonOptions.click();
		buttonOptions.setText("Hello, this is from Radio Button Class");
		buttonOptions.selectRadioButton();

	}

}
