package com.project.secondhand.vo;

public class StoreBoard {
	private int boardNo;
	private int storeNo;
	private String categoryName;
	private String boardTitle;
	private String boardContent;
	private int boardDate;
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
	public int getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(int boardDate) {
		this.boardDate = boardDate;
	}
	@Override
	public String toString() {
		return "StoreBoard [boardNo=" + boardNo + ", storeNo=" + storeNo + ", categoryName=" + categoryName
				+ ", boardTitle=" + boardTitle + ", boardContent=" + boardContent + ", boardDate=" + boardDate + "]";
	}
	
	
}
