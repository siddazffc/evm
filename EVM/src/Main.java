

public class Main {

	public static void main(String[] args) 
	{		
		
		Evm evm = new Evm();
		evm.switchOn();
		
		evm.bu.candidlist.addCandidate("BJP");
		evm.bu.candidlist.addCandidate("Congress");
		evm.bu.candidlist.addCandidate("AAP");
					
		evm.bu.candidlist.displayCandidates();
		
		evm.cu.ballot.openVoting();
		
		evm.bu.candidButton.castVote(0);
		evm.bu.candidButton.castVote(0);
		evm.bu.candidButton.castVote(2);
		evm.bu.candidButton.castVote(1);
		evm.bu.candidButton.castVote(0);
		evm.bu.candidButton.castVote(2);
		evm.bu.candidButton.castVote(0);
		evm.cu.closeButton.closeVoting();
		
		evm.bu.candidButton.castVote(2);
		evm.bu.candidButton.castVote(1);
		
		
		
		evm.cu.totalButton.getTotalVoters();
		
		evm.cu.resultButton.displayResult();
		
		evm.cu.clearButton.clearVoting();
		
		
	}

}
