package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Bean.AgentAccountCreationBean;

class Agentaccounttest {
	AgentAccountCreationBean obj2=new AgentAccountCreationBean();
	@Test
	void testSetname() {
		obj2.setName("svk");
		assertEquals("svk",obj2.getName());
	}
	
	@Test
	void testSetstreet() {
		obj2.setStreet("Hyd");
		assertEquals("Hyd",obj2.getStreet());
	}
	
	@Test
	void testSetcity() {
		obj2.setCity("Hyd");
		assertEquals("Hyd",obj2.getCity());
	}
	
	@Test
	void testSetstate() {
		obj2.setState("TEL");
		assertEquals("TEL",obj2.getState());
	}
	
	@Test
	void testSetzip() {
		obj2.setZip(50054);
		assertEquals(50054,obj2.getZip());
	}
	
	@Test
	void testSetbusiness() {
		obj2.setBusiness("auto");
		assertEquals("auto",obj2.getBusiness());
	}
	
	@Test
	void testSetAccNo() {
		obj2.setAccNo(100005);
		assertEquals(100005,obj2.getAccNo());
	}
	
	@Test
	void testSetuname() {
		obj2.setUname("svk");
		assertEquals("svk",obj2.getUname());
	}
	
	@Test
	void testSetagentname() {
		obj2.setAgentname("agent1");
		assertEquals("agent1",obj2.getAgentname());
	}

}
