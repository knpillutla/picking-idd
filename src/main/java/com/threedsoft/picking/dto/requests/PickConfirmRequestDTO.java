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
public class PickConfirmRequestDTO extends WMSRequestDTO{
	public Long id;
	public Long orderId;
	public String batchNbr;
	public String busName;
	public Integer locnNbr;
	public String busUnit;
	public String company;
	public String division;
	public String orderNbr;
	public String locnBrcd;
	public String itemBrcd;
	public Integer qtyPicked;
	public String toContainer;
	public String userId;
}
