package isp.bom;

public class ProductOwner implements IPriorizaBacklog {

	@Override
	public void priorizarBacklog() {
		System.out.println("Priorizando backlog com base nas minhas necessidades de negócio");
	}

}
