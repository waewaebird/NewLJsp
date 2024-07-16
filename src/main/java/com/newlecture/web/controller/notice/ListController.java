package com.newlecture.web.controller.notice;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;
import com.newlecture.web.service.jdbc.JDBCNoticeService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ListController implements Controller {
    private NoticeService noticeService;

    public void setNoticeService(NoticeService noticeService) {
        this.noticeService = noticeService;
    }
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView("notice.list");
        List<Notice> list = noticeService.getList(1, "TITLE", "");
        mv.addObject("list",list);

        return mv;
    }

}
