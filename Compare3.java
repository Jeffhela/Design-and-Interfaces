
public class Compare3 
{
	public static Comparable largest (Comparable first, Comparable second, Comparable third)
	{
		if (first.compareTo(second) > 0 && first.compareTo(third) > 0)
		{
			return first;
		}
		else if (second.compareTo(first) > 0 && second.compareTo(third) > 0)
		{
			return second;
		}
		else
		{
			return third;
		}
	}
	//static method largest. Method largest should take three Comparable
	// parameters and return the largest of the three (so its return type will also be Comparable). 
}
