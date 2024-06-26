package com.t1.tripfy.mapper.manager;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.t1.tripfy.domain.dto.ManagerDTO;
import com.t1.tripfy.domain.dto.TaskMessageDTO;

@Mapper
public interface ManagerMapper {
	ManagerDTO checkKey(String managerKey);

	ArrayList<TaskMessageDTO> getTaskMessageList(TaskMessageDTO task);

	int updateAnswer(TaskMessageDTO task);

	int insertTask(TaskMessageDTO task);

	TaskMessageDTO getLastTaskByUserid(String sendid);

	ArrayList<TaskMessageDTO> getTaskMessageByNum(long boardnum);

	int updateTaskMessageNum(String num);
}
