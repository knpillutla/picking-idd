package com.threedsoft.picking.dto.events;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.threedsoft.picking.dto.responses.PicklistResourceDTO;
import com.threedsoft.util.dto.events.WMSEvent;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
public class PicklistCreatedEvent extends WMSEvent{
	public PicklistCreatedEvent(PicklistResourceDTO resourceDTO, String serviceName) {
		this(resourceDTO, serviceName, null);
	}

	public PicklistCreatedEvent(PicklistResourceDTO resourceDTO, String serviceName, Map headerMap) {
		super("PicklistCreatedEvent", resourceDTO.getBusName(), resourceDTO.getLocnNbr(), resourceDTO.getCompany(),
				resourceDTO.getDivision(), resourceDTO.getBusUnit(), "", "", serviceName,
				resourceDTO);
		if (headerMap != null)
			this.setHeaderMap(headerMap);
	}
}
