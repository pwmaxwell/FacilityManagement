package FacilityPackage;
import java.util.*;

public class Facilities {
	private List<String> details = new ArrayList<String>();
	private List<String> problemHistory = new ArrayList<String>();
	private List<String> Inspections = new ArrayList<String>();
	private int capacity;
	private Date startDate = new Date();
	private Date currentDate = new Date();
	private String name;

	public Facilities(List<String> details, List<String> problemHistory, List<String> inspections, int capacity, Date startDate, String name) {
		this.details = details;
		this.problemHistory = problemHistory;
		Inspections = inspections;
		this.capacity = capacity;
		this.startDate = startDate;
		this.name = name;
	}

	public int getProblemRate() { // This will calculate the rate of problems based on the timeframe of the facility
		int numberOfProblems = problemHistory.size(); 
		int timeFrame = startDate.compareTo(currentDate);
		int problemRate = numberOfProblems / timeFrame;
		return problemRate;
	}

	public List<String> getProblems(){ //returns the problem history list
		return problemHistory; 
	}

	public List<String> getInspections(){// returns Inspections
		return Inspections;
	}


	public List<String> getDetails(){
	    return details;
    }

	public int getCapacity(){ return capacity; }

	public Date getStart(){
		return startDate;
	}

	public String getName(){
		return name;
	}
	
	public void addDetail(String detail) { 
		details.add(detail);			    
	}
	
	public void addProblem(String problem) {
		problemHistory.add(problem);
	}
	
	public void addInspection(String inspection) {
		Inspections.add(inspection);
	}
}
