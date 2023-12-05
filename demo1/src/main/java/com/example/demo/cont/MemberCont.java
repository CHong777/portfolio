package com.example.demo.cont;

import com.example.demo.mapper.MemberMapper;
import com.example.demo.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MemberCont {
    @Autowired
    MemberService memberService;
    @Autowired
    MemberMapper memberMapper;
    @RequestMapping(value = "/signOut",  method = RequestMethod.POST)
    public Object signOut() throws Exception {
        try{
            return memberService.test();
        } catch(Exception e){
            log.info("[EXCEPTION] " +  e);
            return -1;
        }
    }

    @RequestMapping(value = "/hello",  method = RequestMethod.GET)
    public String hello() throws Exception {
        try{
            return "why String return";
        } catch(Exception e){
            log.info("[EXCEPTION] " +  e);
            return "1";
        }
    }

    @RequestMapping(value = "/hello2",  method = RequestMethod.GET)
    public Object hello2() throws Exception {
        try{
            return memberMapper.findAll();
        } catch(Exception e){
            log.info("[EXCEPTION] " +  e);
            return null;
        }
    }
}