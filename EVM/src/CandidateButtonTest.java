import static org.junit.Assert.*;

import org.junit.Test;

public class CandidateButtonTest
{
	CandidateButton candidButton = new CandidateButton();
	@Test
	public void testIsVotingOpen()
	{
		assertEquals(0, candidButton.castVote(0));
		
	}

}