package org.ordermgmt;

import javax.jws.WebService;
import javax.ws.rs.Path;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;

/**
 * Web service implementation.
 * 
 * @author Derek
 */
@WebService(endpointInterface = "org.ordermgmt.IProcessOrder", serviceName = "ProcessOrder")
@Path("/fulfillment")
public class ProcessOrderImpl implements IProcessOrder {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ordermgmt.IProcessOrder#processOrder(org.ordermgmt.Order)
	 */
	@POST
	@Produces("application/json,application/xml")
	public Order processOrder(Order order) {
		return order;
	}
}