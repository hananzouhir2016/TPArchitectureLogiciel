import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
	public static void main(String[] args) throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("org/ensa/confi/SpringConfig.xml");			
			//Dao dao = ctx.getBean("daoImpl", Dao.class);
			//dao.ajoutPersonne(new Transactione());
			Job job = (Job) ctx.getBean("importTransaction");
	        JobLauncher jobLauncher = (JobLauncher) ctx.getBean("jobLauncher"); 
			JobExecution execution = jobLauncher.run(job, new JobParameters());
			System.out.println("Completion Status : " + execution.getStatus());
}
}
