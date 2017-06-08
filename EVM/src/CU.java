import java.util.HashMap;

public class CU
{
	
	static HashMap<Candidate, Integer> map = new HashMap<Candidate, Integer>();
	BallotButton ballot = new BallotButton();
	ResultButton resultButton = new ResultButton();
	ClearButton clearButton = new ClearButton();
	CloseButton closeButton = new CloseButton();
	TotalButton totalButton = new TotalButton();
	
	public void pressBallotButton()
	{
		ballot.setPressed(true);
	}
	
	public void addVote(Candidate candid, int count)
	{
		int value;
		if(map.get(candid) != null)
			value = map.get(candid) + count;
		else
			value = count;
		map.put(candid, value);
	}

	public void switchOn()
	{
		System.out.println("The CU switched on");
	}

	
}