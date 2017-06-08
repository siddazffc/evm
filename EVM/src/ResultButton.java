public class ResultButton extends Button 
{

	public void displayResult()
	{
		System.out.println("The Result:");
		for (Candidate candid : CU.map.keySet())
		{
			System.out.println(candid.getName()+" "+CU.map.get(candid));
		}
	}
}