package co.com.bancolombia.model.task.gateways;

import co.com.bancolombia.model.task.Task;
import reactor.core.publisher.Mono;

import java.util.List;

public interface TaskRepository {
    Mono<Task> saveTask(Task task);
    Mono<List<Task>> findAll();

}
