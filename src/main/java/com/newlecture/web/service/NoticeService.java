package com.newlecture.web.service;

import com.newlecture.web.entity.Notice;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface NoticeService {
    List<Notice> getList(int page, String field, String query) throws ClassNotFoundException, SQLException;
    int getCount() throws ClassNotFoundException, SQLException;

    int insert(Notice notice) throws SQLException, ClassNotFoundException;

    int update(Notice notice) throws SQLException, ClassNotFoundException;

    int delete(int id) throws ClassNotFoundException, SQLException;
}
