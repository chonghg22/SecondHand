package com.project.secondhand.vo;

import org.springframework.web.multipart.MultipartFile;

public class StoreList {
	private int boardNo;
	private int storeNo;
	private String storeName;
	private String storeAddr;
	private String storePhone;
	private String storeEmail;
	private String categoryName;
	private String boardTitle;
	private String boardContent;
	private String boardDate;
	private String boardPicNameOne;
	private String boardPicNameTwo;
	private String boardPicNameThree;
	private String boardPicNameFour;
	private String boardPicNameFive;
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public int getStoreNo() {
		return storeNo;
	}
	public void setStoreNo(int storeNo) {
		this.storeNo = storeNo;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStoreAddr() {
		return storeAddr;
	}
	public void setStoreAddr(String storeAddr) {
		this.storeAddr = storeAddr;
	}
	public String getStorePhone() {
		return storePhone;
	}
	public void setStorePhone(String storePhone) {
		this.storePhone = storePhone;
	}
	public String getStoreEmail() {
		return storeEmail;
	}
	public void setStoreEmail(String storeEmail) {
		this.storeEmail = storeEmail;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}
	public String getBoardPicNameOne() {
		return boardPicNameOne;
	}
	public void setBoardPicNameOne(String boardPicNameOne) {
		this.boardPicNameOne = boardPicNameOne;
	}
	public String getBoardPicNameTwo() {
		return boardPicNameTwo;
	}
	public void setBoardPicNameTwo(String boardPicNameTwo) {
		this.boardPicNameTwo = boardPicNameTwo;
	}
	public String getBoardPicNameThree() {
		return boardPicNameThree;
	}
	public void setBoardPicNameThree(String boardPicNameThree) {
		this.boardPicNameThree = boardPicNameThree;
	}
	public String getBoardPicNameFour() {
		return boardPicNameFour;
	}
	public void setBoardPicNameFour(String boardPicNameFour) {
		this.boardPicNameFour = boardPicNameFour;
	}
	public String getBoardPicNameFive() {
		return boardPicNameFive;
	}
	public void setBoardPicNameFive(String boardPicNameFive) {
		this.boardPicNameFive = boardPicNameFive;
	}
	@Override
	public String toString() {
		return "StoreAndStoreBoardAndBoardPic [boardNo=" + boardNo + ", storeNo=" + storeNo + ", storeName=" + storeName
				+ ", storeAddr=" + storeAddr + ", storePhone=" + storePhone + ", storeEmail=" + storeEmail
				+ ", categoryName=" + categoryName + ", boardTitle=" + boardTitle + ", boardContent=" + boardContent
				+ ", boardDate=" + boardDate + ", boardPicNameOne=" + boardPicNameOne + ", boardPicNameTwo="
				+ boardPicNameTwo + ", boardPicNameThree=" + boardPicNameThree + ", boardPicNameFour="
				+ boardPicNameFour + ", boardPicNameFive=" + boardPicNameFive + "]";
	}
	
}
