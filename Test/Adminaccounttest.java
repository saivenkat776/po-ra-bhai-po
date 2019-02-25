package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Bean.AdminAccountBean;

class Adminaccounttest {
	AdminAccountBean obj=new AdminAccountBean();
	@Test
	void testSetName() {
		obj.setName("svk");
		assertEquals("svk",obj.getName());
	}
	
	@Test
	void testSetcity() {
		obj.setCity("Hyd");
		assertEquals("Hyd",obj.getCity());
	}

	@Test
	void testSetstate() {
		obj.setState("TEL");
		assertEquals("TEL",obj.getState());
	}
	
	@Test
	void testSetzip() {
		obj.setZip(50054);
		assertEquals(50054,obj.getZip());
	}
	
	@Test
	void testSetbusiness() {
		obj.setBusiness("Auto");
		assertEquals("Auto",obj.getBusiness());
	}
	
	@Test
	void testSetuname() {
		obj.setUname("svk");
		assertEquals("svk",obj.getUname());
	}
	
	@Test
	void testSetstreet() {
		obj.setStreet("hyd");
		assertEquals("hyd",obj.getStreet());
	}
}
