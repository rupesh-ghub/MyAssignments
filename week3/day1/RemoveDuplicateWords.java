package week3.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
	int count=0;
	String text = "We learn Java basics as part of java sessions in java week1";
	String delimiter = " ";
	String dupwords [] = text.split(delimiter);
	for(int i=0; i<dupwords.length; i++)
	{
		for (int j=i+1; j<dupwords.length; j++)
		{
			if (dupwords[i].equalsIgnoreCase(dupwords[j]))
			{
				dupwords[j] = " ";
				count = count+1;
			}
			else
			{
				continue;
			}
		}
	}
	if (count>=1)
	{
		for (int i=0; i<dupwords.length; i++)
		{
		System.out.print(dupwords[i]+ " ");
		}
	}
	
}

}
