package com.manager.controller;

import com.manager.entity.*;
import com.manager.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/indexController")
public class IndexController {

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private AttendanceService attendanceService;

    @Autowired
    private DatumnService datumnService;

    @Autowired
    private StaffService staffService;

    @Autowired
    private ScheduleInfoService scheduleInfoService;


    @RequestMapping("login")
    public String login(){ return "login"; }

    @RequestMapping("index")
    public void  index( HttpServletRequest request,HttpServletResponse response){
       try {
           Map<String, Object> map = new HashMap<String, Object>();
           String workno = request.getParameter("workno");
           String pasword = request.getParameter("pasword");
           if (workno != null && workno != null && pasword != null && pasword != "") {
               map.put("workno", workno);
               map.put("pasword", pasword);
               request.getSession().setAttribute("workno",workno);
               request.setAttribute("pasword",pasword);
               List<UserInfoEntity> list = userInfoService.findOne(map);

               if (list.size() == 0) {
                   request.setAttribute("msg", "工号或密码不正确");
               } else {
                   request.getSession().setAttribute("list", list);
               }
               response.sendRedirect("/jsp/first.jsp");
           }
       }catch( Exception e ) {
        e.printStackTrace();
       }

    }
    @RequestMapping("user")
    public void user(HttpServletRequest request,HttpServletResponse response){
        try {
            request.getRequestDispatcher("/jsp/user.jsp").forward(request, response);
            request.setAttribute("hstau",1);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    @RequestMapping("first")
    public void first(HttpServletRequest request,HttpServletResponse response){
        try {
            request.getRequestDispatcher("/jsp/first.jsp").forward(request, response);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @RequestMapping("querySchedule")
    public void queryOneS(HttpServletRequest request,HttpServletResponse response) {
        String workno = (String)request.getSession().getAttribute("workno");
        String pasword = (String)request.getSession().getAttribute("pasword");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("workno", workno);
        map.put("pasword", pasword);

        List<ScheduleInfoEntity> userList = scheduleInfoService.findOne(map);
        try{
            request.setAttribute("info",userList);
            request.setAttribute("hstau",2);
            request.getRequestDispatcher("/jsp/user.jsp").forward(request,response);
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    @RequestMapping("queryAllatt")
    public void queryAllatt(HttpServletRequest request,HttpServletResponse response) {

       try{
           List<AttendanceEntity> userList = attendanceService.findAll();
           request.setAttribute("info",userList);
           request.getRequestDispatcher("/jsp/attendance.jsp").forward(request,response);
       }catch (Exception e){
           e.printStackTrace();
       }


    }

    @RequestMapping("queryAlldatum")
    public ModelAndView queryAlldatum() {
        ModelAndView modelAndView = new ModelAndView("datum");
        List<DatumEntity> userList = datumnService.findAll();
        modelAndView.addObject("info", userList);
        return modelAndView;
    }

    @RequestMapping("queryAllstaff")
    public ModelAndView queryAllstaff() {
        ModelAndView modelAndView = new ModelAndView("staff");
        List<StaffEntity> userList = staffService.findAll();
        modelAndView.addObject("info", userList);
        return modelAndView;
    }

    @RequestMapping("queryAllHR")
    public void queryAllHR(HttpServletRequest request,HttpServletResponse response) {
        List<UserInfoEntity> userList = userInfoService.findAll();
        if(userList.size()!=0){
            try{
                request.setAttribute("info",userList);
                request.getRequestDispatcher("/jsp/HR.jsp").forward(request,response);
            }catch (Exception e){
                e.printStackTrace();
            }

        }

    }

}