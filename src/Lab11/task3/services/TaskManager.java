package Lab11.task3.services;

import Lab11.task3.errors.TaskNotFoundException;
import Lab11.task3.models.BaseTask;
import Lab11.task3.models.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskManager {
    private List<BaseTask> tasks;
    private int taskCounter = 1;

    public TaskManager(){
        tasks = new ArrayList<>();
    }

    public void addTask(BaseTask task){
        tasks.add(task);
    }

    public void listTasks(){
        if(tasks.isEmpty()){
            System.out.println("✅No tasks found. ");
        }else {
            for (BaseTask task : tasks){
                System.out.println(task);
            }
        }
    }

    public void deleteTask (int id) throws TaskNotFoundException {
        Optional<BaseTask> task = tasks.stream().filter(t -> t.getId() == id).findFirst();
        if (task.isPresent()){
            tasks.remove(task.get());
            System.out.println("🗑️Task removed successfully.");
        }else {
            throw new TaskNotFoundException("Task with ID " + id + " noy found. ");
        }
    }

    public void markTaskAsDone(int id) throws TaskNotFoundException {
        for (BaseTask task : tasks){
            if (task.getId() == id) {
                task.markAsDone();
                System.out.println("✅Task marked as done.");
                return;
            }
        }
        throw new TaskNotFoundException("Task with ID " + id + " not found.");
    }

    public int generateTaskId(){
        return taskCounter++;
    }
}