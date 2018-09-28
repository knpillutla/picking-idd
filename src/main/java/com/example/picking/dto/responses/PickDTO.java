package com.example.picking.dto.responses;

import com.example.picking.dto.BaseDTO;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
@AllArgsConstructor
public class PickDTO  extends BaseDTO{
	Long id;
	Long orderLineId;
	String batchNbr;
	String busName;
	Integer locnNbr;
	String busUnit;
	String company;
	String division;
	String locnBrcd;
	String itemBrcd;
	Integer qty;
	Integer pickedQty;
	String fromContainer;
	String toContainer;
	Integer statCode;
	Long orderId;
	String orderNbr;
	String packageNbr;
	Integer orderLineNbr;
	String transName;
	String source;
	String hostName;
	String userId;
}
