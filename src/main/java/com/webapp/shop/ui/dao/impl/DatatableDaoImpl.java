package com.webapp.shop.ui.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.webapp.shop.ui.dao.DatatableDao;
import com.webapp.shop.ui.model.CartRest;
import com.webapp.shop.ui.model.DataTable;
import com.webapp.shop.ui.model.DataTableOrder;
import com.webapp.shop.ui.model.DataTableResponse;
import com.webapp.shop.ui.model.MyDataTable;

@Repository
public class DatatableDaoImpl implements DatatableDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public DataTableResponse getAllUsers(DataTable dataTable, String search, String filter, Integer limit,
			Integer offset) {

		String serVal = dataTable.getSearch().getValue().toString();
		
		Integer start=dataTable.getStart().intValue();
		
		

		DataTableResponse response = new DataTableResponse();

		String orderBy = "";
		String limit2 = "";
		String offset2 = "";

		if (dataTable != null) {
			for (DataTableOrder order : dataTable.getOrder()) {
				switch (order.getColumn()) {
				case 0:
					orderBy += "name ";
					break;
				case 1:
					orderBy += "department ";
					break;
				case 2:
					orderBy += "price ";
					break;
				case 3:
					orderBy += "created_at ";
					break;
				case 4:
					orderBy += "updated_at ";
					break;
				case 5:
					orderBy += "is_active ";
					break;
				default:
					orderBy += "id ";
					break;
				}
				orderBy += order.getDir() + " ,";
			}
		}
		if (orderBy.length() > 0) {
			orderBy = " order by " + orderBy.substring(0, orderBy.length() - 1);
		}

		if (dataTable.getLength() != null) {
			limit2 = " LIMIT " + dataTable.getLength();
		}

		if (dataTable.getStart() != null) {
			offset2 = " OFFSET " + dataTable.getStart();
		}

		String qu = "";
		String totalquery="select count(*) from mytable;";

		if (serVal.length() > 0) {
			qu="select * from mytable m where name like '%" + serVal + "%'"+ orderBy+" "+limit2+ "offset "+start;
			totalquery="select count(*) from mytable where name like '%"+  serVal + "%';";
		} else {
			qu = "select * from mytable " + orderBy +" "+limit2+ "offset "+start;
			totalquery="select count(*) from mytable;";
		}
		
		
		List<MyDataTable> productList = jdbcTemplate.query(qu, BeanPropertyRowMapper.newInstance(MyDataTable.class));
		
		Integer totalEntries= jdbcTemplate.queryForObject(totalquery, Integer.class);
		

		List<Object> dataT = new ArrayList<Object>();

		for (MyDataTable el : productList) {
			List<Object> dataTableRow = new ArrayList<Object>();

			dataTableRow.add(el.getName());
			dataTableRow.add(el.getDepartment());
			dataTableRow.add(el.getPrice());
			dataTableRow.add(el.getCreatedAt());
			dataTableRow.add(el.getUpdatedAt());
			dataTableRow.add(el.isIs_active());

			dataT.add(dataTableRow);
		}
		
		

		response.setDraw(dataTable != null ? dataTable.getDraw() : 1);
		response.setRecordsFiltered(totalEntries > 0 ? totalEntries : 0);
		response.setRecordsTotal(totalEntries > 0 ? totalEntries : 0);
		response.setData(dataT);

		return response;
	}
}
