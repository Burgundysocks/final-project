package com.t1.tripfy.mapper.chat;

import org.apache.ibatis.annotations.Mapper;

import com.t1.tripfy.domain.dto.chat.ChatRoomDTO;

@Mapper
public interface ChatRoomMapper {
	//chat_room_idx로 행 가져오기
	ChatRoomDTO selectRowByChatRoomIdx(Long chatRoomIdx);
	
	//c

	/**
	 * <p><strong>INSERT</strong> : chat_room insert, PK 가져오기
	 * <p>인수 ChatRoomDTO는 chatRoomTitle, packagenum, regdate이 초기화돼있어야 함
	 * <br>null로 초기화 가능
	 * <p>생성된 PK는 인수로 넘겨진 ChatRoomDTO 객체에 담겨옴
	 * @param dto : chatRoomTitle, packagenum, regdate을 넘기고 PK를 받아오는 역할
	 * */
	Integer createRoom(ChatRoomDTO dto);
	
	//u
	/**
	 * <p><strong>UPDATE</strong> : 채팅방 종료시키기
	 * <p><strong>한번 종료시킨 채팅방은 다시 열 수 없어야 함</strong>
	 * @param chatRoomIdx : 목표 채팅방 PK
	 * @return 영향받은 행 개수
	 */
	Integer updateIsTerminated(Long chatRoomIdx);
}
