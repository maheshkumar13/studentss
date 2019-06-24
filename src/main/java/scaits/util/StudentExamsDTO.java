package scaits.util;

import java.util.List;

public class StudentExamsDTO {
	
	private List<Object> stuAttempt;
	private String chartTitle;
	private String chartSubTitle;
	private List<String> categories;
	private List<Object> data;
	
	private List<String> offlineExamCategories;
	private List<String> onlineExamCategories;
	
	private List<Object> examData;
	private List<Object> onlineExamData;
	
	private ChartDTO chartDTO;
	
	public String getChartTitle() {
		return chartTitle;
	}

	public void setChartTitle(String chartTitle) {
		this.chartTitle = chartTitle;
	}

	public String getChartSubTitle() {
		return chartSubTitle;
	}

	public void setChartSubTitle(String chartSubTitle) {
		this.chartSubTitle = chartSubTitle;
	}

	public List<String> getCategories() {
		return categories;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

	public List<Object> getData() {
		return data;
	}

	public void setData(List<Object> data) {
		this.data = data;
	}

	

	public List<String> getOfflineExamCategories() {
		return offlineExamCategories;
	}

	public void setOfflineExamCategories(List<String> offlineExamCategories) {
		this.offlineExamCategories = offlineExamCategories;
	}

	public List<String> getOnlineExamCategories() {
		return onlineExamCategories;
	}

	public void setOnlineExamCategories(List<String> onlineExamCategories) {
		this.onlineExamCategories = onlineExamCategories;
	}

	public List<Object> getExamData() {
		return examData;
	}

	public void setExamData(List<Object> examData) {
		this.examData = examData;
	}

	public List<Object> getOnlineExamData() {
		return onlineExamData;
	}

	public void setOnlineExamData(List<Object> onlineExamData) {
		this.onlineExamData = onlineExamData;
	}

	public List<Object> getStuAttempt() {
		return stuAttempt;
	}

	public void setStuAttempt(List<Object> stuAttempt) {
		this.stuAttempt = stuAttempt;
	}

	public ChartDTO getChartDTO() {
		return chartDTO;
	}

	public void setChartDTO(ChartDTO chartDTO) {
		this.chartDTO = chartDTO;
	}


}
