package com.example.service;

import com.example.entity.Desc;
import com.example.mapper.DescMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class DescService {
    @Autowired
    DescMapper descMapper;

    public List<Desc> GetMsgs(String myId, String youId) {
        return descMapper.GetMsgs(myId, youId);
    }

    public List<Desc> GetMsgsInitDesc(String myId) {
        return descMapper.GetMsgsInitDesc(myId);
    }

    public Void SaveDesc(Integer myId, String myMsg, Integer youId, String youMsg, String date, String description) {
        return descMapper.SaveDesc(myId, myMsg, youId, youMsg, date, description);
    }


}