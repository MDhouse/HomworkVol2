import java.util.List;

import domain.Seller;
import repositories.IRepositoryCatalog;
import repositories.impl.DummyRepositoryCatalog;

public class Main {

	public static void main(String[] args) {
		IRepositoryCatalog catalog = new DummyRepositoryCatalog();
		List<Seller> admins =
		catalog.getSelleres().withDepartament("Tomek");
		// TODO Auto-generated method stub

	}

}