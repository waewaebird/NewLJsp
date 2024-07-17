package com.newlecture.web.controller.api;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController("apiNoticeController")
@RequestMapping("/api/notice/")
public class NoticeController {

    @Autowired
    private NoticeService service;

    @RequestMapping("list")
    public List<Notice> list() throws SQLException, ClassNotFoundException {
        List<Notice> list = service.getList(1, "title", "");
        return list;
    } // NoticeController noticeController = new NoticeController == <bean id="noticeController" class="...NoticeController />
}
