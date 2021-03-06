package com.project.secondhand.vo;

public class ChatMessage {
	private int chatNo;
	private int sendId;
	private String sendNickName;
	private String sendEmail;
	private String roomNo;
	private String chatMessage;
	private String chatDate;
	public int getChatNo() {
		return chatNo;
	}
	public void setChatNo(int chatNo) {
		this.chatNo = chatNo;
	}
	public int getSendId() {
		return sendId;
	}
	public void setSendId(int sendId) {
		this.sendId = sendId;
	}
	public String getSendNickName() {
		return sendNickName;
	}
	public void setSendNickName(String sendNickName) {
		this.sendNickName = sendNickName;
	}
	public String getSendEmail() {
		return sendEmail;
	}
	public void setSendEmail(String sendEmail) {
		this.sendEmail = sendEmail;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getChatMessage() {
		return chatMessage;
	}
	public void setChatMessage(String chatMessage) {
		this.chatMessage = chatMessage;
	}
	public String getChatDate() {
		return chatDate;
	}
	public void setChatDate(String chatDate) {
		this.chatDate = chatDate;
	}
	@Override
	public String toString() {
		return "ChatMessage [chatNo=" + chatNo + ", sendId=" + sendId + ", sendNickName=" + sendNickName
				+ ", sendEmail=" + sendEmail + ", roomNo=" + roomNo + ", chatMessage=" + chatMessage + ", chatDate="
				+ chatDate + "]";
	}
}
