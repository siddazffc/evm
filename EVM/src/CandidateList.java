
import java.util.ArrayList;

public class CandidateList
{
	static ArrayList<Candidate> candidates = new ArrayList<Candidate>();
	
	public CandidateList()
	{
		
	}
	
	public void addCandidate(String string)
	{
		candidates.add(new Candidate(string));
	}
	
	public ArrayList<Candidate> getCandidates() {
		return candidates;
	}

	public void setCandidates(ArrayList<Candidate> candidates) {
		this.candidates = candidates;
	}

	public void displayCandidates()
	{
		System.out.println("The Candidates are ");
		for (Candidate candidate : candidates)
		{
			System.out.println(candidate.getName()+" "+candidates.indexOf(candidate));
		}
		System.out.println("To vote press the number");
	}
}