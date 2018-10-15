package com.threedsoft.picking.dto.events;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.threedsoft.picking.dto.responses.PicklistResourceDTO;
import com.threedsoft.util.dto.events.ExceptionEvent;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
public class PicklistCreationFailureEvent extends ExceptionEvent{
	public PicklistCreationFailureEvent(PicklistResourceDTO req, String serviceName, String errorMsg) {
		this(req, serviceName, errorMsg, null);
	}

	public PicklistCreationFailureEvent(PicklistResourceDTO req, String serviceName, String errorMsg, Exception exObj) {
		this(req, serviceName, errorMsg, exObj, null);
	}

	public PicklistCreationFailureEvent(PicklistResourceDTO req, String serviceName, String errorMsg, Exception exObj,
			Map headerMap) {
		super("PicklistCreationFailureEvent", req.getBusName(), req.getLocnNbr(), req.getCompany(), req.getDivision(),
				req.getBusUnit(), "", "", serviceName, req, errorMsg, exObj);
		if (headerMap != null)
			this.setHeaderMap(headerMap);
	}
}
