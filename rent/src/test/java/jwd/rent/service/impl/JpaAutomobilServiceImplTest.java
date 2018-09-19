package jwd.rent.service.impl;

import org.junit.Assert;
import org.junit.Test;
import jwd.rent.model.Automobil;
import jwd.rent.model.Kompanija;

public class JpaAutomobilServiceImplTest {
	
	@Test
	public void testFindOne() {
		Kompanija k1 = new Kompanija();
		k1.setNaziv("SuRent");
		k1.setAdresa("Balzakova 1");
		k1.setTelefon("024/151-363");
		
		Automobil a1 = new Automobil();
		a1.setModel("Nissan Prairie");
		a1.setRegistracija("SU82404");
		a1.setGodiste(1991);
		a1.setPotrosnja(10.3);
		a1.setKompanija(k1);
		
		Assert.assertNotNull(a1);
		Assert.assertEquals("Nissan Prairie", a1.getModel());
		
	}


	@Test
	public void testFindByKompanijaId() {
		Kompanija k1 = new Kompanija();
		k1.setNaziv("SuRent");
		k1.setAdresa("Balzakova 1");
		k1.setTelefon("024/151-363");
		
		Automobil a1 = new Automobil();
		a1.setModel("Nissan Prairie");
		a1.setRegistracija("SU82404");
		a1.setGodiste(1991);
		a1.setPotrosnja(10.3);
		a1.setKompanija(k1);
		
		Assert.assertNotNull(a1);
		Assert.assertEquals(k1.getId(), a1.getKompanija().getId());
	}


}
