package com.minsait.onesait.microservice.repository;

import java.util.List;

import com.minsait.onesait.microservice.model.AirportsdataWrapper;
import com.minsait.onesait.platform.client.springboot.aspect.IoTBrokerQuery;
import com.minsait.onesait.platform.client.springboot.aspect.IoTBrokerRepository;
import com.minsait.onesait.platform.comms.protocol.enums.SSAPQueryType;

@IoTBrokerRepository("airportsdata")
public interface AirportsdataRepository {

	@IoTBrokerQuery(value = "SELECT r FROM airportsdata as r", queryType = SSAPQueryType.SQL)
	List<AirportsdataWrapper> findAll();
}
