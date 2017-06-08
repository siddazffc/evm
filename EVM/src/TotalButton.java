public class TotalButton extends Button
{
	//CU cu = new CU();
	int count;
	
	public void getTotalVoters()
	{
		System.out.println("The Total Number of Voters:");
		for (Candidate candid : CU.map.keySet())
		{
			count += CU.map.get(candid);
		}
		System.out.println(count);
	}
}