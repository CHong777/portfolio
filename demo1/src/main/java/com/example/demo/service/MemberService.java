package com.example.demo.service;

import com.example.demo.domain.Member;
import com.example.demo.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class MemberService {

    @Autowired
    MemberMapper memberMapper;
    public Member test(){
        return memberMapper.findAll();
    }
}