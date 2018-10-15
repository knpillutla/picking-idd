package com.threedsoft.picking.dto.requests;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.threedsoft.util.dto.WMSRequestDTO;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
@AllArgsConstructor
public class PicklistCreationRequestDTO  extends WMSRequestDTO{
	String busName;
	Integer locnNbr;
	String busUnit;
	String company;
	String division;
	String transName;
	String source;
	String hostName;
	String userId;
	List<Long> orderIdList;
	List<String> orderNbrList;
	Integer numOfOrders;
	String orderSelectionOption; // by area/zone/aisle/pick density/deliveryType(prioriry vs non priority orders)/order date time/ship date time
	String printOption; //byOrder, byPickPathSequence (will not be grouped by order), delivery type(express orders etc)
}