
public class LargestArraySmallest {

	public static void main(String[] args) {
		
		int numbers[]= {0,-8,5,890909,87,-987};
		
		int Largest = numbers[0];
		int Smallest = numbers[0];
		
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i]>Largest)
			{
				Largest =numbers[i];
			}
			else if (numbers[i]<Smallest)
			{
				Smallest = numbers[i];
			}
		}
		
		System.out.println(Largest);
		System.out.println(Smallest);
		
	}

}
