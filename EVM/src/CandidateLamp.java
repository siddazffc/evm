public class CandidateLamp extends Lamp
{
	CandidateList candidlist = new CandidateList();
	
	public CandidateLamp()
	{
		
	}
	
	public void on(int index)
	{
		System.out.print("for "+candidlist.getCandidates().get(index).getName()+"\n");
	}
}