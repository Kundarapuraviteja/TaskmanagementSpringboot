package  com.springapptry01.springbootapptry01.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Task {
    @Id
    Long taskId;
    String taskHolderName;
    String taskDate;
    String taskName;
    String taskStatus;

    
  public Long getTaskId() {
    return taskId;
  }

  public void setTaskId(Long taskId) {
    this.taskId= taskId;
  }

  public String getTaskHolderName() {
    return taskHolderName;
  }

  public void setTaskHolderName(String taskHolderName) {
    this.taskHolderName = taskHolderName;
  }
  public String getTaskDate() {
    return taskDate;
  }

  public void setTaskDate(String taskDate) {
    this.taskDate = taskDate;
  }

 

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }

  public String getTaskName() {
    return taskName;
  }

  public String getTaskStatus() {
    return taskStatus;
  }

  public void setTaskStatus(String taskStatus) {
    this.taskStatus = taskStatus;
  }

    
}