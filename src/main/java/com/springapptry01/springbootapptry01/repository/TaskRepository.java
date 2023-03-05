package  com.springapptry01.springbootapptry01.repository;

import org.springframework.data.repository.CrudRepository;

import com.springapptry01.springbootapptry01.pojo.Task;



public interface TaskRepository extends CrudRepository<Task, Long> {

}
