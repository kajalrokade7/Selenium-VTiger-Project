package com.crm.VTiger;

import org.testng.annotations.Test;

import com.crm.BaseClass.BaseVT;
import com.crm.Pom.HomePage;

public class HomePageTestcase extends BaseVT
{
@Test
public void hPageTestcase() throws InterruptedException
{
	HomePage hp = new HomePage(driver);
	//hp.headerElements();
	hp.calendar();
	hp.leads();
	hp.organization();
	hp.contacts();
	hp.opportunities();
	hp.product();
	hp.documents();
	hp.email();
	hp.trTickets();
	hp.dashboard();
	hp.moreOpt();
}
}
