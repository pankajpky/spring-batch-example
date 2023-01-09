package com.techie.springbatchexample.controller;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionException;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/load")
public class LoadController {

	@Autowired
	JobLauncher jobLauncher;

	@Autowired
	Job job;

	@GetMapping
	public BatchStatus load() throws JobParametersInvalidException, JobExecutionException {
		JobExecution jobExecution = jobLauncher.run(job, new JobParameters());
		System.out.println("JobExcecuton started..." + jobExecution.getStatus());
		System.out.println("batch is running.............");

		while (jobExecution.isRunning()) {
			System.out.println("...................");
		}

		return jobExecution.getStatus();

	}

}
