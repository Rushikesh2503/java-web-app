package com.webapp.shop.ui.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "draw", "recordsTotal", "recordsFiltered", "data" })
public class DataTableResponse {

	@JsonProperty("draw")
	private Integer draw;
	@JsonProperty("recordsTotal")
	private Integer recordsTotal;
	@JsonProperty("recordsFiltered")
	private Integer recordsFiltered;
	@JsonProperty("data")
	private List<Object> data = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	

	public DataTableResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	@JsonProperty("draw")
	public Integer getDraw() {
		return draw;
	}

	@JsonProperty("draw")
	public void setDraw(Integer draw) {
		this.draw = draw;
	}

	@JsonProperty("recordsTotal")
	public Integer getRecordsTotal() {
		return recordsTotal;
	}

	@JsonProperty("recordsTotal")
	public void setRecordsTotal(Integer recordsTotal) {
		this.recordsTotal = recordsTotal;
	}

	@JsonProperty("recordsFiltered")
	public Integer getRecordsFiltered() {
		return recordsFiltered;
	}

	@JsonProperty("recordsFiltered")
	public void setRecordsFiltered(Integer recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}

	@JsonProperty("data")
	public List<Object> getData() {
		return data;
	}

	@JsonProperty("data")
	public void setData(List<Object> data) {
		this.data = data;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}