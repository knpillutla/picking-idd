package com.threedsoft.picking.dto.events;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.threedsoft.util.dto.events.WMSEvent;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
public class LowPickEvent extends WMSEvent {
	String area;
	String zone;
	String aisle;
	String workArea;
	String workZone;
	String workAisle;
	String userId;

	public LowPickEvent(String busName, Integer locnNbr, String busUnit, String company, String division, String area,
			String zone, String userId, String serviceName, Map headerMap) {
		super("LowPickEvent", busName, locnNbr, company, division, busUnit, "", "", serviceName, null);
		this.area = area;
		this.zone = zone;
		this.userId = userId;
		if (headerMap != null)
			this.setHeaderMap(headerMap);
	}
}
