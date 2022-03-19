package com.webapp.shop.ui.dao;


import com.webapp.shop.ui.model.DataTable;
import com.webapp.shop.ui.model.DataTableResponse;
import com.webapp.shop.ui.model.MyDataTable;

public interface DatatableDao {

	DataTableResponse getAllUsers(DataTable dataTable, String search, String filter, Integer limit, Integer offset);

	//DataTableResponse getAllUsers(String search, String filter, Integer limit, Integer offset);

}
