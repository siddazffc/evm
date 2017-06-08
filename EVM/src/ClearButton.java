public class ClearButton extends Button
{
	public void clearVoting()
	{
		CU.map.clear();
		CandidateList.candidates.clear();
	}
}