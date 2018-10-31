package com.threedsoft.picking.dto.requests;

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
public class PickSearchRequestDTO  extends WMSRequestDTO{
	String busName;
	Integer locnNbr;
	String batchNbr;
	String busUnit;
	String company;
	String division;
	String locnBrcd;
	String itemBrcd;
	String fromContainer;
	String toContainer;
	Long orderId;
	String orderNbr;
	String packageNbr;
}