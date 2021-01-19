package com.example.mapper;

import com.example.entity.Desc;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:20
 */
@Repository
public interface DescMapper {
    List<Desc> GetMsgs(String myId,String youId);
    List<Desc> GetMsgsInitDesc(String myId);

    Void SaveDesc(Integer myId, String myMsg,Integer youId, String youMsg, String date,String description);
}